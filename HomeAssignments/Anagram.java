package week3.day1.HomeAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String inpStr1 = "stops"; 
		String inpStr2 = "potss"; 
		int temp=0;
		if(inpStr1.length() != inpStr2.length())
			System.out.println("False: Length mismatch.The given 2 input strings are not anagrams");
		else
		{
			
			char inpArrStr1[]=inpStr1.toCharArray();
			Arrays.sort(inpArrStr1);
			
			char inpArrStr2[]=inpStr2.toCharArray();
			Arrays.sort(inpArrStr2);
				
			for(int i=0;i<inpArrStr1.length;i++)
			{
				for(int j=0;j<inpArrStr2.length;j++)
				{
					if(inpArrStr1[i]==inpArrStr2[j])
					{
						temp++;
						break;
					}
				}
			}
		if(temp == inpStr1.length())
			System.out.println("True:The given 2 input strings are anagrams");
		else
			System.out.println("False: The given 2 input strings are not anagrams");
		}
	}

}
