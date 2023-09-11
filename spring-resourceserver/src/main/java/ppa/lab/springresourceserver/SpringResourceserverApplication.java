package ppa.lab.springresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import ppa.lab.springresourceserver.configuration.AppConfig;

@SpringBootApplication
@EntityScan(basePackages = {"ppa.spring.domain.bean"})
@Import({ AppConfig.class })
public class SpringResourceserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringResourceserverApplication.class, args);
    }

}
