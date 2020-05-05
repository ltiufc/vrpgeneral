package generalvrp.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlacesVO {

	public int id;
	public double latitude;
	public double longitude;
	public List<PlacesEnum> type;
	public ArrayList<String> vehicleCompatible;
	public Date beginOperation;
	public Date endOperation;

}
