package desing.pattern.creational.builder;


public class BaseChair {

	private int height;
	private int weight;
	private String brand;
	private String color;

	public BaseChair() {

	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String printInfo() {
		return ("Brand: " + getBrand() + " Color: " + getColor() + " Height: " + getHeight() + "");
	}

	public  Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private BaseChair chair;

		private Builder() {

		}

		public Builder setHeight(int height) {
			this.chair.height = height;
			return this;
		}

		public Builder setWeight(int weight) {
			this.chair.weight = weight;
			return this;
		}

		public Builder setBrand(String brand) {
			this.chair.brand = brand;
			return this;
		}

		public Builder setColor(String color) {
			this.chair.color = color;
			return this;
		}

		public BaseChair build() {
			return this.chair;
		}

	}

}
