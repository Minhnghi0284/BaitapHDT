package com.nghintm2008110284.lab4;
import java.util.Scanner;
public class Employee {
    String name;
	int salary;

	Scanner scanner = new Scanner(System.in);

	String getName(){	

		System.out.print("Nhap ho va ten nhan vien: ");
		name = scanner.nextLine();
		return name;

	}
	int getSalary(){

		System.out.print("Nhap luong cua nhan vien: ");
		salary = scanner.nextInt();
		return salary;

	}
	void show(){

		System.out.println("Ho va ten nhan vien la: " +name);
		System.out.println("luong nhan vien la: " +salary);

	}

}
