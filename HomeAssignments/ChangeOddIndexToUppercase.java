package week3.day1.HomeAssignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String inpStr = "changeme";
		String outputStr="";
		
		for(int i=0;i<inpStr.length();i++)
		{
			if(i%2==0)
				outputStr = outputStr+inpStr.charAt(i);
			else
			
				outputStr = outputStr+Character.toUpperCase(inpStr.charAt(i));
			
				
		}
		System.out.println("Output String:"+outputStr);
		

	}

}
