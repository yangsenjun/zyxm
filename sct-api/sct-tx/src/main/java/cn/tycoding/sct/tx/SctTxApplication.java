package cn.tycoding.sct.tx;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class SctTxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SctTxApplication.class, args);
    }

}
