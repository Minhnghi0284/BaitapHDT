package vn.edu.giadinh.Lab1;
import java.util.Scanner;
public class Baitap2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong)*2;
        System.out.printf("Chu vi của hình chữ nhật là: %.2f", chuVi);
        double dienTich = chieuDai*chieuRong;
        System.out.printf("\nDiện tích của hình chữ nhật là: %.2f", dienTich);
        double canhNho = Math.min(chieuDai, chieuRong);
        System.out.println("\nCạnh nhỏ của hình chữ nhật là: " + canhNho);
    }
}