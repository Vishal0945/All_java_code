package practices;


	
	public class NumberToWordExample1   
	{  
	//user-defined static method that converts a number into words  
	static void numberToWords(char num[])  
	{  
	//determines the number of digits in the given number  
	int len = num.length;  
	//checks the given number has number or not  
	if (len == 0)   
	{  
	//if the given number is empty prints the following statement     
	System.out.println("The string is empty.");  
	return;  
	}  

	if (len > 4)   
	{  
   
	System.out.println("\n The given number has more than 4 digits.");  
	return;  
	}  
 
	String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
   
	String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  

 
	String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
 
	String[] poweroftens = new String[] {"Hundred", "Thousand"};  
	
	System.out.print(String.valueOf(num) + ": ");  

	if (len == 1)   
	{  
	 
	System.out.println(onedigit[num[0]-'0']);  
	return;  
	}  
	int x = 0;  
  
	while (x < num.length)   
	{  

	if (len >= 3)   
	{  
	if (num[x] - '0' != 0)   
	{  
	System.out.print(onedigit[num[x] - '0'] + " ");  

	System.out.print(poweroftens[len - 3]+ " ");  
	}  
 
	--len;  
	}  
 
	else   
	{  
   
	if (num[x] - '0' == 1)   
	{  
	

	int sum = num[x] - '0' + num[x + 1] - '0';  
	System.out.println(twodigits[sum]);  
	return;  
	}  
	
	else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
	{  
    
	System.out.println("Twenty");  
	return;  
	}  
	
	else   
	{  
	int i = (num[x] - '0');  
	if (i > 0)  
	
	System.out.print(multipleoftens[i]+ " ");  
	else  
	 
	System.out.print("");  
	
	++x;  
	
	if (num[x] - '0' != 0)  

	System.out.println(onedigit[num[x] - '0']);  
	}  
	}  
  
	++x;  
	}  
	}  

	public static void main(String args[])  
	{  
	
	numberToWords("1111".toCharArray());  
	numberToWords("673".toCharArray());  

 
	numberToWords("".toCharArray());  
	}  
	}  


