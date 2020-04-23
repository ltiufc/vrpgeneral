package generalvrp.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class PlacesVO {

	public int id;
	public double latitude;
	public double longitude;
	public ArrayList<String> type = new ArrayList<String>();
	public ArrayList<String> vehicleCompatible = new ArrayList<String>();
	public Date beginOperation;
	public Date endOperation;

}
