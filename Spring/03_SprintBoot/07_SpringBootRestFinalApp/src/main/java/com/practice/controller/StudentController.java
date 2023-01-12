package com.practice.controller;

import com.practice.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();

public StudentController(){
    students.add(new Student(10,"ram",200));
    students.add(new Student(11,"shyam",400));
    students.add(new Student(12,"pranshu",500));
    students.add(new Student(13,"hrithik",100));
    students.add(new Student(14,"ramesh",300));
}

@GetMapping("/students")
public List<Student> getAllStudentDetailsHandler(){
    return students;
}

@GetMapping("/students/{roll}")
public Student getStudentByRollHandler(@PathVariable("roll") Integer roll){
   List<Student> list = students.stream().filter(s -> s.getRoll() == roll).collect(Collectors.toList());

   if(list.size() == 0){
       throw new IllegalArgumentException("Student does not exist with roll : "+roll);

   }
       return list.get(0);
}

@PostMapping("/students")
public String addStudentHandler(@RequestBody Student student){
    students.add(student);
    return "Student added successfully";
}


//this is wrong
@PutMapping("/students/{roll}")
public Student updateStudentHandler1(@RequestBody Student student, @PathVariable("roll") Integer roll){

    boolean flag = true;

    for(Student st: students){
        if(st.getRoll() == roll){
           st.setName(student.getName());
           st.setMarks(student.getMarks());

//            st = student;
            flag = false;
            break;
        }
        if(flag)
            throw new IllegalArgumentException("Student does not exist with roll : "+roll);
    }
        return student;
}



@DeleteMapping("/students/{roll}")
public String deleteStudentByRollHandler(@PathVariable("roll") Integer roll){
  boolean flag =  students.removeIf(s -> s.getRoll() == roll);
  if(flag)
      return "Student Deleted Sucessfully";
  else
      throw new IllegalArgumentException("Student not found with roll "+roll);
}


/*@PutMapping("Students/{roll}/{gmarks}")
public String graceMarksHandler(@PathVariable("roll") Integer roll, @PathVariable("gmarks") Integer gmarks){

    boolean flag = true;

    for(Student st: students){
        if(st.getRoll() == roll){
            st.setMarks(st.getMarks()+gmarks);

            flag = false;
            break;
        }
        if(flag)
            throw new IllegalArgumentException("Student does not exist with roll : "+roll);
    }
    return "Student marks is graced successfully";

}*/

    @PutMapping("studentmarksupdate/{roll}")
    public String graceMarksHandler(@PathVariable("roll") Integer roll, @RequestParam("gmarks") Integer gmarks){
//this logic is for 1st element
        boolean flag = true;

        for(Student st: students){
            if(st.getRoll() == roll){
                st.setMarks(st.getMarks()+gmarks);

                flag = false;
                break;
            }
            if(flag)
                throw new IllegalArgumentException("Student does not exist with roll : "+roll);
        }
        return "Student marks is graced successfully";

    }


}
