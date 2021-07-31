package eg3;
import java.util.Scanner;

public class StringEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			int m =arr[i].length();
			if(m%2==0) 
			{
				sb.append(Character.toUpperCase(arr[i].charAt(0)));
			sb.append(arr[i].substring(1)).append("");
			}
			else 
			{
				int d =(m/2);
			sb.append(arr[i].substring(0,d));
			sb.append(Character.toUpperCase((arr[i]).charAt(d)));
			sb.append(arr[i].substring(d+1)).append(" ");
			}	
			
		}
	System.out.println(sb.toString());
	}

}
