package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class BMIController implements Initializable {

    public Button button;
    @FXML
    private Label label;
    @FXML
    private RadioButton pi;
    @FXML
    private RadioButton km;
    @FXML
    private TextField weight;
    @FXML
    private TextField height;

    @FXML
    private void handleButtonAction() {
        try{
            double bmi;
            String text = weight.getText();
            double w = Integer.parseInt(text);
            String textt = height.getText();
            double h = Integer.parseInt (textt);

            if (pi.isSelected ()){
                bmi = (w*703.0)/(h*h);
                label.setText (String.format ("%.2f", bmi));
            }
            else if (km.isSelected ()){
                bmi = (w/(h*h));
                label.setText (String.format ("%.2f", bmi));
            }

        }
        catch(NumberFormatException nf){
            weight.setText ("Enter a valid number");
            weight.selectAll ();
            weight.requestFocus ();
            height.setText ("Enter a valid number");
            height.selectAll ();
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        /* todo */
    }
}
