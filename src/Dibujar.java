import java.awt.Canvas;
import java.awt.Graphics;


public class Dibujar extends Canvas {
    
    public CrearCeldas dibujar;
    
    
    public Dibujar(){
    
          dibujar = new CrearCeldas();
          this.setSize(dibujar.anchura,dibujar.altura);
          
    
    }
    
        @Override   
        public void paint(Graphics g) {
        dibujar.paintComponent(g);
      }
}
