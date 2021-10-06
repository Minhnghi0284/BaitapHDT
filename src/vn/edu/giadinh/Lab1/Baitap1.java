package vn.edu.giadinh.Lab1;
import java.util.Scanner;
public class Baitap1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.printf("%s %.2f điểm", hoTen, diemTrungBinh);

    }
}