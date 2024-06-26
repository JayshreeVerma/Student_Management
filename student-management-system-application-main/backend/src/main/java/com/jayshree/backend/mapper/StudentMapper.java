package com.jayshree.backend.mapper;

import com.jayshree.backend.dto.StudentDto;
import com.jayshree.backend.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstname(student.getFirstName());
        studentDto.setLastname(student.getLastName());
        studentDto.setEmail(student.getEmail());
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student();
        student.setFirstName(studentDto.getFirstname());
        student.setLastName(studentDto.getLastname());
        student.setEmail(studentDto.getEmail());
        return student;
    }
}
