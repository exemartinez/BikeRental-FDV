package fdv.bikerental.model;


/**
 * This is an abstract class that defines the form that has to have a typical promotion, but it has to be subclassed.
 */

public class Promotion
{

	
	protected Double discount=new Double(1);
	protected Integer minAmountRentedModels=new Integer(1);
	protected Integer maxAmountRentedModels=new Integer(Integer.MAX_VALUE);
	
	
	public Integer getMinAmountRentedModels() {
		return minAmountRentedModels;
	}

	public Integer getMaxAmountRentedModels() {
		return maxAmountRentedModels;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}



}

