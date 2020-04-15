package model;

import java.util.ArrayList;

public class Places {

	private int id;
	private double x;
	private double y;
	private ArrayList<String> kind = new ArrayList<String>();
	private ArrayList<String> vehicleCompatible = new ArrayList<String>();
	private int seqence;
	private int begin;
	private int end;
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

	public Places(int id, double x, double y, ArrayList<String> kind, ArrayList<String> vehicleCompatible, int seqence,
			int begin, int end, double averageValue, double averageWeight, double averageTime, double averageVolume,
			double averageCubage, double averageUnities, double positivation, boolean priority, String vehicleFixed,
			int frequency, String daysFixed, String weeksFixed) {
		super();
		setId(id);
		setX(x);
		setY(y);
		setKind(kind);
		setVehicleCompatible(vehicleCompatible);
		setSeqence(seqence);
		setBegin(begin);
		setEnd(end);
		setAverageValue(averageValue);
		setAverageWeight(averageWeight);
		setAverageTime(averageTime);
		setAverageVolume(averageVolume);
		setAverageCubage(averageCubage);
		setAverageUnities(averageUnities);
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

	public ArrayList<String> getVehicleCompatible() {
		return vehicleCompatible;
	}

	public void setVehicleCompatible(ArrayList<String> vehicleCompatiblee) {
		this.vehicleCompatible = vehicleCompatible;
	}

	public int getSeqence() {
		return seqence;
	}

	public void setSeqence(int seqence) {
		this.seqence = seqence;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
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

	public double getAverageVolume() {
		return averageVolume;
	}

	public void setAverageVolume(double averageVolume) {
		this.averageVolume = averageVolume;
	}

	public double getAverageCubage() {
		return averageCubage;
	}

	public void setAverageCubage(double averageCubage) {
		this.averageCubage = averageCubage;
	}

	public double getAverageUnities() {
		return averageUnities;
	}

	public void setAverageUnities(double averageUnities) {
		this.averageUnities = averageUnities;
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
