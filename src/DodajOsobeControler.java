import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class DodajOsobeControler {
    @FXML
    public AnchorPane paneDodajOsobe;
    @FXML
    public TextField imie;
    @FXML
    public TextField nazwisko;
    @FXML
    public TextField adres;

    @FXML
   public void dodajOsobe()
    {
        Connection con = ConnectionUtil.getConnection();
        try {
             con.createStatement().executeUpdate("INSERT INTO osoby (imie, nazwisko, adres) VALUES  ('"+imie.getText()+"','"+nazwisko.getText()+"','"+adres.getText()+"')");

             System.out.println("dodano");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void powrot() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        paneDodajOsobe.getChildren().setAll(pane);
    }
}