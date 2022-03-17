package program;
import java.util.*;
public class Stud {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char gender=sc.next().charAt(0);
		int age=sc.nextInt();
		long mobilno=sc.nextLong();
		double cpga=sc.nextDouble();
		System.out.println("Name"+name);
		System.out.println("Gender"+gender);
		System.out.println("Age"+age);
		System.out.println("Mobilno"+mobilno);
		System.out.println("CPGA"+cpga);
sc.close();
}
	

}
