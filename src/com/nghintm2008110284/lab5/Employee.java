package com.nghintm2008110284.lab5;

public class Employee {
       //attribute - thuộc tính

       String tenNV;
       String ngaySinh;
       String diaChi;
       String boPhan;
       double luong;
   
       //methood - function
       //hàm tạo mặc định
   
       Employee(){
   
           tenNV = "Vòng Phi Q";
           ngaySinh = "20/03/2000";
           diaChi = "Tp.Đà Lạt";
           boPhan = "Phó Phòng";
           luong = 50.000;
   
       }
   
       //hàm tạo 1 tham số
   
       Employee(double a){
   
           tenNV = "Nguyễn Minh N";
           ngaySinh = "13/03/2001";
           diaChi = "Tp.Đà Lạt";
           boPhan = "Nhân viên văn phòng";
           luong = 15.000;
   
       }
   
       //hàm tạo 2 tham số
   
       Employee(double m, double n){
   
           tenNV = "Trần Vũ Đ";
           ngaySinh = "23/09/2001";
           diaChi = "Hà Nội";
           boPhan = "Giám đốc kĩ thuật";
           luong = n;
   
       }
   
       void inThongTin(){
   
           System.out.println("Tên nhân viên: "+tenNV);
           System.out.println("Ngày sinh: "+ngaySinh);
           System.out.println("Địa chỉ: "+diaChi);
           System.out.println("Bộ phận làm việc: "+boPhan);
           System.out.println("Lương: "+luong);
   
       } 
   
       double tinhLuong(int thang){
   
           double tien;
           tien = thang*luong;
           return tien;
   
       }  
}
