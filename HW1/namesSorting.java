import java.util.*;
public class namesSorting {
 public static void main(String args[])throws Exception{
	 ArrayList <String> al=new ArrayList();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of names in the  List::");
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
		 System.out.println("Enter name"+(i+1));
		 String s=sc.next();
		 al.add(s);
	 }
	 Collections.sort(al);
	 Thread.sleep(1000);
	 Iterator it=al.iterator();
	 System.out.println("The final List is::>");
	 while(it.hasNext()){ // checks if there exist a next element in the list
		System.out.println(it.next()); // if exist then print the next element
		Thread.sleep(50);
	 }
		 
 }
}
