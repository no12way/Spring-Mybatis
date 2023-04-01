package union.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import union.dao.StudentMapper;
import union.pojo.Student;
import union.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    @Qualifier("studentMapper")
    private StudentMapper studentMapper;

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int addStudent(Student student) {
        int i = studentMapper.insertStudent(student);
        return i;
    }
    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentMapper.selectStudent();
        return students;
    }
}
