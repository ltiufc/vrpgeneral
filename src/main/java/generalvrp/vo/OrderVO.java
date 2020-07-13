package generalvrp.vo;

import java.util.Date;
import java.util.List;

public class OrderVO {

	public Integer id;
	public Integer from;
	public Integer to;
	public List<String> vehicleCompatible;
	public Date beginTimeWindow;
	public Date endTimeWindow;
	public Double serviceTime;
	public Double monetaryValue;
	public Double weight;
	public Double volume;
	public Double cubage;
	public Double containers;
	public String type;
	public Integer positivation;
	public Boolean priority;
	public String vehicleFixed;
	public FrequencyVO frequency;

}
