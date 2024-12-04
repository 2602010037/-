package cn.edu.ctbu.dp01.api;


import cn.edu.ctbu.dp01.entity.Student;
import cn.edu.ctbu.dp01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentApiController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> findAll2(){

        List<Student> students=studentService.findAll();
        return students;

    }

    @PostMapping("/add")
    public Student add(Student student){

        return studentService.add(student);

    }
    @PutMapping("/update1")
    public Student update1(Student student){
        return studentService.update1(student);

    }
    @DeleteMapping("/delete1/{id}")
    public void delete1(@PathVariable Integer id){
        studentService.delete1(id);

    }
}
