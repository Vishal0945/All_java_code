package practices;

public class intersection_2D_array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,8};
		int b[]= {4,5,6,7,3};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println(b[j]);
					
				}
				
			}
			
		}
		
			
		
	}

}
