package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import sample.Estructuras.Factura;

import java.io.IOException;


public class ControllerFabrica {

    @FXML
    TableView tabla;
    @FXML Button btnFabricar;
    @FXML Text ultimoPedido;

    TableColumn colCosto = new TableColumn("Costo");
    TableColumn colCantidad = new TableColumn("Cantidad de tableros");
    TableColumn colEmpleado = new TableColumn("Empleado");

    String styleFuera = "-fx-border-color: WHITE; -fx-background-color: BLACK; -fx-text-fill: WHITE;";
    String styleDentro = "-fx-border-color: BLACK; -fx-background-color: WHITE; -fx-text-fill: BLACK";

    public static ObservableList<Factura> list = FXCollections.observableArrayList();

    @FXML
    public void initialize(){

        colCosto.setCellValueFactory(new PropertyValueFactory<Factura,String>("costo"));
        colCantidad.setCellValueFactory(new PropertyValueFactory<Factura,String>("cantidad"));
        colEmpleado.setCellValueFactory(new PropertyValueFactory<Factura,String>("empleado"));

        tabla.getColumns().addAll(colEmpleado,colCantidad,colCosto);

        tabla.setItems(list);

        //ultimoPedido.setText(list.get(list.size()-1).getCantidad() + " Ajedrez(es) con un costo $" + list.get(list.size()-1).getCosto() + ".00");

    }

    public void entrar(){

        btnFabricar.setStyle(styleDentro);

    }
    public void salir(){

        btnFabricar.setStyle(styleFuera);

    }
    public void fabricar(){

        if(list.size() > 1) {

           fabricarUltimo();

        }
        else if (list.size() == 1){

            fabricarUltimo();

            volver();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Chesstore");
            alert.setContentText("Se terminaron los pedidos");
            alert.show();

        }
    }

    public void volver(){

        try {
            Parent root = FXMLLoader.load(getClass().getResource("PantallaDespacho.fxml"));
            Main.stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void fabricarUltimo(){

        Factura factura = ControllerDespacho.cola.poll();
        list.remove(0);

        ultimoPedido.setText(factura.getCantidad()+ " Ajedrez(es) con un costo $" + factura.getCosto() + ".00");

    }

}
