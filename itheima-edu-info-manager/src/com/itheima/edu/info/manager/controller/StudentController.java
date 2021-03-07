package com.itheima.edu.info.manager.controller;
//客服接待和用户打交道

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    //用来开启学生管理系统，并展示学生管理系统菜单
    public void start() {

        System.out.println("--------欢迎来到 <学生> 管理系统--------");
        System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
        Scanner sc = new Scanner(System.in);

       studentloop:
       while (true){

            String choice = sc.next();
            switch(choice){
                case "1":
                    System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看学生");
                    break;
                case "5":
                    System.out.println("感谢您使用，再见！");
                    //不能再使用system.exit(0),因为这会直接退出整个程序
                    break studentloop;
                default:
                    System.out.println("您输入的信息有错，请重新输入！");
                    break;
            }

        }
    }

    public void addStudent() {
        StudentService stus = new StudentService();
        //键盘接受学生信息
        //将学生信息封装为学生对象
        //将学生对象，传递给StudentService(业务员)中的addStudent方法
        //根据返回的boolean值，在控制台打印成功或失败
        Scanner sc = new Scanner(System.in);
        String id;
        //输入id是否有重复，要一直输入
        while(true){
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = stus.isExists(id);
            if(flag){
                System.out.println("学号已经存在，请重新输入");
            }
            else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birth = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirth(birth);


        boolean result = stus.addStudent(stu);

        if(result){
            System.out.println("添加成功");
        }
        else {
            System.out.println("添加失败");
        }


    }
}
