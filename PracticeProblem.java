import java.util.*;
class Hello{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		if(i%2==0){
		System.out.println(i);
		}
		}
}
}
