package fdv.bikerental.controller;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import fdv.bikerental.model.BikeModel;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StockManager
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Map stock;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Map<String, BikeModel> bikeModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StockManager(){
		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean restoreModel(int amount, BikeModel bikeModel) {
		// TODO implement me
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getModelAvailability(Map models) {
		// TODO implement me
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean rentModel(BikeModel bike) {
		// TODO implement me
		return false;
	}

	public Map getStock() {
		return stock;
	}

	public void setStock(Map stock) {
		this.stock = stock;
	}

	public Map<String, BikeModel> getBikeModels() {
		return this.bikeModels;
	}

	public void setBikeModels(Map<String, BikeModel> bikeModels) {
		this.bikeModels = bikeModels;
	}

}

