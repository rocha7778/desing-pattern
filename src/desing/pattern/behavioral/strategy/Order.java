package desing.pattern.behavioral.strategy;

public class Order {
	
	private int totalCost = 0;
	private boolean isOpen = true;
	
	public int getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public void processOrder(PayStrategy strategy) {
		strategy.collectPaymentDetails();
	}
	
	

}
