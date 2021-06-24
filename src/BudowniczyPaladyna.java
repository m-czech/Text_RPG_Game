import java.util.Scanner;

public class BudowniczyPaladyna implements BudowniczyPostaci {
    Postac postac = new Postac();
    Scanner scanner = new Scanner(System.in);

    public void wybierzImie() {
        System.out.println("Wybierz imie dla bohatera: ");
        postac.imie = scanner.nextLine();
    }

    public void wybierzStatystyki() {
        postac.statystyki.punktyZdrowia = 10;
        postac.statystyki.atak = 9;
        postac.statystyki.bialaMagia = 9;
    }

    public void wybierzEkwipunek() {
        postac.ekwipunek.akceptowaneTypyBroni.add(1);
        postac.ekwipunek.akceptowaneTypyBroni.add(4);
        postac.ekwipunek.akceptowaneTypyBroni.add(5);

        Bron miecz = new Miecz();
        postac.ekwipunek.dodajBron(postac, miecz);
    }

    public void wybierzLokacjeStartowa(Lokacja lokacja) {
        postac.lokacja = lokacja;
    }

    public Postac zwrocPostac() {
        return postac;
    }
}
