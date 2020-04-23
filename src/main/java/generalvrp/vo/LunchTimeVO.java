package generalvrp.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class LunchTimeVO {

	//private final DateTimeFormatter start = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD'T'HH:MM:SS")
	public LocalDateTime start;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD'T'HH:MM:SS")
	public LocalDateTime end;
	
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD'T'HH:MM:SS")
	//private LocalDateTime end;

//	public LunchTimeVO() {
//		super();
//	}
//
//	public LunchTimeVO(LocalDateTime start, LocalDateTime end) {
//		super();
//		//setStart(start);
//		//setEnd(end);
//	}

	/*public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}*/

	/*public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}*/
}
