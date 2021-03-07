package com.itheima.edu.info.manager.domain;
//封装数据的类
public class Student {

    private String id;
    private String name;
    private String age;
    private String birth;

    public Student() {
    }

    public Student(String id, String name, String age, String birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
