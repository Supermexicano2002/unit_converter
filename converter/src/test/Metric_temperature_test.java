package test;

import Metric_units.Metric_temperature;

public class Metric_temperature_test {
	public static void main(String[] args){
		Metric_temperature thing = new Metric_temperature();
		System.out.println(thing.celsius_to_kelvin(50));
		System.out.println(thing.kelvin_to_celsius(123123));
		System.out.println(thing.celsius_to_kelvin(12));
		System.out.println(thing.kelvin_to_celsius(3231));
}
}
