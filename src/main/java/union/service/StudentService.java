package union.service;

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
     *
     */
    List<Student> queryStudent();
}
