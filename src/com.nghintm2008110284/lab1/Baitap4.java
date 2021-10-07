package vn.edu.giadinh.Lab1;
import java.util.Scanner;
public class Baitap4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Lần lượt nhập vào các hệ số của PT Bậc 2:");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4*a*c;
        double canDelta = Math.sqrt(delta);
        System.out.printf("Căn bậc hai của delta là: %.2f", canDelta);
    }
}