public class Tarcza implements Bron {
    Statystyki statystyki;
    String nazwa;
    static int id = 4;
    Tarcza() {
        statystyki = new Statystyki(0,0,Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 10,0,0,0,0);
        nazwa = "tarcza";
    }

    public void podniesStatystyki(Postac postac) {
        postac.statystyki.obrona += statystyki.obrona;
        System.out.println("Podniesiono nowy " + nazwa);
    }

    public void zmniejszStatystyki(Postac postac) {
        postac.statystyki.obrona -= statystyki.obrona;
        if (postac.statystyki.obrona < 0) {
            postac.statystyki.obrona = 0;
        }
    }

    public static int zwrocIdBroni() {
        return id;
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
