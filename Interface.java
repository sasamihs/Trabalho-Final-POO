import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MinhaJanela {
    public static void main(String[] args) {
        // 1. Cria a janela principal
        JFrame janela = new JFrame("Meu Primeiro Programa");
        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null); // Centraliza na tela

        // 2. Cria o painel e os componentes
        JPanel painel = new JPanel();
        JLabel texto = new JLabel("Clique no botão para testar:");
        JButton botao = new JButton("Clique aqui");

        // 3. Adiciona ação ao botão
        botao.addActionListener(e -> {
            JOptionPane.showMessageDialog(janela, "Interface funcionando!");
        });

        // 4. Monta a estrutura e exibe
        painel.add(texto);
        painel.add(botao);
        janela.add(painel);
        janela.setVisible(true);
    }
}
