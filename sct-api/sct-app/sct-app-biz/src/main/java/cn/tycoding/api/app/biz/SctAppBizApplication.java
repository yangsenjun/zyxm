package cn.tycoding.api.app.biz;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import cn.tycoding.api.admin.api.annotation.EnableSctResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@EnableSctResourceServer
@MapperScan("cn.tycoding.api.app.biz.mapper")
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class SctAppBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SctAppBizApplication.class, args);
    }

}
