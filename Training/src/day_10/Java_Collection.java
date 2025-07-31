package day_10;

import java.util.ArrayList;

public class Java_Collection {
	class Department{
		private String name;
		private double sales;
		private double expenses;
		
		public Department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		public double getProfit() {
			return sales-expenses;
		}
		public String getName() {
			return name;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Department> dept = new ArrayList();
		dept.add(new Java_Collection().new Department("sales ", 350000, 125000));
		dept.add(new Java_Collection().new Department("marketing ", 150000, 25000));
		dept.add(new Java_Collection().new Department("research ", 450000, 225000));
		
		for(Department d : dept) {
			System.out.println(d.getName() + " profit : " + d.getProfit());
		}
		dept.sort((d1, d2) -> Double.compare(d2.getProfit(), d1.getProfit()));
		
		for(Department d : dept) {
			System.out.println(d.getName() + " profit : " + d.getProfit());
		}
	}

}
