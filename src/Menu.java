import java.util.Scanner;

public class Menu {
    Menu() { }

    public static void main(String[] args) {
        System.out.println("Witaj w grze tekstowej ŚREDNIOWIECZE");
        System.out.println("Wybierz pozycje z menu: ");
        System.out.println("1. Stwórz postać");
        System.out.println("2. Wyjdź");

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

        BudowniczyPostaci budowniczyPostaci = new BudowniczyWojownika();
        Postac postac;
        budowniczyPostaci.wybierzImie();
        budowniczyPostaci.wybierzStatystyki();
        budowniczyPostaci.wybierzEkwipunek();
        budowniczyPostaci.wybierzLokacjeStartowa(plansza.start);
        postac = budowniczyPostaci.zwrocPostac();

        System.out.println("Witaj!" + postac.imie);
        System.out.println("Wpisując frazę 'dalej' postac bedzie sie poruszac do kolejnych lokacji");
        System.out.println("Wpisujac fraze 'wyjscie' nastapi zakonczenie programu");
        System.out.println("Powodzenia!");

        while(true) {
            String fraza = scanner.nextLine();
            if (fraza.equals("wyjscie")) {
                System.exit(0);
            }

            if (fraza.equals("statystyki")) {
                postac.statystyki.wypisz();
            }

            if (fraza.equals("ekwipuenk")) {
                postac.ekwipunek.wypisz();
            }

            if (!fraza.equals("dalej")) {
                continue;
            }

            postac.podrozoj();

            Zdarzenie zdarzenie;
            while(true) {
                if (fraza.equals("wyjscie")) {
                    System.exit(0);
                }

                if (fraza.equals("statystyki")) {
                    postac.statystyki.wypisz();
                }

                if (fraza.equals("ekwipuenk")) {
                    postac.ekwipunek.wypisz();
                }

                if (!fraza.equals("losuj lokacje")) {
                    fraza = scanner.nextLine();
                    continue;
                }

                zdarzenie = postac.losujZdarzenie();
                break;
            }

            while(true) {
                if (fraza.equals("wyjscie")) {
                    System.exit(0);
                }

                if (fraza.equals("statystyki")) {
                    postac.statystyki.wypisz();
                }

                if (fraza.equals("ekwipuenk")) {
                    postac.ekwipunek.wypisz();
                }

                if (!fraza.equals("losuj zdarzenie")) {
                    fraza = scanner.nextLine();
                    continue;
                }

                zdarzenie.walcz(postac);
                break;
            }
        }





    }
}
