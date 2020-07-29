package entity;

import java.util.List;

import generalvrp.vo.ParameterVO;
import generalvrp.vo.PlaceVO;
import generalvrp.vo.VehicleVO;

public class GeneralInstance {

	public Parameter parameters;
	public List<Place> places;
	public List<Vehicle> vehicles;
	public List<Order> orders;
	
	public GeneralInstance(Parameter parameters, List<Place> places, List<Vehicle> vehicles, List<Order> orders) {
		super();
		this.parameters = parameters;
		this.places = places;
		this.vehicles = vehicles;
		this.orders = orders;
	}
	
	
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
}
