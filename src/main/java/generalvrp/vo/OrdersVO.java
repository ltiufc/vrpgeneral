package generalvrp.vo;

import java.time.LocalTime;
import java.util.List;

public class OrdersVO {

	public int id;
	public int from;
	public int to;
	public List<String> vehicleCompatible;
	public LocalTime beginTimeWindow;
	public LocalTime endTimeWindow;
	public double monetaryValue;
	public double weightValue;
	public double volumeValue;
	public double cubageValue;
	public double containersValue;
	public int positivationValue;
	public boolean priority;
	public String vehicleFixed;
	public FrequencyVO frequency;

}
