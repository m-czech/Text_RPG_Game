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

    Zdarzenie losujZdarzenie(Postac postac) {
        int losowaLiczba = Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt());
        int losowyIndeks = losowaLiczba % zdarzenia.length;
        Zdarzenie zdarzenie = zdarzenia[losowyIndeks];
        System.out.println(zdarzenie.nazwa);
        return zdarzenie;
    }

    Lokacja nastepnaLokacja() {
        Lokacja lokacja = nastepneLokacje[Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % nastepneLokacje.length];
        System.out.println("Podróż do " + lokacja.nazwa);
        return lokacja;
    }
}
