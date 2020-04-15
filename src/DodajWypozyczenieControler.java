/*import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.skin.ComboBoxListViewSkin;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class DodajWypozyczenieControler {
    @FXML
    private ObservableList<ModelKs> data = FXCollections.observableArrayList();

    @FXML
    public AnchorPane paneDodajWypozyczenie;
  //  @FXML
   // public ComboBoxListViewSkin<ModelKs> ksiazka;
    @FXML
    public ComboBox ksiazka;



    @FXML
    public void dodajKsiazke() {
        Connection con = ConnectionUtil.getConnection();
        try {
            con.createStatement().executeQuery("SELECT ");

            System.out.println("dodano");

            while(rs.next())
            {
                ksiazka(data).add(rs.getString{"";)
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void powrot() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        paneDodajKsiazke.getChildren().setAll(pane);
    }
}
class ModelKs
{
    String tytul;

    public ModelKs(String tytul) {
        this.tytul = tytul;
    }

    public String getTytul() {
        return tytul;
    }

    public void setKsiazka(String tytul) {
        this.tytul = tytul;
    }
}*/