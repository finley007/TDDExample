package tdd.projc.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tdd.projc.inface.ICall;
import tdd.projc.unit.Unit;


public class TimesCallTest {

	@Test
	public void testCall(){
		try {
			List<Unit> list1 = new ArrayList<Unit>();
			list1.add(new Unit(3,"Fizz"));
			list1.add(new Unit(5,"Buzz"));
			list1.add(new Unit(7,"Whizz"));
			ICall call = new TimesCall(list1.toArray(new Unit[0]));
			System.out.println(call.call(30));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
