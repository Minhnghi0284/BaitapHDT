package com.nghintm2008110284.lab4;
import java.util.Scanner;
public class Costomer {
    String name;
	String address;

	Scanner scanner = new Scanner(System.in);

	String getName(){	

		System.out.print("Nhap ho va ten khach hang: ");
		name = scanner.nextLine();
		return name;

	}

	String getAddress(){

		System.out.print("Nhap dia chi cua khach hang: ");
		address = scanner.nextLine();
		return address;

	}

	void show(){

		System.out.println("Ho va ten: " +name);
		System.out.println("Dia chi: " +address);

	}
}    
