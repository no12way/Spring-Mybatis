import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import union.dao.StudentMapper;
import union.pojo.Student;

import java.util.List;

public class TestAll {
    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("springconfig.xml");
        StudentMapper studentMapper = app.getBean("studentMapper", StudentMapper.class);
        Student stu1 = new Student(1, "小明", 18);
        studentMapper.insertStudent(stu1);
        List<Student> students = studentMapper.selectStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
