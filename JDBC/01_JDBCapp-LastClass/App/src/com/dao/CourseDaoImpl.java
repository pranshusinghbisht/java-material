package com.dao;

import com.exceptions.CourseException;
import com.model.StudentCourseDTO;
import com.utility.DBUtil;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoImpl implements CourseDao{
    @Override
    public List<StudentCourseDTO> getAllStudentsByCourseName(String cname) throws CourseException {
        List<StudentCourseDTO> dtos = new ArrayList<>();

        try (Connection con = DBUtil.provideConnection()) {
            PreparedStatement ps = con.prepareStatement("select s.roll, s.name, s.address, s.email, c.cname, c.fee, c.duration from Student s INNER JOIN course c INNER JOIN student_course sc ON s.roll = sc.roll AND c.cid = sc.cid AND c.cname = ?");

            ps.setString(1, cname);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                    //this code is incomplete
            }

        }catch (SQLException e){
            e.printStackTrace();
            throw new CourseException(e.getMessage());
        }
        return dtos;
    }
}
