package com.tiheima.mymain;
public class Student {
    private String xh;
   private String name;
    public String getXh() {
        return xh;
    }
    public void setXh(String xh) {
        this.xh = xh;
        return ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getXb() {
        return xb;
    }
    public void setXb(String xb) {
        this.xb = xb;
    }
    public String getDz() {
        return dz;
    }
    public void setDz(String dz) {
        this.dz = dz;
    }
    public String getSr() {
        return sr;
    }
    public void setSr(String sr) {
        this.sr = sr;
    }
    public Student(String xh, String name, int age, String xb, String dz, String sr) {
        this.xh = xh;
        this.name = name;
        this.age = age;
        this.xb = xb;
        this.dz = dz;
        this.sr = sr;
    }
    public Student() {
    }
public  void  show(){
    System.out.println("学号:"+getXh()+" 姓名: "+getName()+" 年龄: "+getAge()+" 性别: "+getXb()+" 地址: "+getDz()+" 生日: "+getSr());
}
    private int age;
   private String xb;
   private String dz;
   private String sr;
}
