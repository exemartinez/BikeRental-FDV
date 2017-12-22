package fdv.bikerental.model;

public class Rental {

	private Double rentCost = new Double(0);
	private Double durationNorm = new Double(0);
	private Integer numberOfBikes = new Integer(0);
	
	public Integer getNumberOfBikes() {
		return numberOfBikes;
	}

	public void setCost(double rentCost) {
		this.rentCost=rentCost;
		
	}

	public void setDuration(double durationNorm) {
		this.durationNorm = durationNorm;
		
	}

	public Double getRentCost() {
		return rentCost;
	}

	public Double getDurationNorm() {
		return durationNorm;
	}

	public void setNumberOfBikesRented(Integer numberOfBikes) {
		// TODO Auto-generated method stub
		
	}

}
