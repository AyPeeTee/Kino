import java.util.Scanner;

public class Main {
    static void jeTotoMistoObsazeno(int sedackyIndex, String name, String[] sedacky) {
        if (sedackyIndex > 30) {
            System.out.println("ERROR - Zadali jste prilis velke cislo!");
        }
        else if (sedacky[sedackyIndex - 1] == null) {
            sedacky[sedackyIndex - 1] = name;
            System.out.println("Successfully registered!");
        }
        else {
            System.out.println("Toto misto je obsazeno!");
            System.out.println("Vyberte si jinne misto!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    String[] sedacky = new String[30];

	    while (true) {
            System.out.println("Vsechny sedacky: ");
	        for (int i = 0; i < sedacky.length; i++) {
	            if (i % 6 == 0) {
                    System.out.println();
                }
                System.out.print(i + 1 + ". " + sedacky[i] + " ");
            }

            System.out.println();
            System.out.println();
            System.out.println("Zadej cislo sedacky: ");
            int sedackyIndex = sc.nextInt();
            System.out.println("Zadejte vase jmeno: ");
            String name = sc.next();

            jeTotoMistoObsazeno(sedackyIndex, name, sedacky);
        }
    }
}
