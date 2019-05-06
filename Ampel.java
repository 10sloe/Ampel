
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/*
 * Mit dieser Fernbedienung kann man eine echte Hue-Lampe steuern oder 
 * eine simulierte Hue-Lampe
 */
public class Ampel {

    // Attribute
    Lampe lampeRot; // Referenz zur roten Lampe    
    Lampe lampeGruen; // Referenz zur grünen Lampe

    // Konstruktor
    public Ampel()
    {
        lampeRot = new Lampe(); 
        lampeRot.setHue(0); // Setzt die Farbe der Lampe auf rot
        lampeGruen = new Lampe();
        lampeGruen.setHue(25500); // Setzt die Farbe der Lampe auf grün

    }
    // Methoden

    /*
     * Diese Methode wird aufgerufen, wenn der rot-Button gedrückt wurde
     */
    @FXML
    void rotGedrueckt(ActionEvent event) {
        lampeRot.setOn(true);
        lampeGruen.setOn(false);
    }

    /*
     * Diese Methode wird aufgerufen, wenn der rot-Button gedrückt wurde
     */
    @FXML
    void gruenGedrueckt(ActionEvent event) {

    }

    /*
     * Diese Methode wird aufgerufen, wenn der rot-Button gedrückt wurde
     */
    @FXML
    void weiterGedrueckt(ActionEvent event) {

    }

    /*
     * Diese Methode wird aufgerufen, wenn der aus-Button gedrückt wurde
     */
    @FXML
    void ausGedrueckt(ActionEvent event) {
        lampeRot.setOn(false);
        lampeGruen.setOn(false);
    }


    /*
     * Diese Methode wird aufgerufen, wenn die Oberfläche erstellt worden ist
     */
    @FXML
    void initialize() {
        lampeRot.init();  // Erstellt das Fenster mit der roten Lampe
        lampeGruen.init(); // Erstellt das Fenster mit der gruenen Lampe

    }
}
