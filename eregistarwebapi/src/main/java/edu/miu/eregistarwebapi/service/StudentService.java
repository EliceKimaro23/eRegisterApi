package edu.miu.eregistarwebapi.service;

import edu.miu.eregistarwebapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public abstract List<Student> getAllStudent();
    public Student saveStudent (Student student);
    public abstract Student getStudentById(Integer studentId);
    public abstract void deleteStudentById(Integer studentId);
}

