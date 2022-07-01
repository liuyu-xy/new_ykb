package com.tiheima.com;
import com.tiheima.mymain.Student;
public class demo4 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Student stu=new Student("20190601","张三",18,"男","山东济南","2001.02.20");
        sb.append(stu.getXh());
        System.out.println(sb);
        stu.show();

    /*    sb.append("张三");
        System.out.println(sb);*/
    }

}
