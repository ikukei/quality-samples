package org.tst.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


/**
 *
 * 新版SpringBoot启动时报MongoDB异常，需要禁用MongoDB的自动配置
 */
//@SpringBootApplication
@SpringBootApplication(exclude = MongoAutoConfiguration.class)

public class DevQualityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevQualityDemoApplication.class, args);
    }

}
