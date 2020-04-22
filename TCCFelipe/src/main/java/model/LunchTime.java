package model;

public class Lunch {

	private double start;
	private double end;
	private double delay;
	private double antecipation;

	public Lunch() {
		super();
	}

	public Lunch(double start, double end, double delay, double antecipation) {
		super();
		setStart(start);
		setEnd(end);
		setDelay(delay);
		setAntecipation(antecipation);

	}

	public double getStart() {
		return start;
	}

	public void setStart(double start) {
		this.start = start;
	}

	public double getEnd() {
		return end;
	}

	public void setEnd(double end) {
		this.end = end;
	}

	public double getDelay() {
		return delay;
	}

	public void setDelay(double delay) {
		this.delay = delay;
	}

	public double getAntecipation() {
		return antecipation;
	}

	public void setAntecipation(double antecipation) {
		this.antecipation = antecipation;
	}

}
