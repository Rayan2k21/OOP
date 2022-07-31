
class ThrowDemo {
	static void demoproc() 
	{
		try {
NullPointerException o = new NullPointerException("demo");
			throw o;
		} catch(NullPointerException e) {
		System.out.println("Caught inside demoproc.");
		throw e; // rethrow the exception
		}
	}//end of domoproc
	public static void main(String args[]) {
		try {
			demoproc();
		    } catch(NullPointerException e) {
			System.out.println("Recaught: " + e);
		    }//catch end
	}//End of main
}// end of class
