
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
		else if(n>120 && n<1000)
			str=translateEng1(n);
		
			
			return str;
	}
	
	
	static String translateEng1(int n) {

		String str2="";
		
		if(n>120 && n<200)
	    str2="one hundred-"+translateEng(n-100);
	    else if(n==200)
	    str2="two hundred";
	    else if(n>200 && n<300)
	    	str2="two hundred-"+translateEng(n-200);
	    else if(n==300)
	    	str2="three hundred";
	    else if(n>300 && n<400)
	    	str2="three hundred-"+translateEng(n-300);
	    else if(n==400)
	    	str2="four hundred";
	    else if(n>400 && n<500)
	    	str2="four hundred-"+translateEng(n-400);
	    else if(n==500)
	    	str2="five hundred";
	    else if(n>500 && n<600)
	    	str2="five hundred-"+translateEng(n-500);
	    else if(n==600)
	    	str2="six hundred";
	    else if(n>600 && n<700)
	    	str2="six hundred-"+translateEng(n-600);
	    else if(n==700)
	    	str2 = "seven hundred";
	    else if(n>700 && n<800)
	    	str2="seven hundred-"+translateEng(n-700);
	    else if(n==800)
	    	str2="eight hundred";
	    else if(n>800 && n<900)
	    	str2="eight hundred-"+translateEng(n-800);
	    else if(n==900)
	    	str2="nine hundred";
	    else if(n>900 && n<1000)
	    	str2="ninehundred-"+translateEng(n-900);
	    
	    	
	    return str2;
	
	}
	
	
}