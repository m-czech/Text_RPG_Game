import java.util.LinkedList;

public class Postac {
    Statystyki statystyki;
    Ekwipunek ekwipunek;
    Lokacja lokacja;
    String imie;

    Postac() {
        statystyki = new Statystyki(0,0,0,0,0,0,0);
        ekwipunek = Ekwipunek.zwrocObiekt();
    }

    void podrozoj() {
        lokacja = lokacja.nastepnaLokacja();
    }

    Zdarzenie losujZdarzenie() {
        return lokacja.losujZdarzenie(this);
    }
}
