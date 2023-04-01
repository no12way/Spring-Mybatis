package union.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import union.dao.StudentMapper;
import union.pojo.Student;
import union.service.StudentService;

import java.util.List;
@Service("studentServiceImp")
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
    @Transactional
    public int addStudent(Student student) {
        int i = studentMapper.insertStudent(student);
        return i;
    }
    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public List<Student> queryStudent() {
       Integer integer = null;
       integer.toString();
        List<Student> students = studentMapper.selectStudent();
        return students;
    }
}
