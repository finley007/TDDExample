package tdd.projc.impl;

import tdd.projc.inface.ICall;
import tdd.projc.unit.Unit;

public class ContainsCall extends BaseCall implements ICall {

	public ContainsCall(Unit[] standard){
		this.standard = standard;
	}
	
	@Override
	public String call(int number) {
		// TODO Auto-generated method stub
		String result = "";
		if(standard != null && standard.length > 0){
			for(int i = 0;i < standard.length;i++){
				if(String.valueOf(number).indexOf(String.valueOf(standard[i].getNumber())) >= 0)
					result += standard[i].getName();
			}
		}
		if("".equals(result)){
			if(nextCall != null)
				return nextCall.call(number);
			else
				result = number + "";
		}
		return result;
	}

}
