package Mixed_units;
import Metric_units.Metric_temperature;
public class Mixed_temperature {
	public double celsius_to_fahrenheit(double celsius){
		// T(f) = T(c) * 1.8 + 32 
		return celsius * 1.8 + 32;
		
	}
	public double fahrenheit_to_celsius (double fahrenheit){
		// T(c) = (T(f) - 32) / 1.8
		return (fahrenheit - 32) / 1.8;
	}
	
	public double fahrenheit_to_kelvin(double fahrenheit){
		double celsius = fahrenheit_to_celsius(fahrenheit);
		return celsius + 273.15;
		
	}
	
	public double kelvin_to_fahrenheit(double kelvin){
		Metric_temperature temp_converter = new Metric_temperature();
		double celsius = temp_converter.kelvin_to_celsius(kelvin);
		return celsius_to_fahrenheit(celsius);
		
		
	}
}
