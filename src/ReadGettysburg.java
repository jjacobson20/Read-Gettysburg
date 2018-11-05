/**
 * 
 * Read Gettysburg
 * @author jeremy
 * Period 6
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadGettysburg
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("C:\\Users\\jjacobson20\\Downloads\\GettysburgAddress.txt"));
		ArrayList<String> wordList = new ArrayList<String>();
		
		while(file.hasNext())
		{
			String word = file.next();
			wordList.add(word);
		}
		
		String longestWord = wordList.get(1);
		for(String currentWord : wordList)
		{
			if(currentWord.length() > longestWord.length())
			{
				longestWord = currentWord;
			}
		}
		
		int allLengths = 0;
		for(String currentWord : wordList)
		{
			allLengths += currentWord.length();
		}
		float average = allLengths / wordList.size();
		
		System.out.println("Average length: " + average);
		System.out.println("Longest word: " + longestWord);
		
		file.close();
		
	}
	
	public String parseWord(String word)
	{
		if(word.contains("-"))
		{
			
		}
		return "y";
	}
}
