public class ModelWypozyczenia {

    private String  data_wypozyczenia;
    private int id_wypozyczenia,id_ksiazki, id_osoby;

    public ModelWypozyczenia(String data_wypozyczenia, int id_wypozyczenia, int id_ksiazki, int id_osoby) {
        this.data_wypozyczenia = data_wypozyczenia;
        this.id_wypozyczenia = id_wypozyczenia;
        this.id_ksiazki = id_ksiazki;
        this.id_osoby = id_osoby;
    }

    public String getData_wypozyczenia() {
        return data_wypozyczenia;
    }

    public void setData_wypozyczenia(String data_wypozyczenia) {
        this.data_wypozyczenia = data_wypozyczenia;
    }

    public int getId_wypozyczenia() {
        return id_wypozyczenia;
    }

    public void setId_wypozyczenia(int id_wypozyczenia) {
        this.id_wypozyczenia = id_wypozyczenia;
    }

    public int getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(int id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
    }

    public int getId_osoby() {
        return id_osoby;
    }

    public void setId_osoby(int id_osoby) {
        this.id_osoby = id_osoby;
    }
}
