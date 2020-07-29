package entity;

import java.util.Date;
import java.util.List;

import generalvrp.vo.TypePlaceEnum;

public class Place{

	public Integer id;
	public Double x;
	public Double y;
	public TypePlaceEnum type;
	public List<String> vehicleCompatible;
	public Date beginOperation;
	public Date endOperation;
}
