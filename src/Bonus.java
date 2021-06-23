
public class Bonus {
    private static Statystyki statystyki;

    Bonus() {
        statystyki = new Statystyki(0,0,0,0,0,0,0);
    }

    public static void losujDobryBonus() {
        statystyki = new Statystyki(RandomNumberGenerator.randomNumberGenerator.nextInt() % 7,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) % 7,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) % 7,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) % 7,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) % 7,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) % 7,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) % 7);
    }

    public static void losujZlyBonus() {
        statystyki = new Statystyki((RandomNumberGenerator.randomNumberGenerator.nextInt() % 6) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 6)) * -1);
    }



    public static void przyznaj(Postac postac) {
        if (statystyki.atak > 0) {
            postac.statystyki.atak += statystyki.atak;
            System.out.println("Podniesiono atak o " + statystyki.atak);
        }
        else if (statystyki.atak < 0) {
            postac.statystyki.atak += statystyki.atak;
            System.out.println("Pomniejszono atak o " + statystyki.atak);
        }

        if (statystyki.bialaMagia > 0) {
            postac.statystyki.bialaMagia += statystyki.bialaMagia;
            System.out.println("Podniesiono biala magie o " + statystyki.bialaMagia);
        }
        else if (statystyki.bialaMagia < 0) {
            postac.statystyki.bialaMagia += statystyki.bialaMagia;
            System.out.println("Pomniejszono biala magie o " + statystyki.bialaMagia);
        }

        if (statystyki.czarnaMagia > 0) {
            postac.statystyki.czarnaMagia += statystyki.czarnaMagia;
            System.out.println("Podniesiono czarna magie o " + statystyki.czarnaMagia);
        }
        else if (statystyki.czarnaMagia < 0) {
            postac.statystyki.czarnaMagia += statystyki.czarnaMagia;
            System.out.println("Pomniejszono czarna magie o " + statystyki.czarnaMagia);
        }

        if (statystyki.obrona > 0) {
            postac.statystyki.obrona += statystyki.obrona;
            System.out.println("Podniesiono obrone o " + statystyki.obrona);
        }
        else if (statystyki.obrona < 0) {
            postac.statystyki.obrona += statystyki.obrona;
            System.out.println("Pomniejszono obrone  o " + statystyki.obrona);
        }

        if (statystyki.punktyZdrowia > 0) {
            postac.statystyki.punktyZdrowia += statystyki.punktyZdrowia;
            System.out.println("Podniesiono punkty zdrowia o " + statystyki.punktyZdrowia);
        }
        else if (statystyki.punktyZdrowia < 0) {
            postac.statystyki.punktyZdrowia += statystyki.punktyZdrowia;
            System.out.println("Pomniejszono punkty zdrowia o " + statystyki.punktyZdrowia);
        }

        if (statystyki.perswazja > 0) {
            postac.statystyki.perswazja += statystyki.perswazja;
            System.out.println("Podniesiono perswazje o " + statystyki.perswazja);
        }
        else if (statystyki.perswazja < 0) {
            postac.statystyki.perswazja += statystyki.perswazja;
            System.out.println("Pomniejszono perswazje o " + statystyki.perswazja);
        }

        if (statystyki.zasieg > 0) {
            postac.statystyki.zasieg += statystyki.zasieg;
            System.out.println("Podniesiono zasieg o " + statystyki.zasieg);
        }
        else if (statystyki.zasieg < 0) {
            postac.statystyki.zasieg += statystyki.zasieg;
            System.out.println("Pomniejszono zasieg o " + statystyki.zasieg);
        }

    }
}
