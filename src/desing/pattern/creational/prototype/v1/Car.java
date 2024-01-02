package desing.pattern.creational.prototype.v1;

public class Car {
	
	private final int id;
	private final String brand;
	private final int speedLimit;
	private final int secretKey;
	
	public Car(int id, String brand, int speedLimit) {
		super();
		this.id = id;
		this.brand = brand;
		this.speedLimit = speedLimit;
		this.secretKey = 0;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public int getSpeedLimit() {
		return speedLimit;
	}
	

}
