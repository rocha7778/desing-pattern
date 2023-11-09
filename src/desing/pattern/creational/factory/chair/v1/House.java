package desing.pattern.creational.factory.chair.v1;

public abstract class House {
	private int id;
	private String roof;
	private String chimney;
	private String balcony;
	
	
	public House() {
		super();
	}

	public House(int id, String roof, String chimney, String balcony) {
		super();
		this.id = id;
		this.roof = roof;
		this.chimney = chimney;
		this.balcony = balcony;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String getChimney() {
		return chimney;
	}

	public void setChimney(String chimney) {
		this.chimney = chimney;
	}

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}
	
	public abstract House createHouse();

}
