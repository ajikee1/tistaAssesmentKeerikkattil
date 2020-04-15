package tistaAssesment;

/*
 * @Author:: Ajith V Keerikkattil
 */

public class sentenceProcessor {

	private String sentence;
	private String[] words;
	private String longestWord;
	private int longestWordLength;
	private String shortestWord;
	private int shortestWordLength;
	
	public sentenceProcessor(String sentence) {
		this.sentence = sentence;
	}

	public void sentenceSplit() {
		words = sentence.split("\\s+");
	}

	public void findTheLongestWord() {
		int lengthOflongest = words[0].length();

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() >= lengthOflongest) {
				lengthOflongest = words[i].length();
				longestWord = words[i];
				longestWordLength = longestWord.length();
			}
		}

	}
	
	public void findTheShortestWord() {
		int lengthOfShortest = words[0].length();

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() <= lengthOfShortest) {
				lengthOfShortest = words[i].length();
				shortestWord = words[i];
				shortestWordLength = shortestWord.length();
			}
		}

	}

	public String getLongestWord() {
		return this.longestWord;
	}

	public int getLongestWordLength() {
		return this.longestWordLength;
	}
	
	public String getShortestWord() {
		return this.shortestWord;
	}

	public int getShortestWordLength() {
		return this.shortestWordLength;
	}
}
