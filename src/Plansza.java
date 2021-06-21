public class Plansza {
    public static Lokacja start, gory, miasto, wies, bagno, las, lochy, zamek, lezeSmoka;


    Plansza() {
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = lochy;
            Zdarzenie[] zdarzenia = new Zdarzenie[1];
            zdarzenia[0] = new Zdarzenie(" ", " ", " ");
            start = new Lokacja("START", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = wies;
            lokacje[1] = las;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Zostajesz uwieziony w lochach", "Wydostajesz sie z zamkniecia", "Nieudana proba ucieczki");
            zdarzenia[1] = new Zdarzenie("Wspolwiezien napada na Ciebie", "Udaje Ci sie go pokonac", "Zostajesz pobity");
            start = new Lokacja("Lochy", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = miasto;
            lokacje[1] = las;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Pracujesz w polu", "Konczysz prace pierwszego dnia", "Pozostalo jeszcze troche pola do plewienia.\nZostajesz drugi dzien");
            zdarzenia[1] = new Zdarzenie("Romans z wiesniaczkom", "Zyskujesz przychylnosc kobiety", "Nieudana proba podrywu");
            start = new Lokacja("Wies", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = zamek;
            lokacje[1] = wies;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Spotykasz starego druha", "Idziesz z nim na piwo", "Mezczyzna Cie nie poznaje");
            zdarzenia[1] = new Zdarzenie("Wizyta w karczmie", "Dobrze sie bawisz", "Upijasz sie");
            start = new Lokacja("Miasto", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = las;
            lokacje[1] = miasto;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Audiencja z krolem", "Dostajesz nowy miecz", "Krol nie ma dla ciebie zadnego zadania");
            zdarzenia[1] = new Zdarzenie("Uczta na zamku", "Poznajesz duzo nowych ludzi", "Ze wzgledu na twoja range, nikt nie chce z Toba rozmawiac");
            start = new Lokacja("Zamek", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = miasto;
            lokacje[1] = las;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Pracujesz w polu", "Konczysz prace pierwszego dnia", "Pozostalo jeszcze troche pola do plewienia.\nZostajesz drugi dzien");
            zdarzenia[1] = new Zdarzenie("Romans z wiesniaczkom", "Zyskujesz przychylnosc kobiety", "Nieudana proba podrywu");
            start = new Lokacja("Wies", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = bagno;
            lokacje[1] = gory;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Walczysz z potworem", "Zwyciestwo", "Zostajesz mocno poturbowany, a potwor ucieka");
            zdarzenia[1] = new Zdarzenie("Zbierasz jagody", "Jestes najedzony i odzyskujesz sily", "Dostajesz zatrucia zoladkowego");
            start = new Lokacja("Las", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = zamek;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Napotkasz smoka", "Wbijasz miecz w serce potwora pokonujac go", "Ledwo zipiesz i chowasz sie w szczelinie skalnej");
            zdarzenia[1] = new Zdarzenie("Wchodzisz do jaskini smoka, lecz go potwora", "Kradniesz kosztownosci bedacych strzezonych przez monstrum", "Smok Cie dostrzegl. Uciekasz.");
            start = new Lokacja("Leze smoka", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = lezeSmoka;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Ugrzazles w bagnie", "Lapiesz galaz i ratujesz swoje zycie", "Masz skrepowane ruchy, nastepnego dnia znajduje Cie wiesniak. Jestes wycienczony.");
            zdarzenia[1] = new Zdarzenie("Znajdujesz skarb", "Skarbem okazuje sie nowa bron", "Kufer jest pusty");
            start = new Lokacja("Bagno", zdarzenia, lokacje);
        }
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = lezeSmoka;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Wspinasz sie po gorach", "Udaje Ci sie wejsc na szczyt", "Spadasz z duzej wysokosci. Tracisz przytomnosc.");
            zdarzenia[1] = new Zdarzenie("Napasc przez rabusiow", "Jestes za slaby na podjecie walki, ale udaje Ci sie uciec", "Zostajesz okradziony, tracisz osprzet");
            start = new Lokacja("Gory", zdarzenia, lokacje);
        }

    }
}
