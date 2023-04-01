package union.service;

import org.springframework.transaction.annotation.Transactional;
import union.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     * 业务中增加学生
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 查询所有学生
     * @return
     */
    List<Student> queryStudent();
}
