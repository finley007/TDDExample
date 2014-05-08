package tdd.projc.impl;

import tdd.projc.inface.ICall;
import tdd.projc.unit.Unit;

public abstract class BaseCall implements ICall {
	
	protected ICall nextCall;
	
	protected Unit[] standard;

	@Override
	public abstract String call(int number);

	@Override
	public void setNextCall(ICall call) {
		// TODO Auto-generated method stub
		this.nextCall = call;
	}

}
