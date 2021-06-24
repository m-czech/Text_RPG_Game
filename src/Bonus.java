
public class Bonus {

    public static Statystyki podwyzszoneStatystyki() {
        return new Statystyki((Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5),
                Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,
                Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,
                Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,
                Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,
                Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5,
                Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % 5);

    }

    public static Bron generujNowaBron(Postac postac) {
        return LosowaBron.zwrocLosowaBron(postac);
    }

    public static Statystyki zmniejszoneStatystyki () {
        return new Statystyki((RandomNumberGenerator.randomNumberGenerator.nextInt() % 6) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 3)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 3)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 3)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 3)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 3)) * -1,
                (Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt() % 3)) * -1);
    }
}
