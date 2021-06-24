public class Plansza {
    public Lokacja start = new Lokacja();
    public Lokacja gory = new Lokacja();
    public Lokacja miasto = new Lokacja();
    public Lokacja wies = new Lokacja();
    public Lokacja bagno = new Lokacja();
    public Lokacja las = new Lokacja();
    public Lokacja lochy = new Lokacja();
    public Lokacja zamek = new Lokacja();
    public Lokacja lezeSmoka = new Lokacja();

    Plansza() {
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = lochy;
            Zdarzenie[] zdarzenia = new Zdarzenie[1];
            zdarzenia[0] = new Zdarzenie(" ", " ", " ", false);

            start.ustawNazwe("START");
            start.ustawLokacje(lokacje);
            start.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = wies;
            lokacje[1] = las;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Zostajesz uwieziony w lochach",
                    "Wydostajesz sie niezauwazenie",
                    "Straznik zostawia otwarte drzwi, wykorzystujesz sytuacje, \n jednakze przy opuszczeniu budynku zostajesz postrzelony. Krwawisz",
                    false);
            zdarzenia[1] = new Zdarzenie("Wspolwiezien napada na Ciebie",
                    "Udaje Ci sie go pokonac",
                    "Zostajesz pobity",
                    false);

            lochy.ustawNazwe("Lochy");
            lochy.ustawLokacje(lokacje);
            lochy.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = miasto;
            lokacje[1] = las;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Pracujesz w polu",
                    "Za wykonana prace otrzymujesz nowa bron",
                    "Pozostalo jeszcze troche pola do plewienia.\nZostajesz drugi dzien",
                    true);
            zdarzenia[1] = new Zdarzenie("Romans z wiesniaczkom",
                    "Zyskujesz przychylnosc kobiety",
                    "Nieudana proba podrywu",
                    false);

            wies.ustawNazwe("Wies");
            wies.ustawLokacje(lokacje);
            wies.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = zamek;
            lokacje[1] = wies;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Spotykasz starego druha",
                    "Idziesz z nim na piwo",
                    "Mezczyzna Cie nie poznaje",
                    false);
            zdarzenia[1] = new Zdarzenie("Wizyta w karczmie",
                    "Dobrze sie bawisz",
                    "Upijasz sie",
                    false);

            miasto.ustawNazwe("Miasto");
            miasto.ustawLokacje(lokacje);
            miasto.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = las;
            lokacje[1] = miasto;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Audiencja z krolem",
                    "Dostajesz nowy osprzet",
                    "Krol nie ma dla ciebie zadnego zadania",
                    true);
            zdarzenia[1] = new Zdarzenie("Uczta na zamku",
                    "Poznajesz duzo nowych ludzi",
                    "Ze wzgledu na twoja range, nikt nie chce z Toba rozmawiac",
                    false);

            zamek.ustawNazwe("Zamek");
            zamek.ustawLokacje(lokacje);
            zamek.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[2];
            lokacje[0] = bagno;
            lokacje[1] = gory;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Walczysz z potworem",
                    "Zwyciestwo",
                    "Zostajesz mocno poturbowany, a potwor ucieka",
                    true);
            zdarzenia[1] = new Zdarzenie("Zbierasz jagody",
                    "Jestes najedzony i odzyskujesz sily",
                    "Dostajesz zatrucia zoladkowego",
                    false);

            las.ustawNazwe("Las");
            las.ustawLokacje(lokacje);
            las.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = zamek;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Napotkasz smoka",
                    "Wbijasz miecz w serce potwora pokonujac go",
                    "Ledwo zipiesz i chowasz sie w szczelinie skalnej",
                    false);
            zdarzenia[1] = new Zdarzenie("Wchodzisz do jaskini smoka, lecz go potwora",
                    "Kradniesz kosztownosci bedacych strzezonych przez monstrum",
                    "Smok Cie dostrzegl. Uciekasz.",
                    false);

            lezeSmoka.ustawNazwe("Leze smoka");
            lezeSmoka.ustawLokacje(lokacje);
            lezeSmoka.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = lezeSmoka;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Ugrzazles w bagnie",
                    "Lapiesz galaz i ratujesz swoje zycie",
                    "Masz skrepowane ruchy, nastepnego dnia znajduje Cie wiesniak. Jestes wycienczony.",
                    false);
            zdarzenia[1] = new Zdarzenie("Znajdujesz skarb",
                    "Skarbem okazuje sie nowa bron",
                    "Kufer jest pusty",
                    true);

            bagno.ustawNazwe("Bagno");
            bagno.ustawLokacje(lokacje);
            bagno.ustawZdarzenia(zdarzenia);
        }
        {
            Lokacja[] lokacje = new Lokacja[1];
            lokacje[0] = lezeSmoka;
            Zdarzenie[] zdarzenia = new Zdarzenie[2];
            zdarzenia[0] = new Zdarzenie("Wspinasz sie po gorach",
                    "Udaje Ci sie wejsc na szczyt",
                    "Spadasz z duzej wysokosci. Tracisz przytomnosc.",
                    false);
            zdarzenia[1] = new Zdarzenie("Napasc przez rabusiow",
                    "Jestes za slaby na podjecie walki, ale udaje Ci sie uciec",
                    "Zostajesz okradziony, tracisz osprzet",
                    false);

            gory.ustawNazwe("Gory");
            gory.ustawLokacje(lokacje);
            gory.ustawZdarzenia(zdarzenia);
        }

    }
}
