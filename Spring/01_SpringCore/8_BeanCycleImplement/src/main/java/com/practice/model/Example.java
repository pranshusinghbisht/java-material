package com.practice.model;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
    }

    public Example(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }


    @PostConstruct  // first add new dependency "javax annotatioon" which is depricated in new version
    public void start(){
        System.out.println("Starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("Ending method");
    }
}
