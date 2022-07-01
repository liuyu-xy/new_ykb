package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
    }

    public void updatestudent(ArrayList<Student> arry) {
            Student sd = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入学号 ");
            String xh = sc.nextLine();
            for (int i = 0; i < arry.size(); i++) {
                Student s = arry.get(i);
                if (xh.equals(s.getXh())) {
                    System.out.println("您输入重复！！请重新输入");
                    break;
                }
                    sd.setXh(xh);
                    System.out.print("请输入姓名 ");
//        String name= sc.nextLine();
                    sd.setName(sc.nextLine());
                    System.out.print("请输入年龄 ");
//        String age= sc.nextLine();
                    sd.setAge(sc.nextLine());
                    System.out.print("请输入性别 ");
//        String xb= sc.nextLine();
                    sd.setXb(sc.next());
                    System.out.print("请输入地址 ");
//        String dz= sc.nextLine();
                    sd.setDz(sc.next());
                    System.out.print("请输入生日 ");
                    String sr = sc.nextLine();
                    sd.setSr(sc.next());
                    arry.add(sd);
                    System.out.println("添加成功!!");
                    break;
                }
            }

/*
//        String xh=sc.nexLine();
            sd.setXh(xh);
            System.out.print("请输入姓名 ");
//        String name= sc.nextLine();
            sd.setName(sc.nextLine());
            System.out.print("请输入年龄 ");
//        String age= sc.nextLine();
            sd.setAge(sc.nextLine());
            System.out.print("请输入性别 ");
//        String xb= sc.nextLine();
            sd.setXb(sc.next());
            System.out.print("请输入地址 ");
//        String dz= sc.nextLine();
            sd.setDz(sc.next());
            System.out.print("请输入生日 ");
            String sr = sc.nextLine();
            sd.setSr(sc.next());
            arry.add(sd);
            System.out.println("添加成功!!");

*/

        }


