package tdd.projc.inface;


public interface ICall {
	
	public String call(int number);
	public void setNextCall(ICall call);

}
