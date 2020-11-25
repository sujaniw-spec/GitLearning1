package practise;

public class PyramidNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1
		2 3
		4 5 6
		7 8 9 10*/
		int k=1;
		for (int i=1; i<5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println();
		}

		
		/*1 
		1 2
		1 2 3
		1 2 3 4*/
for (int i=1; i<5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
				System.out.print(" ");
				//k++;
			}
			System.out.println();
		}
	

int m=3;
for (int i=1; i<5; i++) {
	
	for(int j=1; j<=i; j++) {
		
		//System.out.print(m);
		System.out.print(m+" ");
		System.out.print(" ");
		m+=3;
		//k++;
	}
	System.out.println();
}


	}
	
	/*3
	6 9
	12 15 18*/
	
	
	
	

}
