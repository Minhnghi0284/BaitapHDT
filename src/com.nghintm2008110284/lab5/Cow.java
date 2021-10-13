package com.nghintm2008110284.lab5;

public class Cow {
       //attribute - thuộc tính

       double weight;
       double age;
   
       //methood - function
       //hàm tạo mặc định
   
       Cow(){
   
           weight = 28;
           age = 5;
   
       }
   
       //hàm tạo 1 tham số
   
       Cow(double x){
   
           weight = 20;
           age = 3;
   
       }
   
       //hàm tạo 2 tham số
   
       Cow(double y, double z){
   
           weight = y;
           age = z;
   
       }
   
       void xuatThongTin(){
   
           System.out.print("Cân nặng: "+weight);
           System.out.println(" kg");
           System.out.print("Tuổi: "+age);
           System.out.println(" tuổi");
   
       }
       
}
