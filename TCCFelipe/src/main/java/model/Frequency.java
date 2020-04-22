package model;

import java.util.ArrayList;

public class Frequency {

	private String type;
	private ArrayList<String> daysOfWeekFixed;
	
	public Frequency() {
		super();
	}
	public Frequency(String type, ArrayList<String> daysOfWeekFixed) {
		super();
		setType(type);
		setDaysOfWeekFixed(daysOfWeekFixed);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getDaysOfWeekFixed() {
		return daysOfWeekFixed;
	}
	public void setDaysOfWeekFixed(ArrayList<String> daysOfWeekFixed) {
		this.daysOfWeekFixed = daysOfWeekFixed;
	}
	
}
