import java.util.*;
import java.lang.*;
public class PrimeNumber {
	public static boolean isPrime(int a){
		int flag=0;
		for(int i=2;i<a;i++){
			if(a%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ::>");
		int num;
		num=sc.nextInt();
		//System.out.println("2");
		for(int i=2;i<=num;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

}
