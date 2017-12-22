package fdv.bikerental.model;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class RentByWeek extends RentType
{
	public final Double COST = new Double(60);
	public final Integer TIME_SPAN = new Integer(24 * 7); //one week.
	public Double getCOST() {
		return COST;
	}
	public Integer getTIME_SPAN() {
		return TIME_SPAN;
	}

}

