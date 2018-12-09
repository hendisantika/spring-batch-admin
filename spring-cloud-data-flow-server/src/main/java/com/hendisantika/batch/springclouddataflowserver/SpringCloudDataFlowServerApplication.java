package com.hendisantika.batch.springclouddataflowserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@SpringBootApplication
@EnableDataFlowServer
public class SpringCloudDataFlowServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDataFlowServerApplication.class, args);
    }
}
