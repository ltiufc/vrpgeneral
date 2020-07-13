package generalvrp.vo;

import java.util.Date;
import java.util.List;

public class PlaceVO {

	public Integer id;
	public Double x;
	public Double y;
	public TypePlaceEnum type;
	public List<String> vehicleCompatible;
	public Date beginOperation;
	public Date endOperation;

}
