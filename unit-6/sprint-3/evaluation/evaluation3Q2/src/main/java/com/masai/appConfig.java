package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("student.properties")
public class appConfig {
	@Bean
	public List<Student> getList() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(01,"dhoni","ranchi","dhoni@gmail.com",550));
		list.add(new Student(02,"kohli","ludhiyana","kohli@gmail.com",750));
		list.add(new Student(03,"rohit","mumbai","rohit@gmail.com",850));
		list.add(new Student(04,"surykumar","bihar","yadav@gmail.com",950));
		list.add(new Student(05,"suresh","panjab","raina@gmail.com",970));
		return list;
	}

	@Bean(name = "theMap")
	public Map< Student,Course> getMap() {
		Map<Student,Course> map = new HashMap<>();
		map.put(new Student(501, "sagar", "Akola", "sagar@gmail.com", 500),new Course(6, "Java", "45 Days", "6000"));
		map.put(new Student(502, "Satish", "Amravti", "satish@gmail.com", 600),new Course(7, "Hibernate", "50 Days", "3000"));
		map.put(new Student(503, "Banti", "Nagpur", "Bantigmail.com", 700),new Course(9, "SprigBoot", "60 Days", "4000"));
		return map;
	}
}