package ppa.lab.springresourceserver.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ppa.spring.domain.bean.SimplePerson;

@Configuration
@EnableJpaRepositories({"ppa.lab.springresourceserver.model.repository"})
@Import({ SimplePerson.class
        , DatasourceProxyConfig.class})
@ComponentScan(basePackages = {
        "ppa.lab.springresourceserver.model.repository"
        , "ppa.lab.springresourceserver.service"
        , "ppa.spring.domain.bean"
})
public class AppConfig {
}
