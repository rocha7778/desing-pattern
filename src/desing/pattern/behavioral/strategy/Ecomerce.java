package desing.pattern.behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ecomerce {

	private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Order order = new Order();
	private static PayStrategy strategy = null;

	static {

		priceOnProducts.put(1, 2200);
		priceOnProducts.put(2, 4850);
		priceOnProducts.put(3, 1100);
		priceOnProducts.put(4, 890);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Hola");

		while (order.isOpen()) {

			int cost = 0;
			String continueChoice = "Y";

			do {
				System.out.println("Please, select a product:");
				System.out.println("1 - Mother board");
				System.out.println("2 - CPU");
				System.out.println("3 - HDD");
				System.out.println("4 - Memory");

				int choice = Integer.parseInt(reader.readLine());
				cost = priceOnProducts.get(choice);
				System.out.print("Count: ");
				int count = Integer.parseInt(reader.readLine());
				order.setTotalCost(cost * count);

				/* Some staff operations */

				System.out.println("Do you wish to continue selecting products? Y/N :" + "\n");
				continueChoice = reader.readLine();

			} while (continueChoice.equalsIgnoreCase("Y"));

			if (strategy == null) {

				System.out.println("Please, select a payment method:" + "\n" + "1 - PalPay" + "\n" + "2 - Credit Card");

				String paymentMethod = reader.readLine();

				if (paymentMethod.equals("1")) {
					strategy = new PayByPayPal();
				} else {
					strategy = new PayByCreditCard();
				}
			}

			order.processOrder(strategy);

			System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
			String proceed = reader.readLine();

			if (proceed.equalsIgnoreCase("P")) {

				if (strategy.pay(order.getTotalCost())) {
					System.out.println("Payment has been successful.");

				} else {
					System.out.println("FAIL! Please, check your data.");
				}
				order.setOpen(false);
			}
		}
	}

}
