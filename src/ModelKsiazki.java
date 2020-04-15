public class ModelKsiazki {

        private String  tytul,autor;
        private int id_ksiazki;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(int id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
    }

    public ModelKsiazki(String tytul, String autor, int id_ksiazki) {
        this.tytul = tytul;
        this.autor = autor;
        this.id_ksiazki = id_ksiazki;
    }
}
