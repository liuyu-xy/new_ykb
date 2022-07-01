package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class demo5 {
    public static void main(String[] args) {
    }
    public static void delstudent(ArrayList<Student> arry){
        demo4.allstudent(arry);
        Student stu=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要删除的学生的学号");
        String delxh= sc.nextLine();
        for (int i = 0; i < arry.size(); i++) {
            Student S=arry.get(i);
            if (delxh.equals(S.getXh())){
                arry.remove(arry.get(i));
            };
        }
        System.out.println("已成功删除！");


    }
}
