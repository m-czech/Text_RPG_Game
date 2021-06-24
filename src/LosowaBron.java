public class LosowaBron {
    static Bron zwrocLosowaBron(Postac postac) {
        Integer[] akceptowaneBronie = postac.ekwipunek.akceptowaneTypyBroni.toArray(new Integer[0]);
        int losowyIndeks = Math.abs(RandomNumberGenerator.randomNumberGenerator.nextInt()) % akceptowaneBronie.length;
        int wylosowaneId = akceptowaneBronie[losowyIndeks];

        if (Miecz.id == wylosowaneId) {
            return new Miecz();
        }
        if (Topor.id == wylosowaneId) {
            return new Topor();
        }
        if (Rozdzka.id == wylosowaneId) {
            return new Tarcza();
        }
        if (Tarcza.id == wylosowaneId) {
            return new Rozdzka();
        }
        return new Pierscien();
    }
}
