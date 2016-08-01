package Metric_units;

import java.math.BigDecimal;

/* This class handles volume conversions in the metric system
 * 
 * 
 * 
 * 
 */

public class Metric_volume {
		// Possible volume units
		private final String[] units = {"kl", "hl", "dal", "l", "dl", "cl", "ml"};
		// Possible values 
		private final double[] x_to_ml = {1000000.0,100000.0,10000.0,1000.0,100.0,10.0,1.0};
		
		// This converts every possible metric volume unit into ml
		public double ml_converter(double number, String unit){

			for (int i = 0; i < units.length; i++){
				if (units[i] == unit){
					double ml = number * x_to_ml[i];

					return ml;
				}
			
				
			}
			return 0.0;
			
		}
		// This converts ml into every possible metric volume unit
		public double ml_to_x(double number, String unit){
			
			for(int i = 0; i < units.length; i++){
				if (units[i] == unit){
					return number / x_to_ml[i];
					
					
				}
				
			}
			return 0.0;		
			
		}
		// This converts an x metric volume unit into another x metric volume unit
		
		/* This method takes a double input, a String input_u (input unit) and a 
		 * String output_u (the unit of the desired output)
		 */
		public String x_to_x(double input, String input_u, String output_u){
			// Converts input into mg
			double ml_result = ml_converter(input, input_u);
			// Convert mg input into desired weight unit
			double x_result = ml_to_x(ml_result, output_u);
			String str_result = String.valueOf(x_result);
			BigDecimal bg_result = new BigDecimal(str_result);
			return bg_result.toPlainString();
			
		
		}
}
