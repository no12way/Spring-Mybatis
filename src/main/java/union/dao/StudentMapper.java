package union.dao;

import org.springframework.stereotype.Repository;
import union.pojo.Student;

import java.util.List;

@Repository
public interface StudentMapper {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
