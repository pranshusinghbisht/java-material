package com.practice.configuration;

import com.practice.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.practice")
@PropertySource("a1.properties")
public class AppConfig {

    @Bean("cities")
    public List<String> getCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangaluru");
        cities.add("Kolkata");
        cities.add("Chennai");
        return cities;
    }

    @Bean("list")
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Manish");
        names.add("Bisht");
        names.add("Krish");
        names.add("Chetna");
        return names;
    }

}
