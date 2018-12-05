package io.anymobi.springiocapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    ApplicationContext applicationContext;

    public void printApplicationContext(){
        System.out.println(applicationContext.getClass());
    }

}
