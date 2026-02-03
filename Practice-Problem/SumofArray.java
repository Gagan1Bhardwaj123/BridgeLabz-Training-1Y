import java.util.Scanner;

class SumofArray{

Scanner sc=new Scanner(System.in);

	int arr[]=new int[5];
	int sum=0;
	
			//---for loop
			System.out.println("Array inputs are ");
			for (int i=0; i<arr.length; i++) {
			
				arr[i]=sc.nextInt();
				}
				for (int i=0; i < arr.length; i++) {
					sum+=arr[i];
					
					}
					System.outprintln("Sum of Array : "+sum);
					sc.close();
					}
					}

