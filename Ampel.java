import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Ampel
{
    // Attribute
    Lampe rot;
    Lampe gruen;
    //TODO
    
    // Konstruktor
    Ampel()
    {
       rot = new Lampe(50, 30, 50, Color.RED);
       gruen = new Lampe(50, 100, 50, Color.GREEN);
    }

    // Methoden
    void schalten()
    {
        rot.schalten();
        gruen.schalten();
    }
    
    void zeichnen(GraphicsContext gc)
    {
        gc.setFill(Color.BLACK);
        gc.fillRect(40,20,70,140);
        rot.zeichnen(gc);
        gruen.zeichnen(gc);
    }
}
