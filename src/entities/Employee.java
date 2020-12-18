package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	
	//Atributos
	private String name; 
	private Integer hours; 
	private Double valuePerHour; 
	
	//Construtores
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	//Getters and Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return this.hours * this.valuePerHour;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(name + " - $" +String.format("%.2f", this.payment()));
		return sb.toString();
	}
}
