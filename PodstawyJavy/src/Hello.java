public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");
        // Zad.1 Wypisz swoje imię i klasę
        System.out.println("Alicja 5cI");
        // Komentowanie wielu linijek - ctrl + /
        /*
        To jest komentarz wieloliniowy.
        Mogę pisać po enterze i dalej jestem
        w komentarzu.
         */

        int a = 5, b = 2;
        System.out.println("Wynik dodawania: " + (a+b));
        float wynik = 0;
        wynik = (float)a/b;
        System.out.println(wynik);
        /*
        \t - tab
        \n - nowa linia
        \r - powrót karetki
        \" - cudzysłów
        \' - apostrof
        \\ - backslash
         */
        System.out.println("Tu jest coś\t\t\t\t\t A tu co innego");
        System.out.println("Zdanie\n");
        //System.out.println();
        System.out.println("Drugie zdanie");
        System.out.println("Do robienia znaków specjalnych używamy znaku \\");
        System.out.println("Do wpisywania Stringów używamu znaku \"");
    }
}
