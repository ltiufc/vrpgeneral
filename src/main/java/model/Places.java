package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Places {

	private int id;
	private double latitude;
	private double longitude;
	private ArrayList<String> type = new ArrayList<String>();
	private ArrayList<String> vehicleCompatible = new ArrayList<String>();

	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private Date beginOperation;

	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd'T'HH:mm:ss")
	private Date endOperation;

	public Places() {
		super();
	}

	public Places(int id, double latitude, double longitude, ArrayList<String> type,
			ArrayList<String> vehicleCompatible, Date beginOperation, Date endOperation) {
		super();
		setId(id);
		setLatitude(latitude);
		setLongitude(longitude);
		setType(type);
		setVehicleCompatible(vehicleCompatible);
		setBeginOperation(beginOperation);
		setEndOperation(endOperation);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public ArrayList<String> getType() {
		return type;
	}

	public void setType(ArrayList<String> type) {
		this.type = type;
	}

	public ArrayList<String> getVehicleCompatible() {
		return vehicleCompatible;
	}

	public void setVehicleCompatible(ArrayList<String> vehicleCompatible) {
		this.vehicleCompatible = vehicleCompatible;
	}

	public Date getBeginOperation() {
		return beginOperation;
	}

	public void setBeginOperation(Date beginOperation) {
		this.beginOperation = beginOperation;
	}

	public Date getEndOperation() {
		return endOperation;
	}

	public void setEndOperation(Date endOperation) {
		this.endOperation = endOperation;
	}

}
