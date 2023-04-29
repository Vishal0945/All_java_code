package practices;

 class Ovr {
		public void sums( ) {
			System.out.println("Hello");
		}
		
//		

}
class Overridingz  extends Ovr{
	
	public int sums(int a) {
		
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		Overridingz o = new Overridingz();
		o.sums(23);
		
	}
}
