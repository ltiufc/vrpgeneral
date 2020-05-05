package generalvrp.vo;

import java.util.Date;
import java.util.List;

public class OrderVO {

	public int id;
	public int from;
	public int to;
	public List<String> vehicleCompatible;
	public Date beginTimeWindow;
	public Date endTimeWindow;
	public double serviceTime;
	public double monetaryValue;
	public double weight;
	public double volume;
	public double cubage;
	public double containers;
	public String type;
	public int positivation;
	public boolean priority;
	public String vehicleFixed;
	public FrequencyVO frequency;

}
