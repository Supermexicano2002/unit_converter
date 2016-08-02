package test;


import Mixed_units.Mixed_temperature;

public class Mixed_temperature_test {
	
	public static void main(String[] args){
		Mixed_temperature thing = new Mixed_temperature();
		System.out.println(thing.celsius_to_fahrenheit(50));
		System.out.println(thing.fahrenheit_to_celsius(190));
		System.out.println(thing.fahrenheit_to_kelvin(80));
		System.out.println(thing.kelvin_to_fahrenheit(200));
}
}
