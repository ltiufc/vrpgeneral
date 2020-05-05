package generalvrp.vo;

import java.util.Date;
import java.util.List;

public class PlaceVO {

	public int id;
	public double x;
	public double y;
	public TypePlaceEnum type;
	public List<String> vehicleCompatible;
	public Date beginOperation;
	public Date endOperation;

}
