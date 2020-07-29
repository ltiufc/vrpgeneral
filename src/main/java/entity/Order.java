package entity;

import java.util.Date;
import java.util.List;

import org.apache.commons.math3.distribution.AbstractRealDistribution;

import generalvrp.vo.FrequencyVO;

public class Order {

	public Integer id;
	public Integer from;
	public Integer to;
	public List<String> vehicleCompatible;
	public Date beginTimeWindow;
	public Date endTimeWindow;
	public Double serviceTime;
	public Distribution monetaryValue;
	public Distribution weight;
	public Distribution volume;
	public Distribution cubage;
	public Distribution containers;
	public Integer positivation;
	public Boolean priority;
	public String vehicleFixed;
	public FrequencyVO frequency;

}
