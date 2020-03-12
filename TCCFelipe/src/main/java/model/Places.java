package model;

import java.util.ArrayList;

public class Places {

	private int id;
	private double x;
	private double y;
	private ArrayList<String> kind = new ArrayList<String>();
	private ArrayList<String> compatible = new ArrayList<String>();
	private int seqence;
	private double averageValue;
	private double averageWeight;
	private double averageTime;
	private double averageVolume;
	private double averageCubage;
	private double averageUnities;
	private double positivation;
	private boolean priority;
	private String vehicleFixed;
	private int frequency;
	private String daysFixed;
	private String weeksFixed;

	public Places() {
		super();
	}

	public Places(int id, double x, double y, ArrayList<String> kind, ArrayList<String> compatible, int seqence,
			double averageValue, double averageWeight, double averageTime, double positivation, boolean priority,
			String vehicleFixed, int frequency, String daysFixed, String weeksFixed) {
		super();
		setId(id);
		setX(x);
		setY(y);
		setKind(kind);
		setCompatible(compatible);
		setSeqence(seqence);
		setAverageValue(averageValue);
		setAverageWeight(averageWeight);
		setAverageTime(averageTime);
		setPositivation(positivation);
		setPriority(priority);
		setVehicleFixed(vehicleFixed);
		setFrequency(frequency);
		setDaysFixed(daysFixed);
		setWeeksFixed(weeksFixed);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public ArrayList<String> getKind() {
		return kind;
	}

	public void setKind(ArrayList<String> kind) {
		this.kind = kind;
	}

	public ArrayList<String> getCompatible() {
		return compatible;
	}

	public void setCompatible(ArrayList<String> compatible) {
		this.compatible = compatible;
	}

	public int getSeqence() {
		return seqence;
	}

	public void setSeqence(int seqence) {
		this.seqence = seqence;
	}

	public double getAverageValue() {
		return averageValue;
	}

	public void setAverageValue(double averageValue) {
		this.averageValue = averageValue;
	}

	public double getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}

	public double getAverageTime() {
		return averageTime;
	}

	public void setAverageTime(double averageTime) {
		this.averageTime = averageTime;
	}

	public double getPositivation() {
		return positivation;
	}

	public void setPositivation(double positivation) {
		this.positivation = positivation;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public String getVehicleFixed() {
		return vehicleFixed;
	}

	public void setVehicleFixed(String vehicleFixed) {
		this.vehicleFixed = vehicleFixed;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getDaysFixed() {
		return daysFixed;
	}

	public void setDaysFixed(String daysFixed) {
		this.daysFixed = daysFixed;
	}

	public String getWeeksFixed() {
		return weeksFixed;
	}

	public void setWeeksFixed(String weeksFixed) {
		this.weeksFixed = weeksFixed;
	}

}
