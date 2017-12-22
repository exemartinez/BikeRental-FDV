package fdv.bikerental.model;

/**
 * This class represents a bike rent request placed by a client. It is assumed that this class comes fulfilled by the front-end.
 * The problems has been simplified to be able to finish the assignment on time.
 * I'm assuming we have just ONE TYPE of bike.
 * @generated
 */

public class RentRequest
{

	private Integer rentDuration;	
	private RentType rentType;
	private Integer numberOfBikes;
	private Promotion promotion;
	
	
	/*Getters and Setters
	 * */
	public Integer getRentDuration() {
		return rentDuration;
	}

	public void setRentDuration(Integer rentDuration) {
		this.rentDuration = rentDuration;
	}

	public RentType getRentType() {
		return rentType;
	}

	public void setRentType(RentType rentType) {
		this.rentType = rentType;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public Integer getNumberOfBikes() {
		
		return numberOfBikes;
	}

	public void setNumberOfBikes(Integer numberOfBikes) {
		
		this.numberOfBikes = numberOfBikes;
	}
	

	



}

