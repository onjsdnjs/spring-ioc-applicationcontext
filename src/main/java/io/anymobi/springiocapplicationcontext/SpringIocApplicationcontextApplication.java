package io.anymobi.springiocapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringIocApplicationcontextApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplicationcontextApplication.class);
    }
}
