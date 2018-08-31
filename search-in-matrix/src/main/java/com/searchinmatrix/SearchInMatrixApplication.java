package com.searchinmatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SearchInMatrixApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =SpringApplication.run(SearchInMatrixApplication.class, args);
        boolean result = applicationContext.getBean(SearchInMatrix.class).findSolutionOne(new int[][]{{1,3,5},{7,9,11},{13,15,17}},7);
        System.out.println(result);

        boolean resultSec = applicationContext.getBean(SearchInMatrix.class).findSolutionSec(new int[][]{{1,3,5},{7,9,11},{13,15,17}},7);
        System.out.println(resultSec);
    }

}
