
import java.util.Scanner;

public class SujiHenkan {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
 
        System.out.println(translateEng(input));
        
	}	

	static String translateEng(int n) {
		
		String i[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen","twelve"};
		
		
		String str =" ";
		
		if(n<20) str = i[n];
		else if(n>20 && n<30) str="twenty-"+i[n-20];
		else if(n==30) str="thirty";
		else if(n>30 && n<40) str="thirty-" +i[n-30];
		else if(n==40)str="forty";
		else if(n>=40 && n<50) str="forty-" +i[n-40];
		else if(n==50) str="fifty";
		else if(n>50 && n<60) str="fifty-" +i[n-50];
		else if(n==60)str="sixty";
		else if(n>60 && n<70) str="sixty-" +i[n-60];
		else if(n==70) str="seventy";
		else if(n>70 && n<80) str="seventy-" +i[n-70];
		else if(n==80) str="eighty";
		else if(n>80 && n<90) str="eighty-" +i[n-80];
		else if(n==90) str="ninety";
		else if(n>90 && n<100) str="ninety-" +i[n-90];
		else if(n==100) str="one hundred";
		else if(n>100 && n<=120) str="one hundred-"+i[n-100];
		else if(n>120 && n<200)
			str=translateEng1(n);
		
			
			return str;
	}
	
	
	static String translateEng1(int n) {

		String str1=translateEng(n-100);
		String str2="";
	    if(n>120 && n<200);
	    str2="one hundred-"+str1;
	    return str2;
	
	}
	
	
}