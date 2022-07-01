package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class demo6 {
    public static void main(String[] args) {}
    public  static void updatestu(ArrayList<Student> arry){
        demo4.allstudent(arry);
        System.out.println("请输入要修改的学生的学号");
        Scanner sc=new Scanner(System.in);
        String upxh= sc.nextLine();
        for (int i = 0; i < arry.size(); i++) {
            Student xh1=arry.get(i);
            if (upxh.equals(xh1.getXh())){

            }
        }
    }
}
