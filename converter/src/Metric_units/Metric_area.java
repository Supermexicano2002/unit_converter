package Metric_units;

import java.math.BigDecimal;

public class Metric_area {
	// Possible area units
		private final String[] units = {"km2", "hm2", "dam2", "m2", "dm2", "cm2", "mm2"};
		// Possible values 
		private final double[] x_to_mm2 = {1000000000000.0,10000000000.0,100000000.0,1000000.0,10000.0,100.0,1.0};
		
		// This converts every possible metric area unit into mm2
		public double mm2_converter(double number, String unit){

			for (int i = 0; i < units.length; i++){
				if (units[i] == unit){
					double mm2 = number * x_to_mm2[i];
					return mm2;
				}
			
				
			}
			return 0.0;
			
		}
		// This converts mm2 into every possible metric area unit
		public double mm2_to_x(double number, String unit){
			
			for(int i = 0; i < units.length; i++){
				if (units[i] == unit){
					return number / x_to_mm2[i];
					
					
				}
				
			}
			return 0.0;		
			
		}
		// This converts an x metric area unit into another x metric area unit
		/* This method takes a double input, a String input_u (input unit) and a String
		 * output_u (The unit of the desired output)
		 * 
		 */
		
		public String x_to_x(double input, String input_u, String output_u){
			// Converts input into mg
			double mm2_result = mm2_converter(input, input_u);
			// Convert mg input into desired weight unit
			double x_result = mm2_to_x(mm2_result, output_u);
			String str_result = String.valueOf(x_result);
			BigDecimal bg_result = new BigDecimal(str_result);
			return bg_result.toPlainString();
			
		
		}
}
