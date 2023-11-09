package desing.pattern.creational.builder.chair;

public class Chair {

	private int id;
	private String name;

	private Chair() {
		
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Builder builder() {

		return new Builder();
	}

	public static class Builder {

		private Chair chair;

		public Builder() {
			chair = new Chair();
		}

		public Builder setId(int id) {
			this.chair.id = id;
			return this;
		}

		public Builder setName(String name) {
			this.chair.name = name;
			return this;
		}

		public Chair build() {
			return chair;
		}

	}

}
