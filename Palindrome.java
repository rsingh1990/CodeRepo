import java.util.Scanner;

public class Palindrome {

	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		String temp = Long.toString(number);
		int[] newArray = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			newArray[i] = temp.charAt(i) - '0';
		}
		System.out.println(palindromeDescendant(newArray,temp,number));
	}
		
		public static boolean palindromeDescendant(int[] newArray,String temp,long number)
		{
		int i = 0;
		int j = temp.length();
		boolean flag = false;
		int count = 0;
		while (i < j) {
			
			    long  reversed = 0;
			    long n = number;
			    if(n>=10)
			    {
		        while(n != 0) {
		            long digit = n % 10;
		            reversed = reversed * 10 + digit;
		            n /= 10;
		        }
			    }
		        if(number == reversed)
		        {
		        	flag = true;
		        	break;
		        }

			if (!flag) {
				int k;
				int m = 0;
				for (k = 0; k < j; k = k + 2) {
					newArray[m] = newArray[k] + newArray[k + 1];
					m++;

					count++;
				}
				
				i = 0;
				j = count-1;
				count = 0;
				StringBuilder strNum = new StringBuilder();

				for (int s=0; s<=j;s++)
				{
				     strNum.append(newArray[s]);
				}
				number = Integer.parseInt(strNum.toString());
				

			}
		}
		int value = newArray[0];
		if (!flag && value>=10) {
			
			int rem = value % 10;
			value = value / 10;
			if (value == rem) {
				flag = true;
			}
		}
	
		return flag;

	}

}
