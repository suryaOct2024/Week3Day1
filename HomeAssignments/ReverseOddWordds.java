package week3.day1.HomeAssignments;

public class ReverseOddWordds {

	public static void main(String[] args) {
		
		String text = "I am a software tester"; 
		String[] wordsArr = text.split(" ");
		char ch;
		String tempStr="";
		
		System.out.println("Input String:"+text);
		
		for(int i=0;i<wordsArr.length;i++)
		{
			tempStr="";
			ch=0;
			
			if(i%2==1)
			{
				char[] tempArr = wordsArr[i].toCharArray();
				
				for(int j=0;j<tempArr.length;j++)
				{
					
					ch=wordsArr[i].charAt(j);
					tempStr = ch+tempStr;
					
				}
				
				text = text.replaceFirst(wordsArr[i], tempStr);
			}
		
		}
		
		System.out.println("Reversed text:"+text);

	}

}
