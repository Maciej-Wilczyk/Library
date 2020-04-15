/*import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
public class TableWypozyczenia implements Initializable {
    @FXML
    public AnchorPane paneWypozyczenia;
    @FXML
    private TableView<ModelWypozyczenia> tableWypozycznia;
    @FXML
    private TableColumn<ModelWypozyczenia, Integer> id_osoby;
    @FXML
    private TableColumn<ModelWypozyczenia,String> data_wypozyczenia;

    @FXML
    private TableColumn<ModelWypozyczenia, Integer> id_wypozyczenia;
    @FXML
    private TableColumn<ModelWypozyczenia, Integer> id_ksiazki;
    @FXML
    private ObservableList<ModelWypozyczenia> data = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Connection con = ConnectionUtil.getConnection();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT  * FROM wypozyczenia");
            while(rs.next())
            {
                data.add(new ModelWypozyczenia( rs.getInt("id_wypozyczenia"),rs.getInt("id_ksiazki"), rs.getString("data_wypozyczenia"),rs.getInt("id_osoby")))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        id_ksiazki.setCellValueFactory(new PropertyValueFactory<>("id_ksiazki"));
        id_osoby.setCellValueFactory(new PropertyValueFactory<>("id_osoby"));
        id_wypozyczenia.setCellValueFactory(new PropertyValueFactory<>("id_wypozyczenia"));
        data_wypozyczenia.setCellValueFactory(new PropertyValueFactory<>("data_wypozyczenia"));
        tableWypozycznia.setItems(data);

    }
    public void powrot () throws IOException
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample4.fxml"));
        paneWypozyczenia.getChildren().setAll(pane);

    }
}*/

