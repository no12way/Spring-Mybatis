package union.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import union.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
