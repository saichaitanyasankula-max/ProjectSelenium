package tekPyramidPrograms;

public class Momdadmom {

	public static void main(String[] args) {

		String str="mod dad mom";

		String [] sp=str.split(" ");

		String longestpalindrom="";

		for (int i = 0; i < sp.length; i++) {

			String rev="";

			char ch[]=sp[i].toCharArray();

			for(int j=0;j<ch.length;j++)
			{
				rev=ch[j]+rev;

			}

			if(rev.equals(sp[i]))
			{
				if(sp[i].length()>longestpalindrom.length())
				{
					longestpalindrom=sp[i];
				}
			}
		}
		if (!longestpalindrom.equals("")) {
			System.out.println("Longest palindrome is: " + longestpalindrom);
		} else {
			System.out.println("No palindrome found!");
		}
	}
}
