public class Zdarzenie {
    String nazwa;
    String komunikatWygranej;
    String komunikatPrzegranej;
    boolean bonusowaBron;

    Zdarzenie(String nazwa, String komunikatWygranej, String komunikatPrzegranej, boolean bonusowaBron) {
        this.nazwa = nazwa;
        this.komunikatPrzegranej = komunikatPrzegranej;
        this.komunikatWygranej = komunikatWygranej;
        this.bonusowaBron = bonusowaBron;
    }

    void rozdajBonusPrzyWygranej(Postac postac) {
        if (bonusowaBron) {
            postac.ekwipunek.dodajBron(postac, Bonus.generujNowaBron(postac));
        }
        else {
            Statystyki.rozdajStatystyki(postac, Bonus.podwyzszoneStatystyki());
        }
    }

    void rozdajBonusPrzyPrzegranej(Postac postac) {
        Statystyki.rozdajStatystyki(postac, Bonus.zmniejszoneStatystyki());
    }

    boolean walcz(Postac postac) {
        if ((Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 85) + postac.statystyki.sumuj() >= 65) {
            System.out.println(komunikatWygranej);
            rozdajBonusPrzyWygranej(postac);
            return true;
        }
        System.out.println(komunikatPrzegranej);
        rozdajBonusPrzyPrzegranej(postac);
        return false;
    }

}
