public class Postac {
    Statystyki statystyki;
    Ekwipunek ekwipunek;
    Lokacja lokacja;
    String imie;

    Postac(Lokacja lokacja) {
        this.lokacja = lokacja;

        statystyki = new Statystyki(0,0,0,0,0,0,0);
        ekwipunek = Ekwipunek.zwrocObiekt();
    }

    void podrozoj() {
        lokacja = lokacja.nastepnaLokacja();
    }

    void losujZdarzenie() {
        lokacja.losujZdarzenie(this);
    }
}
