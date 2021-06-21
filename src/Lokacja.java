public class Lokacja {
    String nazwa;
    Zdarzenie[] zdarzenia;
    Lokacja[] nastepneLokacje;
    Lokacja(String nazwa, Zdarzenie[] zdarzenia, Lokacja[] nastepneLokacje) {
        this.zdarzenia = zdarzenia;
        this.nastepneLokacje = nastepneLokacje;
        this.nazwa = nazwa;
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
