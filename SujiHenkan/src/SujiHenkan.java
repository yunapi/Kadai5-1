
import java.util.Scanner;

public class SujiHenkan {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
	}	

	static String translateEng(int n) {
		String str = " ";
		if(n==0) str = "zero";
		else if(n==1) str = "one";
		else if(n==2) str = "two";
		else if(n==3) str = "three";
		else if(n==4) str = "four";
		else if(n==5) str = "five";
		else if(n==6) str = "six";
		else if(n==7) str = "seven";
		else if(n==8) str = "eight";
		else if(n==9) str = "nine";
		else if(n==10) str = "ten";
		else if(n==11) str = "eleven";
		else if(n==12) str = "twelve";
		return str;
	}		
}