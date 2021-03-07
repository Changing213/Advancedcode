package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.StudentController;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//程序的入口
public class infoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            //把主菜单搭建出来
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();
            switch(choice){
                case "1":
                    //System.out.println("学生管理");
                    //开启学生管理系统
                    StudentController stuc = new StudentController();
                    stuc.start();
                    break;
                case "2":
                    System.out.println("老师管理");
                    break;//break只能跳出一层，也就是当前的switch
                case "3":
                    System.out.println("感谢您的使用");
                    //推出当前正在运行的JVM虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("您输入的信息有错，请重新输入！");
                    break;
            }

        }


    }
}
