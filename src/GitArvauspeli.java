import java.util.Scanner;

public class GitArvauspeli {

	public static void main(String[] args) {
		// Arvauspeli GitHubiin
		
		Scanner in = new Scanner(System.in);

		String name;
		int laskuri = 0;
		
		System.out.println("Arvaa minun nimeni.");
		do
		{
			laskuri++;
			
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
			System.out.println("Arvaa uudelleen! Jos haluat lopettaa pelin, kirjoita ´stop´");
		} while (!name.equals("Karoliina"));
		
		
		System.out.println("Arvasit " + laskuri + " kertaa.");
		
	}

}
