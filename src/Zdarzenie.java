public class Zdarzenie {
    String nazwa;
    String komunikatWygranej;
    String komunikatPrzegranej;

    Zdarzenie(String nazwa, String komunikatWygranej, String komunikatPrzegranej) {
        this.nazwa = nazwa;
        this.komunikatPrzegranej = komunikatPrzegranej;
        this.komunikatWygranej = komunikatWygranej;
    }

    boolean walcz(Postac postac) {
        if ((RandomNumberGenerator.randomNumberGenerator.nextInt() % 100) + postac.statystyki.sumuj() >= 100) {
            System.out.println(komunikatWygranej);
            Bonus.losujDobryBonus();
            return true;
        }
        System.out.println(komunikatPrzegranej);
        Bonus.losujZlyBonus();
        Bonus.przyznaj(postac);
        return false;
    }



}
