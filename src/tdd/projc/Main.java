package tdd.projc;

import java.util.ArrayList;
import java.util.List;

import tdd.projc.impl.ContainsCall;
import tdd.projc.impl.TimesCall;
import tdd.projc.inface.ICall;
import tdd.projc.unit.Unit;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			List<Unit> list1 = new ArrayList<Unit>();
			list1.add(new Unit(3,"Fizz"));
			list1.add(new Unit(5,"Buzz"));
			list1.add(new Unit(9,"Whizz"));
			List<Unit> list2 = new ArrayList<Unit>();
			list2.add(new Unit(3,"Fizz"));
			ICall call = new ContainsCall(list2.toArray(new Unit[0]));
			call.setNextCall(new TimesCall(list1.toArray(new Unit[0])));
			for(int i = 0;i <= 100;i++){
				System.out.println(call.call(i));
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
