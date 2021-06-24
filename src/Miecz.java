public class Miecz implements Bron {
    Statystyki statystyki;
    String nazwa;
    static int id = 1;
    Miecz() {
        statystyki = new Statystyki(0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,0,-3,-3,0,0);
        nazwa = "miecz";
    }

    public void podniesStatystyki(Postac postac) {
        postac.statystyki.atak += statystyki.atak;
    }

    public void zmniejszStatystyki(Postac postac) {
        postac.statystyki.atak -= statystyki.atak;
        if (postac.statystyki.atak < 0) {
            postac.statystyki.atak = 0;
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
