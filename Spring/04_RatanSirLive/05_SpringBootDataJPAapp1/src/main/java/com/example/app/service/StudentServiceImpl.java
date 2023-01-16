package com.example.app.service;

import com.example.app.exception.StudentException;
import com.example.app.model.Student;
import com.example.app.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao dao;

    @Override
    public Student saveStudentDetails(Student student) {

        //this suppied object will not have Id
        //whereas as saced object will have auto-generated id
  Student s =  dao.save(student);
        return s;
    }

    public Student getStudentByRoll(Integer roll) throws StudentException{
      Optional<Student> opt = dao.findById(roll);

      if(opt.isPresent()) {
          Student student = opt.get();
          return student;
      }
      else{
          throw  new StudentException("Student is not exist with roll"+ roll);
      }
//     return dao.findById(roll).get();

//     return    dao.findById(roll).orElseThrow() -> new StudentException(("Studnet does not exist"));
    }



    @Override
    public List<Student> getAllStudentDetails() throws StudentException {

      List<Student> students =  dao.findAll();

      if(students.isEmpty())
          throw new StudentException("No studnet fiund");
      else
          return students;
    }

    @Override
    public Student deleteStudentByRoll(Integer roll) throws StudentException {

       Optional<Student> opt= dao.findById(roll);
       if(opt.isPresent()){

         Student student =  opt.get();
         dao.delete(student);
         return student;

       }else {
           throw new StudentException("Student does not exist with roll : "+roll);
       }
    }


/*    @Override
    public Student updateStudentDetails(Student student) throws StudentException {

      Optional<Student> opt =  dao.findById(student.getRoll());
       if(opt.isPresent()){
        Student existingStudent =   opt.get();

        // here save method will perform save or update operation
       return dao.save(student);
       }else{
           throw new StudentException("Invalid Student : ");
       }
    }

    @Override
    public Student updateMarksForStudnetByRoll(Integer roll, Integer graceMarks) throws StudentException {
       Optional<Student> opt = dao.findById(roll);
       if(opt.isPresent()){

           Student existingStudent = opt.get();
           existingStudent.setMarks(existingStudent.getMarks()+graceMarks);
         return   dao.save(existingStudent);

       }else{
           throw new StudentException("Student does Not exist with roll number : "+roll);
       }
    }*/

    @Override
    public Student getStudentByMarks(int marks) throws StudentException {
     Student student = dao.findByMarks(marks);
     if(student != null)
         return  student;
     else
         throw new StudentException("No Student found with marks : "+marks);
    }


}
