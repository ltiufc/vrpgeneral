package generalvrp.vo;

public class VehiclesVO {

	private String id;
	private String kind;
	private int distributionCenter;
	private double monetaryLimit;
	private double weightLimit;
	private double volumeLimit;
	private double cubageLimit;
	private double containersLimit;

	public VehiclesVO() {
		super();
	}

	public VehiclesVO(String id, String kind, int distributionCenter, double monetaryLimit, double weightLimit,
			double volumeLimit, double cubageLimit, double containersLimit) {
		super();
		setId(id);
		setKind(kind);
		setDistributionCenter(distributionCenter);
		setMonetaryLimit(monetaryLimit);
		setWeightLimit(weightLimit);
		setVolumeLimit(volumeLimit);
		setCubageLimit(cubageLimit);
		setContainersLimit(containersLimit);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getDistributionCenter() {
		return distributionCenter;
	}

	public void setDistributionCenter(int distributionCenter) {
		this.distributionCenter = distributionCenter;
	}

	public double getMonetaryLimit() {
		return monetaryLimit;
	}

	public void setMonetaryLimit(double monetaryLimit) {
		this.monetaryLimit = monetaryLimit;
	}

	public double getWeightLimit() {
		return weightLimit;
	}

	public void setWeightLimit(double weightLimit) {
		this.weightLimit = weightLimit;
	}

	public double getVolumeLimit() {
		return volumeLimit;
	}

	public void setVolumeLimit(double volumeLimit) {
		this.volumeLimit = volumeLimit;
	}

	public double getCubageLimit() {
		return cubageLimit;
	}

	public void setCubageLimit(double cubageLimit) {
		this.cubageLimit = cubageLimit;
	}

	public double getContainersLimit() {
		return containersLimit;
	}

	public void setContainersLimit(double containersLimit) {
		this.containersLimit = containersLimit;
	}

}
