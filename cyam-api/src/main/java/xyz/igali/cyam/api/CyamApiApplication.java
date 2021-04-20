package xyz.igali.cyam.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@Configuration
@MapperScan("xyz.igali.cyam.api.mapper")
public class CyamApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyamApiApplication.class, args);
    }

}
