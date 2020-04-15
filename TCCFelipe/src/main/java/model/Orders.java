package model;

import java.util.ArrayList;

public class Orders {

	private int id;
	private int from;
	private int to;
	private ArrayList<String> vehicleCompatible = new ArrayList<String>();
	private double[] totals = new double[5];

	public Orders() {
		super();
	}
	
	public Orders(int id, int from, int to, ArrayList<String> vehicleCompatible, double[] totals) {
		super();
		setId(id);
		setFrom(from);
		setTo(to);
		setVehicleCompatible(vehicleCompatible);
		setTotals(totals);

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

	public double[] getTotals() {
		return totals;
	}

	public void setTotals(double[] totals) {
		this.totals = totals;
	}

}
