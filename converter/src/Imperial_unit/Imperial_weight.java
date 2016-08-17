package Imperial_unit;


import java.math.BigDecimal;

public class Imperial_weight{
	/*possible units (name/abreviation)*/
	private final String[] units = {"gr", "dr", "oz", "lb", "st", "qtr", "cwt", "it", "ut"};
	/*values for the convertions*/
	private final double[] x_to_lb = {1 / 7000.0,  1 / 256.0,  1 / 16.0,   1.0 ,  14.0,    28.0,    112.0,    2240.0, 2000.0};
		
	 /*inputs: a value to convert (double), and the unit (string)
	 * outputs: the converted value in pounds
	 * */	
		public double lb_converter(double number, String unit)
		{
			double value = 0.0;
			for (int i = 0; i < units.length; i++)/* go trough all the Im. units*/
			{ 
				if (units[i] == unit)/*finds the matching unit */
				{ 
					double lb = number * x_to_lb[i]; /*converts the value accordingly*/
					value = lb; /*outputs the converted value in pounds*/
				}
			
				
			}
			
			return value;
			
		 }
		/*inputs: a value in pounds to convert (double) to a selected unit (string)
		 * outputs: the converted value of the selected Imperial value
		 * */	
		public double lb_to_x(double number, String unit)
		{			
			for(int i = 0; i < units.length; i++)
			{
				if (units[i] == unit)
				{
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

