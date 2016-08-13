package Imperial_unit;
/*in this class we put the imperial weight units*/
/* to do:
 * 1- add troy units
 * 
 * */

import java.math.BigDecimal;

public class Imperial_weight{
	private final String[] units = {"gr", "dr", "oz", "lb", "st", "qtr", "cwt", "t"};
	// Possible values 
	private final double[] x_to_lb = {1 / 7000.0,1 / 256.0,1 / 16,1.0,1 / 14.0, 28.0, 112.0, 2240.0};
		
		// This converts every possible metric weigth unit into mg
		public double lb_converter(double number, String unit){

			for (int i = 0; i < units.length; i++){
				if (units[i] == unit){
					double lb = number * x_to_lb[i];
					return lb;
				}
			
				
			}
			return 0.0;
			
		}
		// This converts mg into every possible metric weight unit
		public double lb_to_x(double number, String unit){
			
			for(int i = 0; i < units.length; i++){
				if (units[i] == unit){
					return number / x_to_lb[i];
					
					
				}
				
			}
			return 0.0;		
			
		}
		// This converts an x metric weight unit into another x metric weight unit
		/* This method takes a double input, a 
		 * 
		 * 
		 * 
		 * 
		 */
		public String x_to_x(double input, String input_u, String output_u){
			// Converts input into mg
			double mg_result = lb_converter(input, input_u);
			// Convert mg input into desired weight unit
			double x_result = lb_to_x(mg_result, output_u);
			String str_result = String.valueOf(x_result);
			BigDecimal bg_result = new BigDecimal(str_result);
			return bg_result.toPlainString();
			
		
		}
	
	
	
}

