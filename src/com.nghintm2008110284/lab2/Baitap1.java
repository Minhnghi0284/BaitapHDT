package vn.edu.giadinh.Lab2;
import java.util.Scanner;
public class Baitap1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Giải phương trình bậc nhất: ax + b = 0");       
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: "); 
        double b = scanner.nextDouble(); 
        if(a == 0){ 
            if(b == 0){
                System.out.println("Vô số nghiệm");
            }
            else{ 
                System.out.println("Vô nghiệm");
            }
        }      
        else{
            double x = -b/a;
            System.out.printf("Nghiệm x = %.2f", x);
        }
    } 
}
