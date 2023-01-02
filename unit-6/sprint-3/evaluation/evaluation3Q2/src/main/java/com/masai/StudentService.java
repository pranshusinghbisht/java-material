package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
	@Autowired
	private Map<Student,Course> theMap; // inject 3 entries

	@Autowired
	@Qualifier("getList")
	private List<Student> theList; // inject List of 5 Students object

	@Value("${appname1}")
	private String appName; // inject the AppName from the properties file

	public void printMap() {
		// print all the student's and their Course's details from theMap
		System.out.println(theMap);
		System.out.println("==================================================================");
	}

	public void printList() {
		theList.sort((a, b) -> a.getMarks() > b.getMarks() ? 1 : -1);
		for (Student em : theList)
			System.out.println(em);

	}

	public void printAppName() {
		// print the injected appName
		System.out.println(appName);
	}

}
