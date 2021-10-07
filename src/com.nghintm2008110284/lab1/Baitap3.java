package vn.edu.giadinh.Lab1;
import java.util.Scanner;
public class Baitap3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double ketQua;
        ketQua = Math.pow(canh, 3);

        System.out.printf("Thể tích khối lập phương là: %.2f",ketQua);
    }
}
