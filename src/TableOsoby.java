import java.io.IOException;
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
import javafx.scene.paint.Color;

public class TableOsoby implements Initializable {


    @FXML
    public AnchorPane paneOsoby;
    @FXML
    private TableView<ModelOsoby> tableOsoby;
    @FXML
    private TableColumn<ModelOsoby,String> imie;
    @FXML
    private TableColumn<ModelOsoby,String> nazwisko;
    @FXML
    private TableColumn<ModelOsoby,String> adres;
    @FXML
    private TableColumn<ModelOsoby, Integer> id_osoby;
    private ObservableList<ModelOsoby> data = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Connection con = ConnectionUtil.getConnection();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT  * FROM osoby");
            while(rs.next())
            {
                data.add(new ModelOsoby( rs.getString("imie"),rs.getString("nazwisko"),rs.getString("adres"),rs.getInt("id_osoby")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        id_osoby.setCellValueFactory(new PropertyValueFactory<>("id_osoby"));
        imie.setCellValueFactory(new PropertyValueFactory<>("imie"));
        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        adres.setCellValueFactory(new PropertyValueFactory<>("adres"));
        tableOsoby.setItems(data);
    }
    public void powrot () throws IOException
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        paneOsoby.getChildren().setAll(pane);



    }
}
