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

    public static void rozdajStatystyki(Postac postac, Statystyki podwyzszoneStatystyki) {
        if (podwyzszoneStatystyki.atak > 0) {
            postac.statystyki.atak += podwyzszoneStatystyki.atak;
            System.out.println("Podniesiono atak o " + podwyzszoneStatystyki.atak);
        }
        else if (podwyzszoneStatystyki.atak < 0) {
            postac.statystyki.atak += podwyzszoneStatystyki.atak;
            if (postac.statystyki.atak < 0) {
                postac.statystyki.atak = 0;
            }
            System.out.println("Pomniejszono atak o " + podwyzszoneStatystyki.atak);
        }

        if (podwyzszoneStatystyki.bialaMagia > 0) {
            postac.statystyki.bialaMagia += podwyzszoneStatystyki.bialaMagia;
            System.out.println("Podniesiono biala magie o " + podwyzszoneStatystyki.bialaMagia);
        }
        else if (podwyzszoneStatystyki.bialaMagia < 0) {
            postac.statystyki.bialaMagia += podwyzszoneStatystyki.bialaMagia;
            if (postac.statystyki.bialaMagia < 0) {
                postac.statystyki.bialaMagia = 0;
            }
            System.out.println("Pomniejszono biala magie o " + podwyzszoneStatystyki.bialaMagia);
        }

        if (podwyzszoneStatystyki.czarnaMagia > 0) {
            postac.statystyki.czarnaMagia += podwyzszoneStatystyki.czarnaMagia;
            System.out.println("Podniesiono czarna magie o " + podwyzszoneStatystyki.czarnaMagia);
        }
        else if (podwyzszoneStatystyki.czarnaMagia < 0) {
            postac.statystyki.czarnaMagia += podwyzszoneStatystyki.czarnaMagia;
            if (postac.statystyki.czarnaMagia < 0) {
                postac.statystyki.czarnaMagia = 0;
            }
            System.out.println("Pomniejszono czarna magie o " + podwyzszoneStatystyki.czarnaMagia);
        }

        if (podwyzszoneStatystyki.obrona > 0) {
            postac.statystyki.obrona += podwyzszoneStatystyki.obrona;
            System.out.println("Podniesiono obrone o " + podwyzszoneStatystyki.obrona);
        }
        else if (podwyzszoneStatystyki.obrona < 0) {
            postac.statystyki.obrona += podwyzszoneStatystyki.obrona;
            if (postac.statystyki.obrona < 0) {
                postac.statystyki.obrona = 0;
            }
            System.out.println("Pomniejszono obrone  o " + podwyzszoneStatystyki.obrona);
        }

        if (podwyzszoneStatystyki.punktyZdrowia > 0) {
            postac.statystyki.punktyZdrowia += podwyzszoneStatystyki.punktyZdrowia;
            System.out.println("Podniesiono punkty zdrowia o " + podwyzszoneStatystyki.punktyZdrowia);
        }

        else if (podwyzszoneStatystyki.punktyZdrowia < 0) {
            postac.statystyki.punktyZdrowia += podwyzszoneStatystyki.punktyZdrowia;
            if (postac.statystyki.punktyZdrowia < 0) {
                postac.statystyki.punktyZdrowia = 0;
            }
            System.out.println("Pomniejszono punkty zdrowia o " + podwyzszoneStatystyki.punktyZdrowia);
        }

        if (podwyzszoneStatystyki.perswazja > 0) {
            postac.statystyki.perswazja += podwyzszoneStatystyki.perswazja;
            System.out.println("Podniesiono perswazje o " + podwyzszoneStatystyki.perswazja);
        }

        else if (podwyzszoneStatystyki.perswazja < 0) {
            postac.statystyki.perswazja += podwyzszoneStatystyki.perswazja;
            if (postac.statystyki.perswazja < 0) {
                postac.statystyki.perswazja = 0;
            }
            System.out.println("Pomniejszono perswazje o " + podwyzszoneStatystyki.perswazja);
        }

        if (podwyzszoneStatystyki.zasieg > 0) {
            postac.statystyki.zasieg += podwyzszoneStatystyki.zasieg;
            System.out.println("Podniesiono zasieg o " + podwyzszoneStatystyki.zasieg);
        }
        else if (podwyzszoneStatystyki.zasieg < 0) {
            postac.statystyki.zasieg += podwyzszoneStatystyki.zasieg;
            if (postac.statystyki.zasieg < 0) {
                postac.statystyki.zasieg = 0;
            }
            System.out.println("Pomniejszono zasieg o " + podwyzszoneStatystyki.zasieg);
        }
    }
}
