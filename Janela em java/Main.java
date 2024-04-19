import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        //region Configurações da janela
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setTitle("Teste");

        PainelDoGame painelDoGame = new PainelDoGame();
        janela.add(painelDoGame);
        
        janela.pack();

        janela.setLocationRelativeTo(janela);
        janela.setVisible(true);
        //endregion
    }
}
