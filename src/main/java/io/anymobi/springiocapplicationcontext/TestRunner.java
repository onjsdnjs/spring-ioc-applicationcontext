package io.anymobi.springiocapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    BookService bookService;

    @Autowired
    Proto proto;

    @Autowired
    ApplicationContext applicationContext;

    @Value("${app.name}")
    private String appName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//            bookService.printApplicationContext();
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println(applicationContext.getBean(Proto.class));
        System.out.println(applicationContext.getBean(Proto.class));


        System.out.println(applicationContext.getBean(Sington.class).getProto());
        System.out.println(applicationContext.getBean(Sington.class).getProto());
        System.out.println(applicationContext.getBean(Sington.class).getProto());

        Environment environment = applicationContext.getEnvironment();
        environment.getActiveProfiles();
        environment.getDefaultProfiles();

        System.out.println(environment.getProperty("app.name"));
        System.out.println(appName);
    }

}
