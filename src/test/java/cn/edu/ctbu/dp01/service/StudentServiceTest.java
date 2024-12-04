package cn.edu.ctbu.dp01.service;

import cn.edu.ctbu.dp01.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    void findAll() {
        List<Student> students = studentService.findAll();

        assertNotNull(students);
    }

    @Test
    void findById() {
        Student student = studentService.findById(1);

        assertNotNull(student);
    }
    @Test
        void findByNameLike() {
        List<Student> students = studentService.findByName("罗%");

        assertNotNull(students);
    }
    @Test
    void findByNameAndPassword() {
        List<Student> students = studentService.findByNameAndPassword("罗雯皓", "12345");

        assertNotNull(students);
    }
    @Test
    void insert() {

        Student student = new Student();
        student.setName("仪5");
        student.setPassword("123545666");
        student.setSno("2022454563");
        student.setSex(1);
        student.setAge(50);

        studentService.insert(student);

        assertNotNull(student.getId());
    }

    @Test
    void update() {

        List<Student> students = studentService.findByName("赵三13%");
        Student student=students.get(0);
        student.setName("赵三");

        studentService.update(student);

        assertEquals(student.getName(),"赵三");
    }

    @Test
    void delete() {
        studentService.delete(5);
        Student student=studentService.findById(5);
        assertNull(student);
    }
    @Test
    void findByBigTeacher(){
        List<Student> students=studentService.findByBigTeacher();
        assertEquals(1, students.size());
    }

}