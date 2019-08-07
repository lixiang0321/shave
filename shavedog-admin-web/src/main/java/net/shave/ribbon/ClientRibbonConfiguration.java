package net.shave.ribbon;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 开启负载
 */
@Configuration
public class ClientRibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        //定义轮询规则
        return new BestAvailableRule();
    }
    @Bean
    public IPing ribbonPing(){
        return new PingUrl();
    }
}
