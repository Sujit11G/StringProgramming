package String;

public class Count_Vowels {

	public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU"; // List of vowels in both lowercase and uppercase

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
	
	public static void main(String[] args) {
		
		String s="I Love You";
		System.out.println(s.indexOf("Y"));
		
//		int count=countVowels(s);
		//System.out.println(count);
	}
}








