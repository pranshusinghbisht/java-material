package com.Application.Main;

import com.Application.dao.PresentationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        PresentationBean pbean= ac.getBean("pb", PresentationBean.class);
        pbean.present();
    }
}
