package com.tiheima.com;
import com.tiheima.mymain.Student;
import java.util.ArrayList;
public class demo4 {
public  static  void allstudent(ArrayList<Student> arry){
    for (int i = 0; i < arry.size(); i++) {
        Student s=arry.get(i);
        System.out.println("学号:"+s.getXh()+" 姓名: "+s.getName()+" 年龄: "+s.getAge()+" 性别: "+s.getXb()+" 地址: "+s.getDz()+" 生日: "+s.getSr());
    }

      /*  Student stu1=new Student("20190602","李四",20,"男","山东烟台","2001.03.27");
        Student stu2=new Student("20190603","王五",22,"男","山东青岛","2001.04.26");
        Student stu3=new Student("20190604","赵六",21,"男","山东潍坊","2001.06.24");
        Student stu4=new Student("20190605","李小七",23,"女","山东淄博","2001.08.21");
        AL.add(stu1);
        AL.add(stu1);
        AL.add(stu2);
        AL.add(stu3);
        AL.add(stu4);
        System.out.println(AL.get(stu.getName()));
        stu.show();



*/
    /*    sb.append("张三");
        System.out.println(sb);*/
    }

}
