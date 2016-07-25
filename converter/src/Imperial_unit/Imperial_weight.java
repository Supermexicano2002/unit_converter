package Imperial_unit;
/*in this class we put the */
/* to do:
 * 1- add troy units
 * 
 * */
class Imperial_weight 
{							
	public double kg_to_lb(double kg){
		double lb=0;
		lb=kg*2.20462262185;
		return lb;
	}
	public double pound_converter(int number_the_unit, double imperialvalue)
		{
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
	
	
	public double imperial_converter(int number_the_unit, double pound)
	{
	double giresult=0;	
	boolean invalid= false;
	switch(number_the_unit){
	case 1:/*grain (gr)*/
	giresult = pound*7000;
	break;
	case 2:/*drachm (dr)*/
	giresult = pound*256;
	break;
	case 3:/*ounce (oz)*/
	giresult = pound*16;
	break;
	case 4:/*pound (lb)*/
	giresult = pound;
	break;
	case 5:/*stone (st)*/
	giresult = pound/14;
	break;
	case 6:/*quarter (qr or qtr)*/
	giresult = pound/28;
	break;
	case 7:/*houndredweight (cwt)*/
	giresult = pound/112;
	break;
	case 8:/*ton (t)*/
	giresult = pound/2240;
	break;
	default: invalid = true;
	break;
	}
	if(invalid==true){
		System.out.println("ERROR: GuiTest/src/imperial_unit/Imperial_weight.java/imperial_converter: invalid number_the_unit");
		System.exit(0);}
	
	return giresult;
	}
} 
