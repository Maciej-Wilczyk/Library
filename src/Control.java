import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.io.IOException;
public class Control   {


    public Label label;
@FXML
private AnchorPane rootPane;
private AnchorPane pane2;
ConnectionUtil a = new ConnectionUtil();

public Canvas canvas;
    GraphicsContext gc;
    Button b ;


    @FXML
    public void mou()  throws IOException
    {

        gc = canvas.getGraphicsContext2D();
        System.out.println("ushbfdgiyasgbduas");
        b = new Button("kska");
        b.setLayoutX(200);
        b.setLayoutY(200);

        b.setVisible(true);
        canvas.setOnMousePressed(event -> {
            System.out.println("Mouse click");
            b = new Button("kska");
            b.setLayoutX(50);
            b.setLayoutY(50);

            b.setVisible(true);
            gc.beginPath();
            gc.lineTo(event.getSceneX(), event.getSceneY());
            gc.stroke();

        });
       // rootPane.getChildren().addAll(b);
        canvas.setOnMouseDragged(event -> {
            System.out.println("Mouse dragged");
            gc.lineTo(event.getSceneX(), event.getSceneY());
            gc.stroke();
        });
    }
    @FXML
    public void con()  throws IOException
    {
        a.getConnection();
        colorcon();
        st.st = true;
        System.out.println(st.st);

    }


    @FXML
    public void zmiana() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        rootPane.getChildren().setAll(pane);

    }
    @FXML
    public void powrot () throws IOException
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pane2.getChildren().setAll(pane);

    }
    @FXML
    public void goKsiazki() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void goOsoby() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample4.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println(st.st);
    }
    public void goDodajOsobe() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sampleDodajOsobe.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println(st.st);
    }
    public void goDodajKsiazke() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sampleDodajKsiazke.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println(st.st);
    }


    public void colorcon()
    {
        label.setText("CONNECT");
        label.setTextFill(Color.web("#00ff00"));

    }
    public void ifcolorcon()
    {
        if(st.st == true)
            colorcon();
    }

    public void initialize()
    {
        if(st.st == true)
            colorcon();
    }
}


