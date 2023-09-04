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
			System.out.println("Arvaa minun nimeni. Jos haluat lopettaa pelin, kirjoita ´stop´");
			name=in.nextLine();
			if (name.equals("Karoliina"))
			{
				System.out.println("Onnittelut, arvasit oikein! Peli päättyy.");
				break;
			}
			if (name.equals("stop"))
			{
				System.out.println("Peli päättyy.");
				laskuri--;
				break;
			}
		} while (!name.equals("Karoliina"));
		
		
		System.out.println("Arvasit " + laskuri + " kertaa.");
		
	}

}
