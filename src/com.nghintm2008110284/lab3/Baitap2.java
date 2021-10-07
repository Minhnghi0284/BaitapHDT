package vn.edu.giadinh.Lab3;

public class Baitap2 {
    public static void main(String[] args) {
        System.out.println("====== Bảng cửu chương =======");
        for(int i = 1; i <= 10; i++){
            System.out.printf("\n--------BẢNG NHÂN %d--------\n", i);
            for(int j = 0; j < 10; j++){
                System.out.printf("\t%d x %d = %d\n", i, j, i*j);
            }
        }
    } 
}
