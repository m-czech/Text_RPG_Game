import java.util.Scanner;

public class BudowniczyWojownika implements BudowniczyPostaci {
    Postac postac = new Postac();
    Scanner scanner = new Scanner(System.in);

    public void wybierzImie() {
        System.out.println("Wybierz imie dla bohatera: ");
        postac.imie = scanner.nextLine();
    }

    public void wybierzStatystyki() {
        postac.statystyki.atak = 7;
        postac.statystyki.obrona = 7;
        postac.statystyki.perswazja = 4;
    }

    public void wybierzEkwipunek() {
        postac.ekwipunek.akceptowaneTypyBroni.add(1);
        postac.ekwipunek.akceptowaneTypyBroni.add(3);

        Bron topor = new Miecz();
        postac.ekwipunek.dodajBron(postac, topor);
    }

    public void wybierzLokacjeStartowa(Lokacja lokacja) {
        postac.lokacja = lokacja;
    }

    public Postac zwrocPostac() {
        return postac;
    }
}
