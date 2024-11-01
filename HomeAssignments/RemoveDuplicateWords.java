package week3.day1.HomeAssignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String inpStr = "We learn Java basics as part of java sessions in java week1 basics";
		
		String tempStr ="";
		
		String[] wordsArr = inpStr.split(" ");
		//wordsArr = {We,learn,Java,basics,as,part,of,java,sessions,in,java,week1,basics}
				
		System.out.println("Input String:"+inpStr);
		
		for(int i=0;i<wordsArr.length;i++)
		{
			
			for(int j=i+1;j<wordsArr.length;j++)
			{
							
				if(wordsArr[i].equals(wordsArr[j]))
				{
					tempStr = wordsArr[i];
					System.out.println("Duplicate word:"+wordsArr[i]);
					inpStr = inpStr.replaceAll(tempStr, " ");
					
				}
						
			}
								       
		}
		
		System.out.println("Output String:"+inpStr);
		
		
	}

}
