
public class Functions {

	public static void main(String[] args) {
		int integerArray1[] = new int[10];
		int integerArray2[] = new int[5];
		
		int loop = 0;
		int loop2 = 0;
		integerArray1[0] = 10;
		integerArray1[1] = 9;
		integerArray1[2] = 8;
		integerArray1[3] = 7;
		integerArray1[4] = 6;
		integerArray1[5] = 5;
		integerArray1[6] = 4;
		integerArray1[7] = 3;
		integerArray1[8] = 2;
		integerArray1[9] = 1;
		
		integerArray2[0] = 2;
		integerArray2[1] = 3;
		integerArray2[2] = 4;
		integerArray2[3] = 5;
		integerArray2[4] = 6;
		
		System.out.println("The loop of numbers are: ");
		while(loop < integerArray1.length  ) {
			
			System.out.println("Number "+loop+" is = "+integerArray1[loop]);
			loop ++;
		}
		System.out.println();
		System.out.println("The 2nd loop of numbers are: ");
		while(loop2 < integerArray2.length  ) {
			
			System.out.println("Number "+loop2+" is = "+integerArray2[loop2]);
			loop2 ++;
		}
		
	}

}
