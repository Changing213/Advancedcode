package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.Studentdao;
import com.itheima.edu.info.manager.domain.Student;

//业务员 业务的逻辑处理
public class StudentService {
   private Studentdao stud = new Studentdao();
    public boolean addStudent(Student stu) {
        //创建一个库管对象Studentdao
        //将学生对象，传递给Studentdao库管中的addStudent方法
        //将返回的Boolean类型结果返回给StudentController


        return stud.addStudent(stu);


    }

    public boolean isExists(String id) {

        Student[] array = stud.findAllStudent();
        //假设id在数组中不存在
        boolean exists = false;
        for (int i = 0; i < array.length; i++) {
            Student student = array[i];
            //取出来的数组元素可能是null，要先判断
            if(student != null && student.getId().equals(id)){
                exists = true;
                break;
            }

        }
        return exists;

    }
}
