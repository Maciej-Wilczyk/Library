import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
  ConnectionUtil a = new ConnectionUtil();


    public boolean isAa() {
        return st.st;
    }

    public void setAa(boolean aa) {
        st.st = aa;
    }



  public static void main (String args[]) {
launch(args);

  }

    @Override
    public void start(Stage stage) throws Exception {
        // a.getConnection();
        Control c = new Control();
        window = stage;
        window.setTitle("Tytul");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        window.setScene(new Scene(root,600,450));

        window.show();
    }
}


  /*  public void adad()
    {
        Statement st = con.createStatement();
        String sql = "SELECT imie,nazwisko,data_wypozyczenia, COUNT(Wypozyczenia.id_osoby) AS Policzks\n" +
                "FROM osoby\n" +
                "INNER JOIN ( ksiazki INNER JOIN Wypozyczenia ON ksiazki.id_ksiazki = Wypozyczenia.id_ksiazki) ON osoby.id_osoby=Wypozyczenia.id_osoby\n" +
                "GROUP BY osoby.nazwisko, osoby.imie;";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            System.out.println(rs.getString("imie"));
            System.out.println(rs.getInt("Policzks"));
        }
    }

}*/
