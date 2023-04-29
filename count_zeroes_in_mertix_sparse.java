package collection;

public class count_zeroes_in_mertix_sparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{ 1, 0, 0 },{ 6, 0, 1 },{ 0, 0, 3 }};

		int sum=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j]==0 ) {
					sum++;
					
				}
				
			}
			
		}
		System.out.println("In this matrix there are :"+sum+" zero");

	}

}
