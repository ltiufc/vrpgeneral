package model;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LunchTime {

	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "YYYY-MM-DD'T'HH:MM:SS")
	// private final DateTimeFormatter start =
	// DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	// private LocalDateTime start;
	private Date start;
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "YYYY-MM-DD'T'HH:MM:SS")
	private Date end;

	public LunchTime() {
		super();
	}

	public LunchTime(LocalDateTime start, LocalDateTime end) {
		super();
		// setStart(start);
		// setEnd(end);
	}

	/*
	 * public LocalDateTime getStart() { return start; }
	 * 
	 * public void setStart(LocalDateTime start) { this.start = start; }
	 */

	/*
	 * public LocalDateTime getEnd() { return end; }
	 * 
	 * public void setEnd(LocalDateTime end) { this.end = end; }
	 */
}
