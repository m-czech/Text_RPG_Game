public class Ekwipunek {
    Bron firstSlot;
    Bron secondSlot;
    private static Ekwipunek ekwipunek;

    private Ekwipunek() { }

    public static Ekwipunek zwrocObiekt() {
        if (ekwipunek == null) {
            ekwipunek = new Ekwipunek();
        }
        return ekwipunek;
    }

    public void dodajBron(Postac postac, Bron nowaBron) {
        nowaBron.podniesStatystyki(postac);

        if (firstSlot == null) {
            firstSlot = nowaBron;
        }
        else {
            secondSlot = nowaBron;
        }
    }
}
