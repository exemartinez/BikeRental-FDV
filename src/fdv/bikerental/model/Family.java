package fdv.bikerental.model;

/**
 * How the Family promotion should work, and what restrictions it has.
 * @generated
 */

public class Family extends Promotion
{

	protected final Double discount = new Double(0.3); //this is a 30% discount
	protected final Integer minAmountRentedModels=new Integer(3);
	protected final Integer maxAmountRentedModels=new Integer(5);
	
	public Double getDiscount() {
		return discount;
	}
	public Integer getMinAmountRentedModels() {
		return minAmountRentedModels;
	}
	public Integer getMaxAmountRentedModels() {
		return maxAmountRentedModels;
	}
	

}

