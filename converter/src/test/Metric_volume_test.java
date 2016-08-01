package test;

import Metric_units.Metric_volume;

public class Metric_volume_test {
	
	public static void main(String[] args){
		Metric_volume thing = new Metric_volume();
		System.out.println(thing.x_to_x(50, "ml", "cl"));
		System.out.println(thing.x_to_x(500000, "kl", "l"));
}
}
