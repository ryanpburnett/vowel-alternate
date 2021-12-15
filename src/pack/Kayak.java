package pack;

import java.util.Arrays;


public class Kayak {
	public Kayak(String[] words) {
		String vowels = "aeiouAEIOU";
		String[] outArr = {"thing1", "thing2", "thing3", "thing4", "thing5"};
		int index = 0;
		for (String word : words) {
			// individual word
			boolean flag = true;
			boolean lastLetterVowel = false;
			boolean currentLetterVowel;
			String[] wordArr = word.split("");
			// individual letter
			for(int i = 0; i < wordArr.length; i++) {
				if(vowels.contains(wordArr[i])) {
					currentLetterVowel = true;
				}else{
					currentLetterVowel = false;
				}
				if(currentLetterVowel != lastLetterVowel || i == 0) {
					lastLetterVowel = currentLetterVowel;
					flag = false;
				}else{
					System.out.println(word + " is not alternating.");
					flag = true;
					outArr[index] = "X";
					index++;
					break;
				}
			}
			// end letter
			if(flag == false) {
				System.out.println(word + " is alternating.");
				outArr[index] = word;
				index++;
			}
		}
		// end word
		System.out.println(Arrays.toString(outArr));
	}
}
