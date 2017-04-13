
import java.awt.Graphics;
import javax.swing.JComponent;

public class CrearCeldas extends JComponent implements Constantes {
    public int anchura,altura;//dimensiones del laberinto
    public Celdas[][] celdas;//las casillas n x m
    
    
    CrearCeldas(){
    
     celdas = new Celdas[anchuraMundo][alturaMundo];
        for(int i=0; i < anchuraMundo; i++)
        for ( int j=0 ; j < alturaMundo ; j++)
            celdas[i][j]=new Celdas(i+(i*anchuraCelda),j+(j*alturaCelda));
        
        
        
        //ancho y largo del laberinto
        this.anchura=anchuraMundo*anchuraCelda;
        this.altura=alturaMundo*alturaCelda;
        this.setSize(anchura,altura);
    
    }
    
     public void paintComponent(Graphics g) {
        for(int i=0; i < anchuraMundo ; i++)
        for ( int j=0 ; j < alturaMundo; j++)
        celdas[i][j].paintComponent(g);
      }
}
