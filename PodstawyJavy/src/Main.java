//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean zm = true;
        if (!zm) {
            System.out.println("Zmienna to prawda");
        } else {
            System.out.println("Zmienna to fałsz");
        }
        String napis = "Napis to jest.";
        napis = napis + " A to jest kolejny napis";
        System.out.println(napis);
        System.out.println('a' + 0);

        // Zad.2 Stwórz program, który będzie obliczał pole koła o r = 4
        System.out.println("Pole koła to: " + (4*4*3.14));
        System.out.println("Pole koła to: " + (4*4*Math.PI));
    }
}