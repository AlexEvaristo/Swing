package interface_grafica;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

public class Aula2_ExemploJLabel {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Exemplo JLabel Melhorado");
		janela.setSize(500, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout(10, 10));
		
		JLabel rotulo1 = new JLabel("Sou um JLabel padrão");
		JLabel rotulo2 = new JLabel("Fonte maior e em negrito");
		rotulo2.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel rotulo3 = new JLabel("Texto em azul");
		rotulo3.setForeground(Color.BLUE);
		
		JLabel rotulo4 = new JLabel("Texto com fundo amarelo");
		rotulo4.setOpaque(true);
		rotulo4.setBackground(Color.YELLOW);
		
		JPanel painelImagem = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		try {
			// Lendo diretamente o arquivo do projeto sem passar por getResource/URL
			File arquivoImagem = new File("src/interface_grafica/java.png");
			Image img = ImageIO.read(arquivoImagem);
			
			if (img != null) {
				Image imgRedimensionada = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				ImageIcon iconeRedimensionado = new ImageIcon(imgRedimensionada);
				
				JLabel rotulo5 = new JLabel("Texto centralizado + Ícone", iconeRedimensionado, JLabel.CENTER);
				rotulo5.setHorizontalTextPosition(JLabel.CENTER);
				rotulo5.setVerticalTextPosition(JLabel.BOTTOM);
				painelImagem.add(rotulo5);
			} else {
				painelImagem.add(new JLabel("Erro: Imagem vazia ou inválida."));
			}
		} catch (Exception e) {
			System.err.println("Erro ao carregar a imagem: " + e.getMessage());
			painelImagem.add(new JLabel("Imagem não encontrada no caminho src/interface_grafica/java.png"));
		}
		
		// Criando o Painel de Texto
		JPanel painelTexto = new JPanel(new GridLayout(4, 1, 5, 5));
		painelTexto.add(rotulo1);
		painelTexto.add(rotulo2);
		painelTexto.add(rotulo3);
		painelTexto.add(rotulo4);
		
		janela.add(painelTexto, BorderLayout.CENTER);
		janela.add(painelImagem, BorderLayout.SOUTH);
		
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
}