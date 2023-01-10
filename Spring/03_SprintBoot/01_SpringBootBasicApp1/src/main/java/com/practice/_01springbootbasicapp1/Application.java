package com.practice._01springbootbasicapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //it is the combination of @Configuration + @ComponenetScan + @EnableAutoConfiguration

// here @ComponentScan base package will be the package inside this annotation annotated class is there.

public class Application {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(Application.class, args);
      A a = ctx.getBean("a",A.class);
      a.funcA();

    }

}
