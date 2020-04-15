package tistaAssesment;

/*
 * @Author:: Ajith V Keerikkattil
 */

import static org.junit.Assert.*;
import org.junit.*;

public class sentenceLengthUnitTests {
	
	private static String longestWord;
	private static int longestWordLength;
	private static String shortestWord;
	private static int shortestWordLength;
	
	@BeforeClass
	public static void setUp()
	{
		/*** Assumption: In this case I am assuming that the sentence has one shortest or one longest word. 
		 * Not designed to handle multiple words of the same length for either longest or shortest 
		 * Returns: The last word with the specified length in this case ***/
		sentenceProcessor SentenceProcessor = new sentenceProcessor("The quick brown fox jumped over a lazy dog");
		SentenceProcessor.sentenceSplit();
		SentenceProcessor.findTheLongestWord();
		SentenceProcessor.findTheShortestWord();
	
		longestWord = SentenceProcessor.getLongestWord();
		longestWordLength = SentenceProcessor.getLongestWordLength();
		shortestWord = SentenceProcessor.getShortestWord();
		shortestWordLength = SentenceProcessor.getShortestWordLength();
	}

	@Test
	public void longestWordTest()
	{
		System.out.println("Longest word is: " + longestWord);
		assertEquals("jumped", longestWord);
	}
	
	@Test
	public void longestWordLengthTest()
	{
		System.out.println("Longest word length is: " + longestWordLength);
		assertEquals(6, longestWordLength);
	}
	
	@Test
	public void shortestWordTest()
	{
		System.out.println("Shortest word is: " + shortestWord);
		assertEquals("a", shortestWord);
	}
	
	@Test
	public void shortestWordLengthTest()
	{
		System.out.println("Shortest word length is: " + shortestWordLength);
		assertEquals(1, shortestWordLength);
	}
}
