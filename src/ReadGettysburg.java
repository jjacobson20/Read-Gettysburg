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

import javax.swing.plaf.synth.SynthSeparatorUI;

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
		
		int allLengths = 0;
		String longestWord = wordList.get(1);
		//for(String currentWord : wordList)
		for(int c = 0; c < wordList.size(); c++)
		{
			
			String currentWord = wordList.get(c);
			if(currentWord.contains("--"))
			{
				currentWord = currentWord.replace("--", " ");
				String[] separatedWords = currentWord.split(" ");
				System.out.println(separatedWords.length);
				
				// split words connected by double hyphen
				// into an array and replace the old combined
				// word with the split words
				/*
				for(int i = 0; i < separatedWords.length; i++)
				{
					wordList.add(c + i, separatedWords[i]);
				}
				*/
			}
			
			// remove punctuation
			currentWord = currentWord.replace("-", "");
			currentWord = currentWord.replace(",", "");
			currentWord = currentWord.replace(".", "");
			currentWord = currentWord.replace(";", "");
			
			allLengths += currentWord.length();
			if(currentWord.length() > longestWord.length())
			{
				longestWord = currentWord;
			}
		}
		
		float average = (float)allLengths / (float)wordList.size();
		System.out.println("Word count: " + wordList.size());
		System.out.println("Average length: " + average);
		System.out.println("Longest word: " + longestWord);
		
		file.close();
		
	}
}
