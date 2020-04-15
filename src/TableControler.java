import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TableControler implements Initializable
{   @FXML
    public AnchorPane pane2;
    @FXML
    private TableView<ModelTable> tabela1;
    @FXML
    private TableColumn<ModelTable,String> imie;
    @FXML
    private TableColumn<ModelTable,String> nazwisko;
    @FXML
    private TableColumn<ModelTable,String> data_wypozyczenia;
    @FXML
    private TableColumn<ModelTable, Integer> ilosc;
    @FXML
    private ObservableList<ModelTable> data = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Connection con = ConnectionUtil.getConnection();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT imie,nazwisko,data_wypozyczenia, COUNT(Wypozyczenia.id_osoby) AS ilosc\n" +
                    "FROM osoby\n" +
                    "INNER JOIN ( ksiazki INNER JOIN Wypozyczenia ON ksiazki.id_ksiazki = Wypozyczenia.id_ksiazki) ON osoby.id_osoby=Wypozyczenia.id_osoby\n" +
                    "GROUP BY osoby.nazwisko, osoby.imie;\n");
            while(rs.next())
            {
                data.add(new ModelTable(rs.getString("imie"),rs.getString("nazwisko"),rs.getString("data_wypozyczenia"), rs.getInt("ilosc")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        imie.setCellValueFactory(new PropertyValueFactory<>("imie"));
        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        data_wypozyczenia.setCellValueFactory(new PropertyValueFactory<>("data_wypozyczenia"));
        ilosc.setCellValueFactory(new PropertyValueFactory<>("ilosc"));
        tabela1.setItems(data);

    }
    public void powrot () throws IOException
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pane2.getChildren().setAll(pane);

    }

}
