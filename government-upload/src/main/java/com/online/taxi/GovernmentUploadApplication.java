package com.online.taxi;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @date 2018/8/22
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class GovernmentUploadApplication {

    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue("testQueue");
    }


    public static void main(String[] args) {
        SpringApplication.run(GovernmentUploadApplication.class, args);
    }

}
