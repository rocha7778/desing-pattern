package desing.pattern.creational.builder;

public class Bolsillo {

	private int id;
	private String accountId;
	private String name;
	private String address;

	public Bolsillo(int id, String accountId, String name, String address) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.name = name;
		this.address = address;
	}

	public Bolsillo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private Bolsillo bolsillo;

		public Builder() {
			bolsillo = new Bolsillo();
		}

		public Builder setId(int id) {
			this.bolsillo.id = id;
			return this;
		}

		public Builder setAccountId(String accountId) {
			this.bolsillo.accountId = accountId;
			return this;
		}

		public Builder setName(String name) {
			this.bolsillo.name = name;
			return this;
		}

		public Builder setAddress(String address) {
			this.bolsillo.address = address;
			return this;
		}
		
		public  Bolsillo build() {
			return this.bolsillo;
		}

	}

}