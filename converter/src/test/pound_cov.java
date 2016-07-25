package test;
import java.util.*;
class pound_cov {
	public static double pound_converter(int number_the_unit, double imperialvalue){
		double iresult=0;
		boolean invalid= false;
		
		switch(number_the_unit){
		case 1:/*grain (gr)*/
		iresult = imperialvalue/7000;
		break;
		case 2:/*drachm (dr)*/
		iresult = imperialvalue/256;
		break;
		case 3:/*ounce (oz)*/
		iresult = imperialvalue/16;
		break;
		case 4:/*pound (lb)*/
		iresult = imperialvalue;
		break;
		case 5:/*stone (st)*/
		iresult = imperialvalue*14;
		break;
		case 6:/*quarter (qr or qtr)*/
		iresult = imperialvalue*28;
		break;
		case 7:/*houndredweight (cwt)*/
		iresult = imperialvalue*112;
		break;
		case 8:/*ton (t)*/
		iresult = imperialvalue*2240;
		break;
		default: invalid = true;
		break;
		}
		if(invalid==true){
			System.out.println("ERROR: GuiTest/src/imperial_unit/Imperial_weight.java/pound_converter: invalid number_the_unit");
			System.exit(0);}
		return iresult;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter 1 to 8");
		int v1 = read.nextInt();
		System.out.println("enter a value");
		double v2= read.nextDouble();
		double v3 = pound_converter(v1,v2);
		System.out.println(v3);
		System.out.println("if succesful you should see this");
		read.close();
	}

}
