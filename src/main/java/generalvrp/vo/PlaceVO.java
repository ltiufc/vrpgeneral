package generalvrp.vo;

import java.util.Date;
import java.util.List;

public class PlaceVO {

	public int id;
	public double latitude;
	public double longitude;
	public PlacesEnum type;
	public List<String> vehicleCompatible;
	public Date beginOperation;
	public Date endOperation;

}
