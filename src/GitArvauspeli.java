import java.util.Scanner;

public class GitArvauspeli {

	public static void main(String[] args) {
		// Arvauspeli GitHubiin
		
		Scanner in = new Scanner(System.in);

		String name;
		int laskuri = 0;
		
		do
		{
			laskuri++;
			System.out.println("Arvaa minun nimeni.");
			name=in.nextLine();
			if (name.equals("Karoliina"))
			{
				break;
			}
		} while (!name.equals("Karoliina"));
		
		System.out.println("Onnittelut, arvasit oikein! Peli päättyy.");
		System.out.println("Arvasit " + laskuri + " kertaa.");
		
	}

}
