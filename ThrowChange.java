
class ThrowDemoChange {
	static void demoproc() 
	{
		try {
NullPointerException o = new NullPointerException("demo");
			throw new Integer("2");
		} catch(NullPointerException e) {
		System.out.println("Caught inside demoproc.");
		 throw new NullPointerException("New Ref");
		}
	}
	public static void main(String args[]) {
		try{
			demoproc();
		   }catch(NullPointerException e){
			System.out.println(e);	
		   }
	}
}
