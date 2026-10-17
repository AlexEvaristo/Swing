package interface_grafica;

import javax.swing.*;

import javax.swing.border.EmptyBorder;

import java.awt.*;

import java.net.URL;

public class Aula3_ExemploJButton {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ignore) {

		}
		
		JFrame janela = new JFrame("Exemplo JButton Melhorado");
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(new  BorderLayout(10, 10));
		
		JPanel painelCentro = new JPanel(new GridLayout(4, 1, 10, 10));
		
		painelCentro.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JButton botao1 = new JButton("Clique em Mim");
		
		botao1.setToolTipText("Exemplo de botão básico");
		
		botao1.addActionListener(e -> {
			
			JOptionPane.showMessageDialog(janela, "Você Clicou no botão Básico!");
		});
		
		JButton botao2 = new JButton("Botão Azul");
		
		painelCentro.add(botao1);
		
		janela.add(painelCentro, BorderLayout.CENTER);
		
		janela.pack();
		
		janela.setMinimumSize(new Dimension(420, 360));
		
		janela.setLocationRelativeTo(null);
		
		janela.setVisible(true);
		//========Final do botão 1=========
	}

}
