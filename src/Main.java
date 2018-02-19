 
//123333
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Input :");
		
		
		//read  circle node=========================================
		//1 and 0 means  balck and white node
		Scanner  in = new Scanner(System.in); 
		
		String tmp = in.nextLine();
		String tmp2 = in.nextLine();
		String[] s=tmp.split("");
		int[] v=new int[s.length];
		for (int i=0;i<s.length;i++) {
			v[i]=Integer.parseInt(s[i]);
		}
	//	System.out.println();
		int[] input = v;

		//read change modle===========================================
		//1 =>  change  color  and 0 => not change 
		
		String[] s2=tmp2.split("");
		int[] v2=new int[s2.length];
		for (int i=0;i<s2.length;i++) {
			v2[i]=Integer.parseInt(s2[i]);
		}
	//	System.out.println();
		int[] rule= v2;
			
		//do 
		Taiji T1= new Taiji(input ,rule);
		T1.run();	
		//System.out.println("No result!");
	}

}
