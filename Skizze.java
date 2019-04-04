import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{
    // Attribute
    GraphicsContext gc;     // Referenz auf die Zeichenfläche
    Ampel ampel;            // Referenz auf eine Ampel
   
    // Konstruktor
    Skizze(GraphicsContext gc_)
    {
        gc = gc_;             // Wir erhalten eine Zeichenfläche und speichern sie in gc
        ampel = new Ampel();
        zeichnen();   // Es wird gezeichnet! 
    }

    // Wird aufgerufen, wenn auf den Button an geklickt wird
    void buttonGeklickt()
    {
        ampel.schalten();   // Die Lampe wird geschaltet
        zeichnen();         
    }
    
    // Es wird gezeichnet!
    // Diese Methode muss immer aufgerufen werden!
    void zeichnen()
    {
        // Zeichne die Lampe
        ampel.zeichnen(gc);
    }
    
}
