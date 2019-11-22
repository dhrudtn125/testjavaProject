package pr;

public class Minimum {
	public static void main(String[]args) {
		int[] s = {14,50,89,65,15,354,48,315,3};
		int mini;
		
		mini=s[0];
		for(int i=0;i<s.length;i++) {
			if(mini>s[i]);
			mini=s[i];
		}
		System.out.println("minimum ="+ mini);
	}

}
