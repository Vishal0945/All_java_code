package practices;

 class fac {
	void abc(int q) {
		System.out.println("abc from A");
	}
}

class b extends fac {
	 void abc(double p) {
		System.out.println("abc from B");

	}

	public static void main(String[] args) {
		
	
		int i=5;
		fac b=new fac();
		b.abc(i);
		System.out.println();
}
}