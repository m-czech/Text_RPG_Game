import java.util.Scanner;

public class BudowniczyCzarnoksieznika implements BudowniczyPostaci {
    Postac postac = new Postac();
    Scanner scanner = new Scanner(System.in);

    public void wybierzImie() {
        System.out.println("Wybierz imie dla bohatera: ");
        postac.imie = scanner.nextLine();
    }

    public void wybierzStatystyki() {
        postac.statystyki.punktyZdrowia = 10;
        postac.statystyki.czarnaMagia = 10;
        postac.statystyki.zasieg = 9;
    }

    public void wybierzEkwipunek() {
        postac.ekwipunek.akceptowaneTypyBroni.add(2);
        postac.ekwipunek.akceptowaneTypyBroni.add(5);

        Bron rozdzka = new Rozdzka();
        postac.ekwipunek.dodajBron(postac, rozdzka);
    }

    public void wybierzLokacjeStartowa(Lokacja lokacja) {
        postac.lokacja = lokacja;
    }

    public Postac zwrocPostac() {
        return postac;
    }
}
