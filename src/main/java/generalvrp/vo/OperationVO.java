package generalvrp.vo;

import java.time.LocalTime;

public class OperationVO {

	private LocalTime start;
	private LocalTime end;
	private double startSaturday;
	private double endSaturday;

	public OperationVO() {
		super();
	}

	public OperationVO(LocalTime start, LocalTime end, double startSaturday, double endSaturday) {
		super();
		setStart(start);
		setEnd(end);
		setStartSaturday(startSaturday);
		setEndSaturday(endSaturday);

	}

	public LocalTime getStart() {
		return start;
	}

	public void setStart(LocalTime start) {
		this.start = start;
	}

	public LocalTime getEnd() {
		return end;
	}

	public void setEnd(LocalTime end) {
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
