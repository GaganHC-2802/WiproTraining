package oops;

public class BillAmt2 {
	public static void main(String[] args) {
	       BillAmt[] items = {
	           new BillAmt("Laptop", 50000, 1),
	           new BillAmt("Mouse", 500, 2),
	           new BillAmt("Keyboard", 1000, 1)
	       };
	       double grandTotal = 0;
	       System.out.println("Product\tPrice\tQty\tTotal");
	       System.out.println("--------------------------------------");
	       for (BillAmt item : items) {
	           item.displayItem();
	           grandTotal += item.getTotalPrice();
	       }
	       System.out.println("--------------------------------------");
	       System.out.println("Grand Total: " + grandTotal);
	   }
}
