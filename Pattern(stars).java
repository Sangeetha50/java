public class pattern {
	public static void main(String args[]) {
	//left triangle
	System.out.println("left triangle");
		for(int i=1;i<=5;i++) {
		
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");


			}
			
				System.out.println();
		}
	//reverse left triangle
	System.out.println(" reverse left triangle");
		for(int i=5;i>=1;i--) {

			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
		
			}
			System.out.println();
		}
	//right triangle
	System.out.println("Right triangle");
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");	
		}
		for(int k=i;k<=2*i-1;k++) {
			System.out.print("*");			
		}
	System.out.println();	
	}
	//reverse right triangle
	System.out.println("Reverse Right triangle");
	for(int i=5;i>=1;i--) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");	
		}
		for(int k=i;k<=2*i-1;k++) {
			System.out.print("*");			
		}
	System.out.println();	
	}
	//Pyramid
	System.out.println("Pyramid");
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");	
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");			
		}
	System.out.println();	
	}
	//Reverse Pyramid
	System.out.println("Reverse Pyramid");
	for(int i=5;i>=1;i--) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");	
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");			
		}
	System.out.println();	
	}

//Diamond shape
	System.out.println("Diamond shape");
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");	
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");			
		}
	System.out.println();	
	}
	for(int i=5+1;i>=1;i--) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");	
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");			
		}
	System.out.println();	
	}

}

}
