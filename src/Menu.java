import java.util.Scanner;

public class Menu {
    Menu() { }

    public static void main(String[] args) {
        System.out.println("Witaj w grze tekstowej ŚREDNIOWIECZE");
        System.out.println("Wybierz pozycje z menu: ");
        System.out.println("1. Stwórz postać");
        System.out.println("2. Wyjdź \n");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();

        while (wybor != 1 && wybor != 2) {
            wybor = scanner.nextInt();
            System.out.println("Zla opcja! Sproboj ponownie.");
        }

        if (wybor == 2) {
            System.exit(0);
        }

        Plansza plansza = new Plansza();

        System.out.println("Wybierz klase: ");
        System.out.println("1. Wojownik");
        System.out.println("2. Paladyn");
        System.out.println("3. Czarnoksieznik \n");

        BudowniczyPostaci budowniczyPostaci;
        int wybranaKlasa = scanner.nextInt();
        switch (wybranaKlasa) {
            case 1:
                budowniczyPostaci = new BudowniczyWojownika();
                break;
            case 2:
                budowniczyPostaci = new BudowniczyPaladyna();
                break;
            case 3:
                budowniczyPostaci = new BudowniczyCzarnoksieznika();
                break;
            default:
                budowniczyPostaci = new BudowniczyWojownika();
        }

        Postac postac;
        budowniczyPostaci.wybierzImie();
        budowniczyPostaci.wybierzStatystyki();
        budowniczyPostaci.wybierzEkwipunek();
        budowniczyPostaci.wybierzLokacjeStartowa(plansza.start);
        postac = budowniczyPostaci.zwrocPostac();

        System.out.println("Witaj, " + postac.imie);
        System.out.println("Polecenia: ");
        System.out.println("'dalej' - przejscie do kolejnej lokacji");
        System.out.println("'losuj zdarzenie' - losowanie zdarzenia w danej lokacji");
        System.out.println("'wykonaj zadanie' - wykonaj wylosowane zdarzenie");
        System.out.println("'ekwipunek' - wyswietla aktualnie zalozony osprzet");
        System.out.println("'statystyki' - aktualne statystyki postaci'");
        System.out.println("Powodzenia\n");
        while(true) {
            String fraza = scanner.nextLine();
            if (fraza.equals("wyjscie")) {
                System.exit(0);
            }

            if (fraza.equals("statystyki")) {
                postac.statystyki.wypisz();
                continue;
            }

            if (fraza.equals("ekwipunek")) {
                postac.ekwipunek.wypisz();
                continue;
            }

            if (!fraza.equals("dalej")) {
                continue;
            }

            postac.podrozoj();

            Zdarzenie zdarzenie;
            while(true) {
                fraza = scanner.nextLine();
                if (fraza.equals("wyjscie")) {
                    System.exit(0);
                }

                if (fraza.equals("statystyki")) {
                    postac.statystyki.wypisz();
                }

                if (fraza.equals("ekwipunek")) {
                    postac.ekwipunek.wypisz();
                }

                if (fraza.equals("losuj zdarzenie")) {
                    zdarzenie = postac.losujZdarzenie();
                    break;
                }

            }

            while(true) {
                fraza = scanner.nextLine();
                if (fraza.equals("wyjscie")) {
                    System.exit(0);
                }

                if (fraza.equals("statystyki")) {
                    postac.statystyki.wypisz();
                }

                if (fraza.equals("ekwipunek")) {
                    postac.ekwipunek.wypisz();
                }

                if (fraza.equals("wykonaj zadanie")) {
                    zdarzenie.walcz(postac);
                    break;
                }
            }
        }
    }
}
