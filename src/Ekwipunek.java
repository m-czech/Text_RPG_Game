import java.util.LinkedList;

public class Ekwipunek {
    LinkedList<Integer> akceptowaneTypyBroni;
    Bron pierwszySlot;
    Bron drugiSlot;
    private static Ekwipunek ekwipunek;


    private Ekwipunek() {
        akceptowaneTypyBroni = new LinkedList<>();
    }

    public static Ekwipunek zwrocObiekt() {
        if (ekwipunek == null) {
            ekwipunek = new Ekwipunek();
        }
        return ekwipunek;
    }

    public void dodajBron(Postac postac, Bron nowaBron) {
        if (pierwszySlot == null) {
            pierwszySlot = nowaBron;
            nowaBron.podniesStatystyki(postac);
        }
        else if (drugiSlot == null) {
            drugiSlot = nowaBron;
            nowaBron.podniesStatystyki(postac);
        }
        else if (pierwszySlot.sumujStatystyki() < nowaBron.sumujStatystyki()) {
            pierwszySlot.zmniejszStatystyki(postac);
            pierwszySlot = nowaBron;
            nowaBron.podniesStatystyki(postac);
        }
        else if (drugiSlot.sumujStatystyki() < nowaBron.sumujStatystyki()) {
            drugiSlot.zmniejszStatystyki(postac);
            drugiSlot = nowaBron;
            nowaBron.podniesStatystyki(postac);
        }
        else {
            System.out.println("Znaleziona bron jest slabsza od aktualnie wyposazonych");
        }

        if (pierwszySlot == nowaBron || drugiSlot == nowaBron) {
            System.out.println("Nowy " + nowaBron.zwrocNazweBroni() + " znajduje sie w ekwipunku \n");
        }

    }

    public void wypisz() {
        if (pierwszySlot != null) {
            System.out.println("Broń: " + pierwszySlot.zwrocNazweBroni() + '\n');
            pierwszySlot.zwrocStatystyki().wypisz();
            System.out.println();
        }

        if (drugiSlot != null) {
            System.out.println("Broń: " + drugiSlot.zwrocNazweBroni() + '\n');
            drugiSlot.zwrocStatystyki().wypisz();
            System.out.println();
        }
    }
}
