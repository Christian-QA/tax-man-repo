package tax.man.pack;

	public class Runner {
		
		public static void main(String[] args) {
			
			UserMeth name_inst = new UserMeth();
			System.out.println(name_inst.Return_Username());
			
			float annual_income = name_inst.salary();
			
			System.out.println("$" + annual_income + " annually");
			System.out.println("$" + annual_income/12 + " monthly");
			System.out.println("$" + annual_income/365 + " daily");
		
			
			double tax = name_inst.tax(annual_income);
			
			System.out.println("You pay $" + tax + " in tax, son");
			
			
			
			
			
			
		}
						
				
	}




