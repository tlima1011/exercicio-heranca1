package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt(); 
		for(int i = 0; i < n;i++) {
			System.out.println("Employee #" +(i + 1 ) + " data: ");
			System.out.print("Outsourced (Y/N)? ");//n
			Character out = sc.next().charAt(0);
			out = Character.toUpperCase(out);
			sc.nextLine(); 
			System.out.print("Name: ");
			String name = sc.nextLine();//Alex
			System.out.print("Hours: ");
			Integer hours = sc.nextInt(); //Hours: 50
			System.out.print("Value per hour: ");//20.00
			Double valuePerHour = sc.nextDouble();
			if(out == 'N') { 
				list.add(new Employee(name, hours, valuePerHour));
			}else {
				System.out.print("Additional charge: ");
				Double aditional = sc.nextDouble(); 
				list.add(new OutsourcedEmployee(name,hours,valuePerHour, aditional));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employees : list) {
			System.out.println(employees);
		}
		sc.close();
	}
}
