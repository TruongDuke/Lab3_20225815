package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered ++;
		   System.out.println("The disc has been added");
		}
		if(qtyOrdered==MAX_NUMBERS_ORDERED) {
		System.out.println("The cart is now full");
			
		}
		else {
			System.out.println("The cart is already full. You cannot add more items");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(DigitalVideoDisc dvd:dvdList) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered[qtyOrdered] = dvd;
				qtyOrdered++;
				System.out.println("The disc \"" + dvd.getTitle() + "\" has been added.");
			}else {
				System.out.println("The order is almost full. Cannot add more DVDs.");
			}
		}
	}
		public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
			boolean find =false;
			for(int i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i]==disc) {
				find =true;
				for(int j=i;j<qtyOrdered-1;j++) {
					itemsOrdered[j]=itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1]=null;
				qtyOrdered --;
				System.out.println("The disc has been removed.");
			}
			if(find==false) {
				System.out.println("The disc was not found in the cart.");
			}
		}
		

	}
		public float totalCost() {
			float total = 0.0f;
			for(int i = 0;i < qtyOrdered;i++) {
				total += itemsOrdered[i].getCost();
			}
			return total;
		}
		public void printOrder() {
			System.out.println("Order Items: ");
			for (DigitalVideoDisc dvd : itemsOrdered) {
				System.out.println("- " + dvd.getTitle() + "---Cost: " + dvd.getCost());
			}
		}


		public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		    // Thêm dvd1 vào giỏ hàng
		    // Thêm dvd2 vào giỏ hàng
		}
		   public void print() {
		        StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
		        for (int i = 0; i < qtyOrdered;i++) {
		            output.append(i+1 + ".[" + itemsOrdered[i].getTitle() + "] - [" + itemsOrdered[i].getCategory() + "] - ["
		                    + itemsOrdered[i].getDirector() + "] - [" + itemsOrdered[i].getLength() + "]: "
		                    + itemsOrdered[i].getCost() + " $\n");
		        }
		        output.append("total: ").append(totalCost()).append(" $\n");
		        output.append("***************************************************\n");
		        System.out.println(output);
		    }
}
