public class Topor implements Bron{
    Statystyki statystyki;
    String nazwa;
    static int id = 3;
    Topor() {
        statystyki = new Statystyki(0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 3,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 3,-2,-2,0,0);
        nazwa = "topor";
    }

    public void podniesStatystyki(Postac postac) {
        postac.statystyki.atak += statystyki.atak;
        postac.statystyki.obrona += statystyki.obrona;
        System.out.println("Podniesiono nowy " + nazwa);
    }

    public void zmniejszStatystyki(Postac postac) {
        postac.statystyki.obrona -= statystyki.obrona;
        if (postac.statystyki.obrona < 0) {
            postac.statystyki.obrona = 0;
        }

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
