import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import union.pojo.Student;
import union.service.StudentService;
import union.service.impl.StudentServiceImp;
import union.service.impl.StudentServiceImp2;

import java.util.List;

public class TestAll {
    @Test
    public void test(){

        ApplicationContext app = new ClassPathXmlApplicationContext("springconfig.xml");
        StudentService studentService = (StudentService) app.getBean("studentServiceImp");
        List<Student> students = studentService.queryStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testTran(){
        ApplicationContext app = new ClassPathXmlApplicationContext("springconfig.xml");
        StudentService studentService = (StudentService) app.getBean("studentServiceImp2");
        int xiao = studentService.addStudent(new Student(null, "小菜", 2));
    }

}
