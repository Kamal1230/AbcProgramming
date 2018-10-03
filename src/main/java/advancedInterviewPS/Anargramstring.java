package advancedInterviewPS;

public class Anargramstring {

	public static void main(String[] args) {
		System.out.println(isAnagram("Test", "Tste"));

	}

	public static boolean isAnagram(String word, String anagram){
		if(word.length() != anagram.length()){
			return false; 
		}
		//if(word.toLowerCase().equals(anagram.toLowerCase()) == false){ return false;	}
		
		char[] chars = word.toCharArray(); 

		for(char c : chars){
			int i = anagram.indexOf(c); 
			if(i != -1){
				anagram = anagram.substring(0,i) + anagram.substring(i +1, anagram.length()); 
			}

			else{
				return false; 
			} 

		}
		return anagram.isEmpty();
				
	}
	
}
	

