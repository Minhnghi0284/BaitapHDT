package vn.edu.giadinh.Lab3;
import java.util.Scanner;
public class Baitap1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        int souoc = 0;
        for (int i = 1;i <= n;i++){
            if (n % i == 0){
                souoc++;
            }
        }if (souoc == 2){
            System.out.print("" +n);
            System.out.println(" là số nguyên tố");
        }
        else{
            System.out.print("" +n);
            System.out.println(" không phải là số nguyên tố");
        }
    } 
}
