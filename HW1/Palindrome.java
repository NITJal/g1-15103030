import java.util.*;
public class Palindrome {
 
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String::>");
		String s=sc.next();
		int n=s.length();
		int i=0;int j=n-1;
		int flag=0;
		while(i<=j){
			if(s.charAt(i)==s.charAt(j)){
				i++;
				j--;
			}
			else{
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Not a Palindrome");
		}
		else{
			System.out.println("Palindrome!!");
		}
	}
}
