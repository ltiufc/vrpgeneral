package model;

import java.util.ArrayList;

public class Orders {

	private int id;
	private int from;
	private int to;
	private ArrayList<String> compatible = new ArrayList<String>();
	private int[] totals = new int[5];

	public Orders() {
		super();
	}
	
	public Orders(int id, int from, int to, ArrayList<String> compatible, int[] totals) {
		super();
		setId(id);
		setFrom(from);
		setTo(to);
		setCompatible(compatible);
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

	public ArrayList<String> getCompatible() {
		return compatible;
	}

	public void setCompatible(ArrayList<String> compatible) {
		this.compatible = compatible;
	}

	public int[] getTotals() {
		return totals;
	}

	public void setTotals(int[] totals) {
		this.totals = totals;
	}

}
