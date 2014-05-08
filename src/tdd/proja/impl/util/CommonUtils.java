package tdd.proja.impl.util;

public class CommonUtils {

	public static Double round(Double value){
		Integer temp = Double.valueOf(value * 100).intValue();
		Integer major = temp/10*10;
		Integer remain = temp%10;
		if(remain == 0)
			return value;
		else if(remain >= 1 && remain <= 5)
			return Double.valueOf(major + 5 + "")/100;
		else
			return Double.valueOf(major + 10 + "")/100;
	}
}
