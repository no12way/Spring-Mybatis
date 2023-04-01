package union.dao;

import union.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
