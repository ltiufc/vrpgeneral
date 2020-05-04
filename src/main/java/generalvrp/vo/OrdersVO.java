package generalvrp.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrdersVO {

	public int id;
	public int from;
	public int to;
	public ArrayList<String> vehicleCompatible = new ArrayList<String>();
	public Date beginTimeWindow;
	public Date endTimeWindow;
	public double serviceTime;
	public double monetaryValue;
	public double weight;
	public double volume;
	public double cubage;
	public double containers;
	public String typeOrder;
	public int positivation;
	public boolean priority;
	public String vehicleFixed;
	public FrequencyVO frequency;

}
