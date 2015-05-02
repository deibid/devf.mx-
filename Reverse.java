
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		invertLetters("El DevF Rockea");
		

	}

	
	public static String invertLetters(String s){
				
		int count = 0;
		char [] reverseArray = new char[s.length()];
		char [] letterArray = s.toCharArray();
	
		
		for(int i = 0; i<s.length();i++){			
			reverseArray[i] = letterArray[(s.length()-1)-i];
			if (reverseArray[i] == 'E' || reverseArray[i] == 'e') count ++;
		}
		String reverseString = new String(reverseArray);
		System.out.println("La letra e aparece: "+count+" veces");
		System.out.println(s + " -> " + reverseString);
		return reverseString;
	}
	
	
}
