package net.shavedog.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@RibbonClient(name = "clientRibbon",configuration = ClientRibbonConfiguration.class)
@EnableFeignClients(basePackages ={"net.shavedog.api.service"})
public class StartAdminService8002 {
    public static void main(String[] args) {
        SpringApplication.run(StartAdminService8002.class, args);
    }
}
