package pl.paczka.human;

public class Human {
    private String pesel;
    private String imie;
    private String nazwisko;


    public Human (String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Human) {
            Human human = (Human)object;
            return this.pesel.equals(human.pesel) &&
                this.nazwisko.equals(human.nazwisko) &&
                this.imie.equals(human.imie);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return 11 * pesel.hashCode() + 13 * imie.hashCode() + 17 * nazwisko.hashCode();
    }


    public static void main(String[] args) {
        Human h1 = new Human("111", "imie1", "nazwisko1");
        Human h2 = new Human("111", "imie1", "nazwisko1");
        Human h3 = new Human("222", "imie1", "nazwisko1");
        Human h4 = new Human("444", "imie4", "nazwisko4");
        Human h5 = new Human("555", "imie5", "nazwisko4");

        System.out.println("H1 == H2 " + h1.equals(h2));
        System.out.println("H2 == H3 " + h2.equals(h3));
        System.out.println("H3 == H4 " + h3.equals(h4));
        System.out.println("H4 == H5 " + h4.equals(h5));
        System.out.println("H1 == H5 " + h1.equals(h5));

        System.out.println("HashCode H1 " + h1.hashCode());
        System.out.println("HashCode H2 " + h2.hashCode());
        System.out.println("HashCode H3 " + h3.hashCode());
        System.out.println("HashCode H4 " + h4.hashCode());
        System.out.println("HashCode H5 " + h5.hashCode());

    }
}
