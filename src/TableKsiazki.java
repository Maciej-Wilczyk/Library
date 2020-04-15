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
public class TableKsiazki implements Initializable {
    @FXML
    public AnchorPane paneKsiazki;
    @FXML
    private TableView<ModelKsiazki> tableKsiazki;
    @FXML
    private TableColumn<ModelKsiazki,String> tytul;
    @FXML
    private TableColumn<ModelKsiazki,String> autor;
    @FXML
    private TableColumn<ModelKsiazki, Integer> id_ksiazki;
    private ObservableList<ModelKsiazki> data = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Connection con = ConnectionUtil.getConnection();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT  * FROM ksiazki");
            while(rs.next())
            {
                data.add(new ModelKsiazki( rs.getString("tytul"),rs.getString("autor"),rs.getInt("id_ksiazki")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        id_ksiazki.setCellValueFactory(new PropertyValueFactory<>("id_ksiazki"));
        tytul.setCellValueFactory(new PropertyValueFactory<>("tytul"));
        autor.setCellValueFactory(new PropertyValueFactory<>("autor"));

        tableKsiazki.setItems(data);

    }
    public void powrot () throws IOException
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        paneKsiazki.getChildren().setAll(pane);

    }
    }

