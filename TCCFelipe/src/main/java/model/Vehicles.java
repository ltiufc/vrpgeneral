package model;

public class Vehicles {

	private int id;
	private String kind;
	private int dc;
	private int[] limits = new int[5];

	public Vehicles() {
		super();
	}

	public Vehicles(int id, String kind, int dc, int[] limits) {
		super();
		setId(id);
		setKind(kind);
		setDc(dc);
		setLimits(limits);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getDc() {
		return dc;
	}

	public void setDc(int dc) {
		this.dc = dc;
	}

	public int[] getLimits() {
		return limits;
	}

	public void setLimits(int[] limits) {
		this.limits = limits;
	}

}
