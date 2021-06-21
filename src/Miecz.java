public class Miecz implements Bron {
    Statystyki statystyki;
    Miecz() {
        statystyki = new Statystyki(0,4,0,0,0,0,0);
    }

    public void podniesStatystyki(Postac postac) {
        postac.statystyki.atak += statystyki.atak;
        System.out.println("Podniesiono atak o " + statystyki.atak);
    }
}
