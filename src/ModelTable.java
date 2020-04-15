public class ModelTable {
    private String imie, nazwisko, data_wypozyczenia;
    private int ilosc;

    public ModelTable(String imie, String nazwisko, String data_wypozyczenia, int ilosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_wypozyczenia = data_wypozyczenia;
        this.ilosc = ilosc;
    }

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

    public String getData_wypozyczenia() {
        return data_wypozyczenia;
    }

    public void setData_wypozyczenia(String data_wypozyczenia) {
        this.data_wypozyczenia = data_wypozyczenia;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}