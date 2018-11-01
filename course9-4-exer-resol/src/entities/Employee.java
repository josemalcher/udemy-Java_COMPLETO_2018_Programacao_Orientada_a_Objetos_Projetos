package entities;

public class Employee {
	private String nome;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
	
	}
	
	public Employee(String nome, Integer hours, Double valuePerHour) {
		this.nome = nome;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return hours * valuePerHour;
	}
	
}
