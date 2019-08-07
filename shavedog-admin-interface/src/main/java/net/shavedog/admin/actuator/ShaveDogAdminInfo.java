package net.shavedog.admin.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * eureka INFO详情界面
 */
@Component
public class ShaveDogAdminInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("company.name","shaveAdmin后台");
        builder.withDetail("service.name","后台微服务");
        builder.withDetail("database","xx数据库");
        builder.withDetail("version","1.0");
        builder.withDetail("author","xx小组");
    }
}
