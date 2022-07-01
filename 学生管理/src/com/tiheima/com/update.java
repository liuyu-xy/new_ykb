package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class update {
    public static void main(String[] args) {}
    public  static  void up(ArrayList<Student> arry){
        System.out.println("----------修改界面----------");
        for (int i = 0; i < 6;) {
            ++i;
            if (i==1){
                System.out.println(i+".修改学号");
            }
            if (i==2){
                System.out.println(i+".修改姓名");
            }
            if (i==3){
                System.out.println(i+".修改年龄");
            }
            if (i==4){
                System.out.println(i+".修改性别");
            }
            if (i==5){
                System.out.println(i+".修改地址");
            }
            if (i==6){
                System.out.println(i+".修改生日");
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的选择:");
        int s=sc.nextInt();
        for (int i = 0; i < 6;) {
            ++i;
            if (s==1){
                demo4.allstudent(arry);
                System.out.println("请输入您要修改的同学的学号");
                String oldxh= sc.next();
                for (int i1 = 0; i1 < arry.size(); i1++) {
                    Student st = arry.get(i1);
                        for (int i2 = 0; i2 < arry.size(); i2++) {
                            if (oldxh.equals(st.getXh())) {
                                System.out.println("请输入新的学号");
                                String newxh = sc.next();
                                Student ST=arry.get(i2);

                                if (newxh.equals(ST.getXh())){
                                    System.out.println("学号重复！！");
                                    break;
                                }
                                st.setXh(newxh);
                                System.out.println("修改成功！！");
                                break;
                            }

                        }
                    }
                }
                break;
            }
            if (s==2){
                demo4.allstudent(arry);
                System.out.println("请输入您要修改的同学的学号");
                String oldxh1= sc.next();
                for (int i1 = 0; i1 < arry.size(); i1++) {
                    Student st = arry.get(i1);
                    if (oldxh1.equals(st.getXh())){
                        System.out.println("请输入新的姓名");
                        String newname= sc.next();
                        st.setName(newname);
                        System.out.println("修改成功！！");
                        break;
                    }
                }

            }
            if (s==3){
                demo4.allstudent(arry);
                System.out.println("请输入您要修改的同学的学号");
                String oldxh1= sc.next();
                for (int i1 = 0; i1 < arry.size(); i1++) {
                    Student st = arry.get(i1);
                    if (oldxh1.equals(st.getXh())){
                        System.out.println("请输入新的年龄");
                        String newage= sc.next();
                        st.setAge(newage);
                        System.out.println("修改成功！！");
                        break;
                    }
                }

            }
            if (s==4){
                demo4.allstudent(arry);
                System.out.println("请输入您要修改的同学的学号");
                String oldxh1= sc.next();
                for (int i1 = 0; i1 < arry.size(); i1++) {
                    Student st = arry.get(i1);
                    if (oldxh1.equals(st.getXh())){
                        System.out.println("请输入新的性别");
                        String newXB= sc.next();
                        st.setXb(newXB);
                        System.out.println("修改成功！！");
                        break;
                    }
                }

            }
            if (s==5){
                demo4.allstudent(arry);
                System.out.println("请输入您要修改的同学的学号");
                String oldxh1= sc.next();
                for (int i1 = 0; i1 < arry.size(); i1++) {
                    Student st = arry.get(i1);
                    if (oldxh1.equals(st.getXh())){
                        System.out.println("请输入新的地址");
                        String newdz= sc.next();
                        st.setDz(newdz);
                        System.out.println("修改成功！！");
                        break;
                    }
                }

            }
            if (s==6){
                demo4.allstudent(arry);
                System.out.println("请输入您要修改的同学的学号");
                String oldxh1= sc.next();
                for (int i1 = 0; i1 < arry.size(); i1++) {
                    Student st = arry.get(i1);
                    if (oldxh1.equals(st.getXh())){
                        System.out.println("请输入新的生日");
                        String newsr= sc.next();
                        st.setSr(newsr);
                        System.out.println("修改成功！！");
                        break;
                    }
                }

            }
        }


    }

