package String;

public class StringClass {
public static void main(String[] args) {
	String s="Hello I M Learning String Class";
	String s1="";
	int postion=0;
	int end=0;
	while(s.indexOf("",postion)>0) {
		end=s.indexOf("",postion);
		s1=s.substring(postion,end);
		
		
		postion=end+1;
	}
}
}
