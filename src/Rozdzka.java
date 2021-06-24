public class Rozdzka implements Bron {
    Statystyki statystyki;
    String nazwa;
    static int id = 2;
    Rozdzka() {
        statystyki = new Statystyki(0,0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 3,0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 3,0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 2);
        nazwa = "rozdzka";
    }

    public void podniesStatystyki(Postac postac) {
        postac.statystyki.obrona += statystyki.obrona;
        postac.statystyki.czarnaMagia += statystyki.czarnaMagia;
        postac.statystyki.zasieg += statystyki.zasieg;
        System.out.println("Podniesiono nowy " + nazwa);
    }

    public void zmniejszStatystyki(Postac postac) {
        postac.statystyki.obrona -= statystyki.obrona;
        if (postac.statystyki.obrona < 0) {
            postac.statystyki.obrona = 0;
        }

        postac.statystyki.czarnaMagia -= statystyki.czarnaMagia;
        if (postac.statystyki.czarnaMagia < 0) {
            postac.statystyki.czarnaMagia = 0;
        }

        postac.statystyki.zasieg -= statystyki.zasieg;
        if (postac.statystyki.zasieg < 0) {
            postac.statystyki.zasieg = 0;
        }
    }

    public String zwrocNazweBroni() {
        return nazwa;
    }

    public Statystyki zwrocStatystyki() {
        return statystyki;
    }

    public int sumujStatystyki() {
        return statystyki.sumuj();
    }
}
