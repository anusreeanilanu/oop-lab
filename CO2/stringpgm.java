package program;
import java.util.*;
public class stringpgm {
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		String str;
		char temp=0;
		int j=0,i;
		System.out.println("Enter the string:");
		str=sc.nextLine();
		char[] chars=str.toCharArray();
		for(i=0;i<chars.length;i++){
			for(j=0;j<chars.length;j++)
			{
				if(chars[j]>chars[i])
				{
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
					
				}
				
			}
		}
		System.out.println("The sorted string is :");
		for(i=0;i<chars.length;i++)
		{
			System.out.print(chars[i]);
		}
}
}
