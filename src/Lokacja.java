public class Lokacja {
    String nazwa;
    Zdarzenie[] zdarzenia;
    Lokacja[] nastepneLokacje;

    void ustawNazwe(String nazwa) {
        this.nazwa = nazwa;
    }

    void ustawZdarzenia(Zdarzenie[] zdarzenia) {
        this.zdarzenia = zdarzenia;
    }

    void ustawLokacje(Lokacja[] nastepneLokacje) {
        this.nastepneLokacje = nastepneLokacje;
    }

    void losujZdarzenie(Postac postac) {
        Zdarzenie zdarzenie = zdarzenia[RandomNumberGenerator.randomNumberGenerator.nextInt()  % zdarzenia.length];
        System.out.println(zdarzenie.nazwa);
        zdarzenie.walcz(postac);
    }

    Lokacja nastepnaLokacja() {
        System.out.println("Podróż do " + nazwa);
        return nastepneLokacje[RandomNumberGenerator.randomNumberGenerator.nextInt() % nastepneLokacje.length];
    }
}
