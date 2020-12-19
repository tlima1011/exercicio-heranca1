package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double aditional;
	//Construtores 
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double aditional) {
		super(name, hours, valuePerHour);
		this.aditional = aditional;
	}
	@Override
	public double payment() {
		return super.payment() + (aditional * 1.1);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(this.getName() + " - $");
		sb.append(String.format("%.2f", this.payment()));
		return sb.toString();
	}
}
