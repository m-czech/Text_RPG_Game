public class Statystyki {
    int punktyZdrowia;
    int atak;
    int obrona;
    int bialaMagia;
    int czarnaMagia;
    int perswazja;
    int zasieg;

    Statystyki(int punktyZdrowia, int atak, int obrona, int bialaMagia, int czarnaMagia, int perswazja, int zasieg) {
        this.punktyZdrowia = punktyZdrowia;
        this.atak = atak;
        this.obrona = obrona;
        this.bialaMagia = bialaMagia;
        this.czarnaMagia = czarnaMagia;
        this.perswazja = perswazja;
        this.zasieg = zasieg;
    }

    public int sumuj() {
        return atak + obrona + bialaMagia + czarnaMagia + perswazja + zasieg + punktyZdrowia;
    }



}
