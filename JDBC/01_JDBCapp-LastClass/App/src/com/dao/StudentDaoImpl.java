package com.dao;

import com.exceptions.CourseException;
import com.exceptions.StudentException;
import com.model.Student;
import com.utility.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao{

    @Override
    public String registerStudent(Student student) throws StudentException {
        String message = "Not Registered..!";
        try (Connection con = DBUtil.provideConnection()){

           PreparedStatement ps =  con.prepareStatement("insert into student (name,address,email,password) values (?,?,?,?)");

           ps.setString(1,student.getName());
            ps.setString(2,student.getAddress());
            ps.setString(3,student.getEmail());
            ps.setString(4,student.getPassword());

            int x = ps.executeUpdate();

            if(x>0){
                message = "Student Registered Sucessfully...";

            }

return message;


        }catch (SQLException e){
            e.printStackTrace();
            throw new StudentException(e.getMessage());
        }
    }







    @Override
    public Student loginStudent(String username, String password) throws StudentException {
        Student student = null;
        try(Connection con = DBUtil.provideConnection()) {

            PreparedStatement ps = con.prepareStatement("select * from student where email=? and password = ?");
            ps.setString(1, username);
            ps.setString(2,password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                student = new Student();
                student.setRoll(rs.getInt("roll"));
                student.setName(rs.getString("name"));
                student.setAddress(rs.getString("address"));
                student.setEmail(rs.getString("email"));
                student.setPassword(rs.getString("password"));



            }else{
                throw new StudentException("Invalid Username or Password...");
            }


        }catch (SQLException e){
            e.printStackTrace();
            throw new StudentException(e.getMessage());
        }
        return student;
    }





    @Override
    public String enrollStudentInCourse(int roll, int cid) throws StudentException, CourseException {

        String message = "Not Enrolled...!";

        try(Connection con = DBUtil.provideConnection()){
            PreparedStatement ps1= con.prepareStatement("select * from student where roll = ?");

            ps1.setInt(1,roll);
            ps1.executeQuery();

            ResultSet rs1 = ps1.executeQuery();

            if(rs1.next()){

               PreparedStatement ps2  = con.prepareStatement("select * from course where cid=?");

               ps2.setInt(1,cid);
               ResultSet rs2 = ps2.executeQuery();

               if(rs2.next()){
                   PreparedStatement ps3 =  con.prepareStatement("insert into student_course values(?,?)");
                   ps3.setInt(1,roll);
                   ps3.setInt(2,cid);

                   int x = ps3.executeUpdate();

                   if(x>0){
                       message = "Student Enrolled Succuessfully";
                   }

               }else{
                   throw new CourseException("Course not found");
               }


            }else{
                    throw new StudentException("Student does not exist with roll :");
            }

        }
        catch (SQLException e){
            e.printStackTrace();

            throw  new StudentException(e.getMessage());
        }


        return message;
    }
}
