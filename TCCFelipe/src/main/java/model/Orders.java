package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonFormat;

public class Orders {

	private int id;
	private int from;
	private int to;
	private ArrayList<String> vehicleCompatible = new ArrayList<String>();
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime beginTimeWindow;
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime endTimeWindow;
	private double monetaryValue;
	private double weight;
	private double volume;
	private double cubage;
	private double containers;
	private int positivation;
	private boolean priority;
	private String vehicleFixed;
	private Frequency frequency;

	public Orders() {
		super();
	}

	public Orders(int id, int from, int to, ArrayList<String> vehicleCompatible, LocalDateTime beginTimeWindow,
			LocalDateTime endTimeWindow, double monetaryValue, double weight, double volume, double cubage,
			double containers, int positivation, boolean priority, String vehicleFixed, Frequency frequency) {
		super();
		setId(id);
		setFrom(from);
		setTo(to);
		setVehicleCompatible(vehicleCompatible);
		setBeginTimeWindow(beginTimeWindow);
		setEndTimeWindow(endTimeWindow);
		setMonetaryValue(monetaryValue);
		setWeight(weight);
		setVolume(volume);
		setCubage(cubage);
		setPositivation(positivation);
		setPriority(priority);
		setVehicleFixed(vehicleFixed);
		setFrequency(frequency);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public ArrayList<String> getVehicleCompatible() {
		return vehicleCompatible;
	}

	public void setVehicleCompatible(ArrayList<String> vehicleCompatible) {
		this.vehicleCompatible = vehicleCompatible;
	}

	public LocalDateTime getBeginTimeWindow() {
		return beginTimeWindow;
	}

	public void setBeginTimeWindow(LocalDateTime beginTimeWindow) {
		this.beginTimeWindow = beginTimeWindow;
	}

	public LocalDateTime getEndTimeWindow() {
		return endTimeWindow;
	}

	public void setEndTimeWindow(LocalDateTime endTimeWindow) {
		this.endTimeWindow = endTimeWindow;
	}

	public double getMonetaryValue() {
		return monetaryValue;
	}

	public void setMonetaryValue(double monetaryValue) {
		this.monetaryValue = monetaryValue;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getCubage() {
		return cubage;
	}

	public void setCubage(double cubage) {
		this.cubage = cubage;
	}

	public double getContainers() {
		return containers;
	}

	public void setContainers(double containers) {
		this.containers = containers;
	}

	public int getPositivation() {
		return positivation;
	}

	public void setPositivation(int positivation) {
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

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

}
