package com.nghintm2008110284.lab5;

public class Account {
    
     //attribute - thuộc tính

     String tenTK;
     int soTK;
     int soDu;
 
     //methood - function 
     //hàm tạo mặc định
 
     Account(){
 
         tenTK = "Nguyễn Thị A";
         soTK = 4499;
         soDu = 3500 ;
 
     }
 
     //hàm tạo 1 tham số
 
     Account(int a){
 
         tenTK = "Trần Văn B";
         soTK = 2805; 
         soDu = 2003;
 
     }
 
     //hàm tạo 2 tham số
 
     Account(int a, int b){
 
         tenTK = "Võ Thị C"; 
         soTK = 3107;
         soDu = 2003;
 
     }
 
     void inThongTin(){
 
         System.out.println("Tên chủ tài khoản: "+tenTK);
         System.out.println("Số tài khoản: "+soTK); 
         System.out.println("Số dư trong tài khoản: "+soDu);
 
     }
 
     int guiTien(int gui){
 
         soDu = soDu + gui;
         return soDu;
 
     }
 
     int rutTien(int rut){
 
         soDu = soDu - rut;
         return soDu;
 
     }
}
