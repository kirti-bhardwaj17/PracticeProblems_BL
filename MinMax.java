import java.util.*;
class MinMax{
	public static void main(String args[]){
		System.out.println("Enter five 3 digit values");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
		 arr[i]= sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<5;i++){
			if(arr[i]<min) min=arr[i];
			if(arr[i]>max) max=arr[i];
}
		System.out.println("Minimum value "+min);
		
                 System.out.println("Maximum value "+max);
}
}

