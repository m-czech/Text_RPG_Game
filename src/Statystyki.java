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

    public void wypisz() {
        System.out.println("Punkty zdrowia: " + punktyZdrowia);
        System.out.println("Atak " + atak);
        System.out.println("Obrona: " + obrona);
        System.out.println("Biala magia: " + bialaMagia);
        System.out.println("Czarna magia: " + czarnaMagia);
        System.out.println("Zasieg: " + zasieg);
        System.out.println("Perswazja: " + perswazja);
    }



}
