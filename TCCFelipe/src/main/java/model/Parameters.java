package model;

public class Parameters {

	//operation vai ser retirado mais tarde.
	//private Operation operation;
	private LunchTime lunchTime;
	private boolean isOpenRoute;
	private boolean useTimeWindows;
	private boolean isMultiperiod;


	public Parameters() {
		super();
	}


	public Parameters(Operation operation, LunchTime lunchTime, boolean isOpenRoute, boolean useTimeWindows,
			boolean isMultiperiod) {
		super();
		//this.operation = operation;
		setLunch(lunchTime);
		setOpenRoute(isOpenRoute);
		setUseTimeWindows(useTimeWindows);
		setMultiperiod(isMultiperiod);
	}


	/*public Operation getOperation() {
		return operation;
	}


	public void setOperation(Operation operation) {
		this.operation = operation;
	}
*/

	public LunchTime getLunch() {
		return lunchTime;
	}


	public void setLunch(LunchTime lunchTime) {
		this.lunchTime = lunchTime;
	}


	public boolean isOpenRoute() {
		return isOpenRoute;
	}


	public void setOpenRoute(boolean isOpenRoute) {
		this.isOpenRoute = isOpenRoute;
	}


	public boolean isUseTimeWindows() {
		return useTimeWindows;
	}


	public void setUseTimeWindows(boolean useTimeWindows) {
		this.useTimeWindows = useTimeWindows;
	}


	public boolean isMultiperiod() {
		return isMultiperiod;
	}


	public void setMultiperiod(boolean isMultiperiod) {
		this.isMultiperiod = isMultiperiod;
	}

	

}
