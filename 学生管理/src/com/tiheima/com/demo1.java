package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Student> arry = new ArrayList<>();
        Student allstudent =new Student();
        allstudent.setXh("20190601");
        allstudent.setName("李四");
        allstudent.setAge("20");
        allstudent.setXb("男");
        allstudent.setDz("青岛");
        allstudent.setSr("1999.8.19");
        arry.add(allstudent);
        Student allstudent2 =new Student();
        allstudent2.setXh("20190602");
        allstudent2.setName("张三");
        allstudent2.setAge("22");
        allstudent2.setXb("男");
        allstudent2.setDz("山东济南");
        allstudent2.setSr("1998.6.17");
        arry.add(allstudent2);
        Student allstudent3 =new Student();
        allstudent3.setXh("20190603");
        allstudent3.setName("王五");
        allstudent3.setAge("24");
        allstudent3.setXb("男");
        allstudent3.setDz("山东青岛");
        allstudent3.setSr("1999.6.17");
        arry.add(allstudent3);
        while (true) {
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

            for (int i = 0; i < 5; ) {
                int a = sc.nextInt();
                ++i;
                if (a == 1) {
                /*System.out.println("添加学生");
                break;*/
                    demo2 dm = new demo2();
                    dm.updatestudent(arry);
                    break;
                } else if (a == 2) {
                /*System.out.println("删除学生");
                break;*/
                    demo5.delstudent(arry);
                    break;
                } else if (a == 3) {
               /* System.out.println("修改学生");
                break;*/
                    update.up(arry);
                    break;
                } else if (a == 4) {
               /* System.out.println("查看所有学生");
                break;*/
                    demo4.allstudent(arry);
                    break;


                } else if (a == 5) {
                    System.out.println("程序结束!");
                    break;
                }
            }
        }


    }
}
