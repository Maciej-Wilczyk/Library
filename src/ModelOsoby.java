public class ModelOsoby {
    private String  imie,nazwisko,adres;
    private int id_osoby;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getId_osoby() {
        return id_osoby;
    }

    public void setId_osoby(int id_osoby) {
        this.id_osoby = id_osoby;
    }

    public ModelOsoby(String imie, String nazwisko, String adres, int id_osoby) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.id_osoby = id_osoby;
    }
}
