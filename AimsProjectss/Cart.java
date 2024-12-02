

public class Cart {
	public static final int MAX_NUMBERS_ORDERED=20;
	private DigitalVideoDisc itemsOrdered[]=
	    new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
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

		public void addDigitalVideoDisc(DigitalVideoDisc... disc) {
		    // Thêm từng DVD trong danh sách dvds vào giỏ hàng
		}
		public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		    // Thêm dvd1 vào giỏ hàng
		    // Thêm dvd2 vào giỏ hàng
		}
}
