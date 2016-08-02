package Metric_units;

import java.math.BigDecimal;

public class Metric_length {
		// Possible length units
			private final String[] units = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
			// Possible values 
			private final double[] x_to_ml = {1000000.0,100000.0,10000.0,1000.0,100.0,10.0,1.0};
			
			// This converts every possible metric volume unit into ml
			public double mm_converter(double number, String unit){

				for (int i = 0; i < units.length; i++){
					if (units[i] == unit){
						double mm = number * x_to_ml[i];

						return mm;
					}
				
					
				}
				return 0.0;
				
			}
			// This converts mm into every possible metric length unit
			public double mm_to_x(double number, String unit){
				
				for(int i = 0; i < units.length; i++){
					if (units[i] == unit){
						return number / x_to_ml[i];
						
						
					}
					
				}
				return 0.0;		
				
			}
			// This converts an x metric length unit into another x metric length unit
			
			/* This method takes a double input, a String input_u (input unit) and a 
			 * String output_u (the unit of the desired output)
			 */
			public String x_to_x(double input, String input_u, String output_u){
				// Converts input into mg
				double mm_result = mm_converter(input, input_u);
				// Convert mg input into desired weight unit
				double x_result = mm_to_x(mm_result, output_u);
				String str_result = String.valueOf(x_result);
				BigDecimal bg_result = new BigDecimal(str_result);
				return bg_result.toPlainString();
				
			
			}
}
