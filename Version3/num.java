public class num implements Comparable<num>{
	private int value;

	public void setvalue(int value){
		this.value=value;
	}
	public int getvalue(){
		return value;
	}
	@Override
	public int compareTo(num n){
		if(value - n.getvalue()>0)
			return 1;
		if(value - n.getvalue()<0)
			return -1;
		return 0;
	}
	@Override
	public String toString(){
		return "Value num: "+getvalue();
	}

}