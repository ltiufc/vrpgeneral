package model;

public class Operation {

	private double start;
	private double end;
	private double startSaturday;
	private double endSaturday;

	public Operation() {
		super();
	}

	public Operation(double start, double end, double startSaturday, double endSaturday) {
		super();
		setStart(start);
		setEnd(end);
		setStartSaturday(startSaturday);
		setEndSaturday(endSaturday);

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

	public double getStartSaturday() {
		return startSaturday;
	}

	public void setStartSaturday(double startSaturday) {
		this.startSaturday = startSaturday;
	}

	public double getEndSaturday() {
		return endSaturday;
	}

	public void setEndSaturday(double endSaturday) {
		this.endSaturday = endSaturday;
	}

}
