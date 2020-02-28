package model;

public class Params {

	private Operation operation;
	private Lunch lunch;
	private boolean returnDC;
	private boolean useTW;
	private boolean useOvernight;
	private boolean startDC;
	private double loadVelocity;
	private double planningHorizon;
	private int clientCode;
	private String type;
	private DC dc;
	private double radiusMax;
	private boolean pathEuclidians;
	private int sectorSweep;
	private boolean worksOnSaturday;
	private String routerProblem;
	private int mapCode;
	private int XXXXzones;
	private int XXXXcrews;

	public Params() {
		super();
	}

	public Params(Operation operation, Lunch lunch, boolean returnDC, boolean useTW, boolean useOvernight,
			boolean startDC, double loadVelocity, double planningHorizon, int clientCode, String type, DC dc,
			double radiusMax, boolean pathEuclidians, int sectorSweep, boolean worksOnSaturday, String routerProblem,
			int mapCode, int xXXXzones, int xXXXcrews) {
		super();
		setOperation(operation);
		setLunch(lunch);
		setReturnDC(returnDC);
		setUseTW(useTW);
		setUseOvernight(useOvernight);
		setStartDC(startDC);
		setLoadVelocity(loadVelocity);
		setPlanningHorizon(planningHorizon);
		setClientCode(clientCode);
		setType(type);
		setDc(dc);
		setRadiusMax(radiusMax);
		setPathEuclidians(pathEuclidians);
		setSectorSweep(sectorSweep);
		setWorksOnSaturday(worksOnSaturday);
		setRouterProblem(routerProblem);
		setMapCode(mapCode);
		setXXXXzones(xXXXzones);
		setXXXXcrews(xXXXcrews);

	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Lunch getLunch() {
		return lunch;
	}

	public void setLunch(Lunch lunch) {
		this.lunch = lunch;
	}

	public boolean isReturnDC() {
		return returnDC;
	}

	public void setReturnDC(boolean returnDC) {
		this.returnDC = returnDC;
	}

	public boolean isUseTW() {
		return useTW;
	}

	public void setUseTW(boolean useTW) {
		this.useTW = useTW;
	}

	public boolean isUseOvernight() {
		return useOvernight;
	}

	public void setUseOvernight(boolean useOvernight) {
		this.useOvernight = useOvernight;
	}

	public boolean isStartDC() {
		return startDC;
	}

	public void setStartDC(boolean startDC) {
		this.startDC = startDC;
	}

	public double getLoadVelocity() {
		return loadVelocity;
	}

	public void setLoadVelocity(double loadVelocity) {
		this.loadVelocity = loadVelocity;
	}

	public double getPlanningHorizon() {
		return planningHorizon;
	}

	public void setPlanningHorizon(double planningHorizon) {
		this.planningHorizon = planningHorizon;
	}

	public int getClientCode() {
		return clientCode;
	}

	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DC getDc() {
		return dc;
	}

	public void setDc(DC dc) {
		this.dc = dc;
	}

	public double getRadiusMax() {
		return radiusMax;
	}

	public void setRadiusMax(double radiusMax) {
		this.radiusMax = radiusMax;
	}

	public boolean isPathEuclidians() {
		return pathEuclidians;
	}

	public void setPathEuclidians(boolean pathEuclidians) {
		this.pathEuclidians = pathEuclidians;
	}

	public int getSectorSweep() {
		return sectorSweep;
	}

	public void setSectorSweep(int sectorSweep) {
		this.sectorSweep = sectorSweep;
	}

	public boolean isWorksOnSaturday() {
		return worksOnSaturday;
	}

	public void setWorksOnSaturday(boolean worksOnSaturday) {
		this.worksOnSaturday = worksOnSaturday;
	}

	public String getRouterProblem() {
		return routerProblem;
	}

	public void setRouterProblem(String routerProblem) {
		this.routerProblem = routerProblem;
	}

	public int getMapCode() {
		return mapCode;
	}

	public void setMapCode(int mapCode) {
		this.mapCode = mapCode;
	}

	public int getXXXXzones() {
		return XXXXzones;
	}

	public void setXXXXzones(int xXXXzones) {
		XXXXzones = xXXXzones;
	}

	public int getXXXXcrews() {
		return XXXXcrews;
	}

	public void setXXXXcrews(int xXXXcrews) {
		XXXXcrews = xXXXcrews;
	}

}
