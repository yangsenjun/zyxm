package cn.tycoding.api.admin.biz;

import cn.tycoding.api.admin.api.annotation.EnableSctResourceServer;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 系统API业务接口 admin
 *
 * @author tycoding
 * @date 2019-05-22
 */
@EnableSctResourceServer
@MapperScan("cn.tycoding.api.admin.biz.mapper")
@EnableFeignClients(basePackages = {"cn.tycoding"})
@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class AdminBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminBizApplication.class, args);
    }
}
