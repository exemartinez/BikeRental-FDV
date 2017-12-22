package fdv.bikerental.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fdv.bikerental.controller.RentManager;
import fdv.bikerental.model.RentRequest;
import fdv.bikerental.model.Rental;

public class RentManagerTest {

	RentRequest rentRequest_nbr_1;
	RentRequest rentRequest_nbr_2;
	RentRequest rentRequest_nbr_3;
	RentRequest rentRequest_nbr_4;
	RentManager rm=null;
	
	@Before
	public void setUp() throws Exception {
		//Setup the request for renting a bike.
		


		//Second rental request.
		rentRequest_nbr_2= new RentRequest();
		rentRequest_nbr_2.setNumberOfBikes(new Integer(1));
		rentRequest_nbr_2.setRentDuration(5);
		
		//Third rental request.
		rentRequest_nbr_3= new RentRequest();
		rentRequest_nbr_3.setNumberOfBikes(new Integer(3));
		rentRequest_nbr_3.setRentDuration(200);
		
		//Fourth rental request.
		rentRequest_nbr_4= new RentRequest();
		rentRequest_nbr_4.setNumberOfBikes(new Integer(6));
		rentRequest_nbr_4.setRentDuration(32);
		
		//Setting up the rental manager
		 this.rm = new RentManager();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test that a bike is rented for an entire week.
	 */
	@Test
	public void testPlaceRentEntireWeek() {

		Rental result= new Rental();

		//first rental request.
		rentRequest_nbr_1= new RentRequest();
		rentRequest_nbr_1.setNumberOfBikes(new Integer(3));
		rentRequest_nbr_1.setRentDuration(new Integer(168));
		
		result = rm.placeRent(this.rentRequest_nbr_1);
		
		assertTrue(result.getNumberOfBikes() == 3 && result.getRentCost() == 126);
		
		


	}
	
	/**
	 * Test that a bike is rented for five hours.
	 */
	@Test
	public void testPlaceRentFewHours() {
		
		
		//Test that a bike is rented for more than a week, and denials it.
		//Test that a bike is rented for more than a day, but less than a week, and denials it.
		//Rent a Bike for more than three people, and apply to a promotion.
		fail("not implemented.");
	}

}
