package edu.miu.eregistarwebapi.controller;

import edu.miu.eregistarwebapi.model.Student;
import edu.miu.eregistarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = {"/eregister/api/student"})
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(value = "{list}")
    public List<Student> getStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping(value = "{studentid}")
    public Student getStudentById(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }
    @PostMapping(value = {"/eregister/api/student"})
   public Student addNewStudent(@Valid @RequestBody Student student){
        return studentService.saveStudent(student);
   }
   public void deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudentById(studentId);

   }

}
