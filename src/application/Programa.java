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
		//Employee employee = new Employee(); 
		//OutsourcedEmployee oe = new OutsourcedEmployee(); 
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt(); 
		for(int i = 0; i < n;i++) {
			System.out.println("Employee #" +(i + 1 ) + " data: ");
			System.out.print("Outsourced (Y/N)? ");//n
			Character out = sc.next().charAt(0);
			out = Character.toUpperCase(out);
			if(out == 'N') {
				sc.nextLine(); 
				System.out.print("Name: ");
				String name = sc.nextLine();//Alex
				System.out.print("Hours: ");
				Integer hours = sc.nextInt(); //Hours: 50
				System.out.print("Value per hour: ");//20.00
				Double valuePerHour = sc.nextDouble();
				Employee employee = new Employee(name, hours, valuePerHour); 
				list.add(employee);
			}else {
				sc.nextLine(); 
				System.out.print("Name: ");
				String name = sc.nextLine(); 
				System.out.print("Hours: ");
				Integer hours = sc.nextInt(); 
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble(); 
				System.out.print("Additional charge: ");
				Double aditional = sc.nextDouble(); 
				OutsourcedEmployee os = new OutsourcedEmployee(name,hours,valuePerHour, aditional);
				list.add(os);
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
