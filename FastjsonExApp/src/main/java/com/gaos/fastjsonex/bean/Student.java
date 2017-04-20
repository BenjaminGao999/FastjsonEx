package com.gaos.fastjsonex.bean;

/**
 * Author:　Created by benjamin
 * DATE :  2017/4/19 18:31
 * versionCode:　1.0.0
 */

public class Student {
    private String name;
    private String num;

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public Student() {
    }

//    public String getName() {
//        return name;
//    }
////
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNum() {
//        return num;
//    }
//
//    public void setNum(String num) {
//        this.num = num;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
