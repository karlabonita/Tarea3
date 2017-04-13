import java.awt.Graphics;
import javax.swing.JComponent;

public class Celdas extends JComponent implements Constantes  {
    
    public int x;
    public int y;
    
    public Celdas(int x, int y){
        this.x=x;
        this.y=y;
    
    }
    
    public void paintComponent(Graphics g) {
        g.drawRect(x,y,anchuraCelda,alturaCelda);
    }
    
}
