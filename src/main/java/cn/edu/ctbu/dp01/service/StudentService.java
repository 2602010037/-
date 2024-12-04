package cn.edu.ctbu.dp01.service;

import cn.edu.ctbu.dp01.dao.StudentRepository;
import cn.edu.ctbu.dp01.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    //**
    //读取学生列表 返回LList Student
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
//按ID进行查询.like
    public Student findById(Integer id){



        return studentRepository.findById(id).orElse(null);
    }
    //按名字进行查询 like
    public List<Student> findByName(String name){

        return studentRepository.findByNameLike(name);
    }

    //按名字进行查询 输入名字和密码
    public List<Student> findByNameAndPassword(String name,String password){

        return studentRepository.findByNameAndPassword(name,password);
    }

    public void insert(Student student){
        studentRepository.save(student);
    }

    public void update(Student student){
        studentRepository.save(student);
    }

    public void delete(Integer id){
        studentRepository.deleteById(id);
    }

    public List<Student> findByBigTeacher(){
        return studentRepository.findByBigTeacher();
    }
//新增学生
    public Student add(Student student){
        return studentRepository.save(student);
    }
    //更新学生
    public Student update1(Student student){
        return studentRepository.save(student);
    }
    //删除学生
    public void delete1(Integer id){
        studentRepository.deleteById(id);
    }

}