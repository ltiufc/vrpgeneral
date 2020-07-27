package entity;

import java.util.List;

import generalvrp.vo.ParameterVO;
import generalvrp.vo.PlaceVO;
import generalvrp.vo.VehicleVO;

public class GeneralInstance {

	public ParameterVO parameters;
	public List<PlaceVO> places;
	public List<VehicleVO> vehicles;
	public List<Order> orders;
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
}
