package interface_grafica;

import javax.swing.*;

import java.awt.*;


public class Aula4_ExemploJTextField {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Exemplos JTexTField");
		
		janela.setSize(500, 400);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setLayout(new GridLayout(3, 1, 10, 10));
		
		JPanel painelLogin = new JPanel(new FlowLayout());
		
		painelLogin.setBorder(BorderFactory.createTitledBorder("Login Simples"));
		
		JLabel rotuloUsuario = new JLabel("Usuário:");
		
		JTextField campoUsuario = new JTextField(10);
		
		JButton botaoLogin = new JButton("Entrar");
		
		botaoLogin.addActionListener(e -> {
			JOptionPane.showMessageDialog(
					janela,
					"Bem Vindo, " + campoUsuario.getText()+ "!",
					"Login",
					JOptionPane.INFORMATION_MESSAGE
					
			);
			
		});
		
		painelLogin.add(rotuloUsuario);
		
		painelLogin.add(campoUsuario);
		
		painelLogin.add(botaoLogin);
		
		JPanel painelValidacao = new JPanel(new FlowLayout());
		
		//painelValidacao.add(rotuloNumero);
		
		//painelValidacao.add(campoNumero);
		
		//painelValidacao.add(botaoVerificar);
		
		janela.add(painelLogin);
		
		janela.add(painelValidacao);
		
		//janela.add(painelPesquisa);
		
		
		janela.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
	}

}
