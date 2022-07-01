package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
    }
    public void tj(){
        Student sd=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入学号 ");
        sd.setXh(sc.nextLine());
        System.out.print("请输入姓名 ");
        sd.setName(sc.nextLine());
        System.out.print("请输入年龄 ");
        sd.setAge(sc.nextInt());
        System.out.print("请输入性别 ");
        sd.setXb(sc.next());
        System.out.print("请输入地址 ");
        sd.setDz(sc.next());
        System.out.print("请输入生日 ");
        sd.setSr(sc.next());
        sd.show();
        System.out.println("添加成功!!");


    }
}
