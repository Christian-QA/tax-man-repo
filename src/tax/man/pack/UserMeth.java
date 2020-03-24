package tax.man.pack;

import java.util.Scanner;

public class UserMeth {
		
		public String Return_Username() {
			
			Scanner obj_name = new Scanner(System.in);
			System.out.println("Please enter full name: ");
			String username = obj_name.nextLine();
			return username;
			
		}
		

		
		public float salary() {
			
			Scanner obj_salary = new Scanner(System.in);
			System.out.println("Annual Income: ");
			float salary_annual = obj_salary.nextFloat();
			
			return salary_annual;
						
		}
		
		
		public double tax(double num_10) {
			
			if (num_10 < 21000) {
				return num_10 * 0.1;			
			} else if (num_10 > 21000 && num_10 < 32500) {
				return num_10 * 0.2;
			} else {
				return num_10 * 0.4;
			}
			
			
			
		}
	
		
		
		
		
	}