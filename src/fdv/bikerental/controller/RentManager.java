package fdv.bikerental.controller;

import fdv.bikerental.model.Family;
import fdv.bikerental.model.Promotion;
import fdv.bikerental.model.RentRequest;
import fdv.bikerental.model.Rental;

/**
 * This receives a rentRequest and a client object and handles the rental; the
 * scope goes all the way down to decide which promotion to apply.
 */

public class RentManager {

	private RentRequest rentRequest;
	private Promotion promotion;

	public RentManager(){
		//Decide which promotions will apply in this period of time. This is ideal for IoC.
		 this.promotion= new Family();
		
	}
	/**
	 * If the rent has been placed, it returns the number of hours until the bike
	 * has to be returned. Zero if the bike couldn't be rented or something (next
	 * time I will implment stock, I promese ^_^)
	 * 
	 * @generated
	 * @ordered
	 */

	public Rental placeRent(RentRequest rentRequest) {
		Rental rent = new Rental();
		
		this.rentRequest = rentRequest;

		// Decide which promotion applies
		Double discount = this.applyPromotion();
		
		Double dur = (double)this.rentRequest.getRentDuration(); 
		Double timeSpan = (double)this.rentRequest.getRentType().getTIME_SPAN();
		
		Double durationNorm = dur/timeSpan;
		Double costMultiplier = new Double(1 - discount);
		
		//Establish the rental cost of all the bikes, duration and everything
		double rentCost = this.rentRequest.getRentType().COST * this.rentRequest.getNumberOfBikes()
				* durationNorm * costMultiplier;
		
		//Forming the resulting object: a bike rental.
		rent.setNumberOfBikesRented(this.rentRequest.getNumberOfBikes());
		rent.setCost(rentCost);
		rent.setDuration(durationNorm);

		// validate the kind of rent
		return rent;
	}

	/**
	 * This validates if the rent request applies for any promotions and enrichs the
	 * RentRequest object if so.
	 * 
	 * @generated
	 * @ordered
	 */

	private Double applyPromotion() {
		// decide if a promotion applies, and set it up.
	
		if ((this.rentRequest.getNumberOfBikes() > this.promotion.getMinAmountRentedModels()) || (this.rentRequest.getNumberOfBikes() < this.promotion.getMaxAmountRentedModels())) {
			return this.promotion.getDiscount(); 
		}

		return new Double(1);
	}

}
