package JavaImportantPrograms;

public class findDuplicateCharacter1{

	public static void main(String[] args) {
		String a="jaavvva";
		char abc[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(abc[i]==abc[j])
				{
					System.out.print(abc[j]);
				}
			}

			
		}
	}
}
