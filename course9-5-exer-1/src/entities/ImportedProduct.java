package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;

	public ImportedProduct(String nome, Double price, Double customsFee) {
		super(nome, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
	

}
