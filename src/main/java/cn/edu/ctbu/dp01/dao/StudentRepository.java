package cn.edu.ctbu.dp01.dao;

import cn.edu.ctbu.dp01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {


    @Query(value = "SELECT * FROM tb_students WHERE sno = (SELECT MAX(sno) FROM tb_students)", nativeQuery = true)
    List<Student> findByBigTeacher();

    List<Student> findByNameLike(String name);

    List<Student> findByNameAndPassword(String name, String password);
}
