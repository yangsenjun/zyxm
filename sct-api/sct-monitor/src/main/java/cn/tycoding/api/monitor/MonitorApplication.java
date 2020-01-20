package cn.tycoding.api.monitor;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 分布式监控中心 SpringBootAdmin 服务端
 *
 * @author tycoding
 * @date 2019-05-21
 */
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class MonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
}
