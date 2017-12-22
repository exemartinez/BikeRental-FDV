package fdv.bikerental.model;


/**
 * Implements the constraints to rent a bike, in general terms.
 * @generated
 */

public abstract class RentType
{

	
	public Double COST;	
	public Double getCOST() {
		return COST;
	}

	public void setCOST(Double cOST) {
		COST = cOST;
	}

	public Integer getTIME_SPAN() {
		return TIME_SPAN;
	}

	public void setTIME_SPAN(Integer tIME_SPAN) {
		TIME_SPAN = tIME_SPAN;
	}

	public Integer TIME_SPAN;

	public RentType(){
		super();
	}

}

