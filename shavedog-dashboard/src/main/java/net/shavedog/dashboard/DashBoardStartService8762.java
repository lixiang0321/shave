package net.shavedog.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * http://localhost:8762/hystrix
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoardStartService8762 {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardStartService8762.class, args);
    }
}
