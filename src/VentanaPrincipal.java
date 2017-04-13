import java.awt.BorderLayout;
import javax.swing.JFrame;


public class VentanaPrincipal extends JFrame {
        
        public Dibujar dibujarPapel;
        
        public VentanaPrincipal() {
            dibujarPapel=new Dibujar();
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(dibujarPapel);
            this.setSize(dibujarPapel.getWidth(),dibujarPapel.getHeight());
}
        
}
