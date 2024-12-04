package cn.edu.ctbu.dp01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="tb_students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //主键 自增
    private  String name;
    //姓名
    private  Integer age;
    //年龄
    private  Integer sex;
    //性别
    private  String sno;
    //学号
    private  String password;


}
