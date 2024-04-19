import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class PainelDoGame extends JPanel{

    //Configurações de tela
    final int originalTileSize = 16; //16x16 tamanho dos sprites
    final int scale = 3; //scaling (esticando os sprites em 3x)

    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16; //horizontal
    final int maxScreenRow = 12; //vertical
    final int screenWidth = tileSize * maxScreenCol; //768px H
    final int screenHeigth = tileSize * maxScreenRow; // 576px V

    //construtor
    public PainelDoGame(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeigth));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}