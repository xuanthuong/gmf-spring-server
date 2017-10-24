package com.dounets.web.gameserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan({"com.dounets.web.modules.home.controllers"})
@EnableJpaRepositories(value = "com.dounets.web.modules.home.repositories")
@EntityScan(basePackages = "com.dounets.web.modules.home.models")
public class GameServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(GameServerApplication.class, args);
    }
}
