package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class Warehouse {
	private ArrayList<String> inventory = new ArrayList<>();

	public Warehouse(String[] inventory) {
		Collections.addAll(this.inventory, inventory);
	}

	public void displayInventory() {
		String titleString = String.format("%s %20s", "Item Id", "Item");
		System.out.println("#".repeat(titleString.length()) + "\n" + titleString + "\n" +  "#".repeat(titleString.length()));

		for (int i = 0; i < this.inventory.size(); i++) {
			System.out.println(String.format("%s %26s", Integer.toString(i), this.inventory.get(i)));
		}
	}

	public ArrayList<String> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<String> inventory) {
		this.inventory = inventory;
	}
}
