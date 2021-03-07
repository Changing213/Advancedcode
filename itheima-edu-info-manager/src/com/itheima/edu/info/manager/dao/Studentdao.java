package com.itheima.edu.info.manager.dao;
//数据的增删改查，库管

import com.itheima.edu.info.manager.domain.Student;

public class Studentdao {
    //外类不得访问
    private Student[] stus = new Student[5];
    public boolean addStudent(Student stu) {

        //创建一个学生对象数组
        //添加学生到数组
        //定义变量index=-1，假设数组已经全部储存，没有null的元素
        //遍历数组取出每一个元素，判断是否是null
        //如果是null，让index变量记录当前索引位置，并使用break结束循环遍历。
        //返回是否添加成功的Boolean类型状态


        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stus1 = stus[i];
            if(stus1 == null){
                index = i;
                break;//结束遍历
            }
        }
        if(index == -1){
            return false;
        }
        else {
            stus[index] =stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stus;
    }
}
