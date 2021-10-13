package com.nghintm2008110284.lab5;

public class Book {
      //attribute - thuộc tính

      String nhaXuatBan;
      double namXuatBan;
      double giaBan;
      String loai;
  
      //methood - function
      //hàm tạo mặc định
  
      Book(){
  
          loai = " Hoàng Tử Bé";
          nhaXuatBan = "Antoine de Saint-Exupéry";
          namXuatBan = 1943;
          giaBan = 72.000;
  
      }
  
      //hàm tạo 1 tham số
  
      Book(double a){
  
          loai = "Cây cam ngọt ngào của tôi";
          nhaXuatBan = "José Mauro de Vasconcelos";
          namXuatBan = 1968;
          giaBan = 100.000;
  
      }
  
      //hàm tạo 2 tham số
  
      Book(double m, double n){
  
          loai = "Tuổi trẻ đáng giá bao nhiêu";
          nhaXuatBan = "Rosie Nguyễn";
          namXuatBan = 2016;
          giaBan = 70.000;
  
      }
  
      void gioiThieuSach(){
  
          System.out.println("Loại Sách: "+loai);
          System.out.println("Nhà xuất bản: "+nhaXuatBan);
          System.out.println("Năm xuất bản: "+namXuatBan);
          System.out.println("Giá bán: "+giaBan);
  
      }
  
      double thanhTien(int soLuong){
  
          double tien;
          tien = soLuong*giaBan;
          return tien;
  
      }
}
