package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        System.out.println("----------" + "欢迎来到学生管理系统" + "----------");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ) {
            ++i;
            if (i == 1) {
                System.out.println(i + ".添加学生");
            } else if (i == 2) {
                System.out.println(i + ".删除学生");
            } else if (i == 3) {
                System.out.println(i + ".修改学生");
            } else if (i == 4) {
                System.out.println(i + ".查看所有学生");
            } else if (i == 5) {
                System.out.println(i + ".退出");
            }
        }
        System.out.println("请输入您的选择: ");

        for (int i = 0; i < 5;) {
            int a=sc.nextInt();
            ++i;
            if(a==1){
                /*System.out.println("添加学生");
                break;*/
                demo2 dm=new demo2();
                dm.tj();
            }
            else if(a==2){
                /*System.out.println("删除学生");
                break;*/
            }
           else if(a==3){
               /* System.out.println("修改学生");
                break;*/
            }
            else if(a==4){
               /* System.out.println("查看所有学生");
                break;*/
            }
            else  if(a==5){
               break;
            }
        }
    }
}
