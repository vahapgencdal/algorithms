package com.duplicationinanarray;

import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DuplicationInAnArrayApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=SpringApplication.run(DuplicationInAnArrayApplication.class, args);
        DuplicateArray duplicateArray=applicationContext.getBean(DuplicateArray.class);
        try {
            System.out.println(duplicateArray.duplicate(new int[]{1,2,4,3,5,23,2}));
        } catch (NotFound notFound) {
            notFound.printStackTrace();
        }
    }
}
