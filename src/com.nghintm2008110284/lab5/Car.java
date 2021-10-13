package com.nghintm2008110284.lab5;

public class Car {
      //attribute - thuộc tính

      String tenChuXe;
      String dongXe;
      String hangSX;
      double giayPhep;
      double dtXang;
  
      //methood - function
      //hàm tạo mặc định
  
      Car(){
  
          tenChuXe = "Trương Thị V";
          dongXe = "Nouvo";
          hangSX = "Yamaha";
          giayPhep = 2015;
          dtXang = 2.25;
  
      }
  
      // hàm tạo 1 tham số
  
      Car(double a){
  
          tenChuXe = "Võ Thị Q";
          dongXe = "Sirius";
          hangSX = "Yamaha";
          giayPhep = 2020;
          dtXang = 3.600;
  
      }
  
      //hàm tạo 2 tham số
  
      Car(double x , double y){
  
          tenChuXe = "Bùi Thị Thúy H";
          dongXe = "Jupiter";
          hangSX = "Yamaha";
          giayPhep = 2016;
          dtXang = 3.000;
  
      }
  
      void xuatThongTin(){
  
          System.out.println("Tên chủ xe: "+tenChuXe);
          System.out.println("Dòng xe: "+dongXe);
          System.out.println("Hãng xe: "+hangSX);
          System.out.print("Giấy phép sản xuất: Năm "+giayPhep);
          System.out.print("Dung tích bình xăng: "+dtXang);
          System.out.println(" lít");
  
      }
}
