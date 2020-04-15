import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DodajKsiazkeControler {
    @FXML
    public AnchorPane paneDodajKsiazke;
    @FXML
    public TextField tytul;
    @FXML
    public TextField autor;


    @FXML
    public void dodajKsiazke()
    {
        Connection con = ConnectionUtil.getConnection();
        try {
            con.createStatement().executeUpdate("INSERT INTO ksiazki (tytul,autor) VALUES  ('"+tytul.getText()+"','"+autor.getText()+"')");

            System.out.println("dodano");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void powrot() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        paneDodajKsiazke.getChildren().setAll(pane);
    }
}