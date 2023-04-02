//package union.service.impl;
//
//import org.apache.ibatis.jdbc.Null;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//import union.dao.StudentMapper;
//import union.pojo.Student;
//import union.service.StudentService;
//
//import java.util.List;
//@Service("studentServiceImp2")
//public class StudentServiceImp2 implements StudentService {
//    @Autowired
//    @Qualifier("studentServiceImp")
//    private StudentService service;
//
//    @Autowired
////    @Qualifier("studentMapper")
//    private StudentMapper studentMapper;
//    @Override
////    //事务级别,有就加入,没有就抛异常
////    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
//    public int addStudent(Student student) {
//        int i = studentMapper.insertStudent(student);
//        try {
//        List<Student> students = service.queryStudent();
//        for (Student student1 : students) {
//            System.out.println(student1);
//        }}catch (Exception e){e.printStackTrace();}
//        return i;
//    }
//
//    @Override
//    public List<Student> queryStudent() {
//        return null;
//    }
//}
