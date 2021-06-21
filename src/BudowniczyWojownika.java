import java.util.Scanner;

public class BudowniczyWojownika implements BudowniczyPostaci {
    Postac postac = new Postac(Plansza.start);
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
        Bron topor = new Miecz();
        postac.ekwipunek.dodajBron(postac, topor);
    }

    public Postac zwrocPostac() {
        return postac;
    }
}
