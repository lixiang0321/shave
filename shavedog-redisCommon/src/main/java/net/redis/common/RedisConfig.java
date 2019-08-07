package net.redis.common;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Bean("redisAConfiguration")
    public RedisStandaloneConfiguration getRedisAConfiguration(
            @Value("${spring.redis-a.host}") String hostName ,
            @Value("${spring.redis-a.port}") int port,
            @Value("${spring.redis-a.password}") String password,
            @Value("${spring.redis-a.database}") int database
    ) {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration() ;
        configuration.setHostName(hostName); // 设置Redis主机名称
        configuration.setPort(port); // 设置Redis的访问端口
        configuration.setPassword(RedisPassword.of(password)); // 设置密码
        configuration.setDatabase(database); // 设置数据库索引
        return configuration ;
    }
    @Bean("redisBConfiguration")
    public RedisStandaloneConfiguration getRedisBConfiguration(
            @Value("${spring.redis-b.host}") String hostName ,
            @Value("${spring.redis-b.port}") int port,
            @Value("${spring.redis-b.password}") String password,
            @Value("${spring.redis-b.database}") int database
    ) {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration() ;
        configuration.setHostName(hostName); // 设置Redis主机名称
        configuration.setPort(port); // 设置Redis的访问端口
        configuration.setPassword(RedisPassword.of(password)); // 设置密码
        configuration.setDatabase(database); // 设置数据库索引
        return configuration ;
    }
    @Bean("redisAPoolConfig")
    public GenericObjectPoolConfig getRedisAPoolConfig(
            @Value("${spring.redis-a.lettuce.pool.max-active}") int maxTotal ,
            @Value("${spring.redis-a.lettuce.pool.max-idle}") int maxIdle ,
            @Value("${spring.redis-a.lettuce.pool.min-idle}") int minIdle
    ) {
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig() ;
        poolConfig.setMaxTotal(maxTotal);
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMinIdle(minIdle);
        return poolConfig ;
    }
    @Bean("redisBPoolConfig")
    public GenericObjectPoolConfig getRedisBPoolConfig(
            @Value("${spring.redis-b.lettuce.pool.max-active}") int maxTotal ,
            @Value("${spring.redis-b.lettuce.pool.max-idle}") int maxIdle ,
            @Value("${spring.redis-b.lettuce.pool.min-idle}") int minIdle
    ) {
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig() ;
        poolConfig.setMaxTotal(maxTotal);
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMinIdle(minIdle);
        return poolConfig ;
    }
    @Bean("redisAClientConfiguration")
    public LettuceClientConfiguration getLettuceClientConfigurationA(
            @Autowired GenericObjectPoolConfig redisAPoolConfig
    ) { // 创建Lettuce组件的连接池客户端配置对象
        return LettucePoolingClientConfiguration.builder().poolConfig(redisAPoolConfig).build() ;
    }
    @Bean("redisBClientConfiguration")
    public LettuceClientConfiguration getLettuceClientConfigurationB(
            @Autowired GenericObjectPoolConfig redisBPoolConfig
    ) { // 创建Lettuce组件的连接池客户端配置对象
        return LettucePoolingClientConfiguration.builder().poolConfig(redisBPoolConfig).build() ;
    }
    @Bean("redisAConnectionFactory")
    public RedisConnectionFactory getConnectionFactoryA(
            @Autowired RedisStandaloneConfiguration redisAConfiguration ,
            @Autowired LettuceClientConfiguration redisAClientConfiguration
    ) {
        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(redisAConfiguration,
                redisAClientConfiguration) ;
        return connectionFactory ;
    }
    @Bean("redisBConnectionFactory")
    public RedisConnectionFactory getConnectionFactoryB(
            @Autowired RedisStandaloneConfiguration redisBConfiguration ,
            @Autowired LettuceClientConfiguration redisBClientConfiguration
    ) {
        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(redisBConfiguration,
                redisBClientConfiguration) ;
        return connectionFactory ;
    }
    @Bean("redisTemplate")
    public RedisTemplate<String,Object> getRedisTemplateA(
            @Autowired RedisConnectionFactory redisAConnectionFactory) {
        RedisTemplate<String,Object> template = new RedisTemplate<>() ;
        template.setConnectionFactory(redisAConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());     // Key为字符串类型
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        return template ;
    }
    @Bean("stringRedisTemplate")
    public StringRedisTemplate getStringRedisTemplateA(
            @Autowired RedisConnectionFactory redisAConnectionFactory) {
        StringRedisTemplate template = new StringRedisTemplate() ;
        template.setConnectionFactory(redisAConnectionFactory);
        return template ;
    }
    @Bean("redisTemplateB")
    public RedisTemplate<String,Object> getRedisTemplateB(
            @Autowired RedisConnectionFactory redisBConnectionFactory) {
        RedisTemplate<String,Object> template = new RedisTemplate<>() ;
        template.setConnectionFactory(redisBConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());     // Key为字符串类型
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        return template ;
    }
}
