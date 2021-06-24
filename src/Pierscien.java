public class Pierscien implements Bron {
    Statystyki statystyki;
    String nazwa;
    static int id = 5;
    Pierscien() {
        statystyki = new Statystyki(Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 6,0,0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,0);
        nazwa = "pierscien";
    }

    public void podniesStatystyki(Postac postac) {
        postac.statystyki.punktyZdrowia += statystyki.punktyZdrowia;
        postac.statystyki.bialaMagia += statystyki.bialaMagia;
        postac.statystyki.perswazja += statystyki.perswazja;
        System.out.println("Podniesiono nowy " + nazwa);
    }

    public void zmniejszStatystyki(Postac postac) {
        postac.statystyki.perswazja -= statystyki.perswazja;
        if (postac.statystyki.perswazja < 0) {
            postac.statystyki.perswazja = 0;
        }

        postac.statystyki.bialaMagia -= statystyki.bialaMagia;
        if (postac.statystyki.bialaMagia < 0) {
            postac.statystyki.bialaMagia = 0;
        }

        postac.statystyki.punktyZdrowia -= statystyki.punktyZdrowia;
        if (postac.statystyki.punktyZdrowia < 0) {
            postac.statystyki.punktyZdrowia = 0;
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
