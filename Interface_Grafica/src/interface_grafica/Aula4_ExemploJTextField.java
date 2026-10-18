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
		
		
		painelValidacao.setBorder(BorderFactory.createTitledBorder("Validação de número"));
		
		JLabel rotuloNumero = new JLabel("Digite um número:");
		
		JTextField campoNumero = new JTextField(8);
		
		JButton botaoVerificar = new JButton("Verificar");
		
		botaoVerificar.addActionListener(e -> {
			
			try {
				int numero = Integer.parseInt(campoNumero.getText());
				
				JOptionPane.showMessageDialog(
						janela,
						"Você digitou o número ! " + numero, 
						"Número válido",
						JOptionPane.INFORMATION_MESSAGE
						
				);
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(
						janela,
						"Digite apenas números!",
						"Erro",
						JOptionPane.ERROR_MESSAGE
						);
				}			
		});
		
		
		
		
		
		painelValidacao.add(rotuloNumero);
		
		painelValidacao.add(campoNumero);
		
		painelValidacao.add(botaoVerificar);
		
		
		
		
		JPanel painelPesquisa = new JPanel(new BorderLayout());
		
		painelPesquisa.setBorder(BorderFactory.createTitledBorder("Pesquisa simulada"));
		
		JPanel painelTopo = new JPanel(new FlowLayout());
		
		JLabel rotuloPesquisa = new JLabel("Pesquisar");
		
		

		janela.add(painelLogin);
		
		janela.add(painelValidacao);
		
		janela.add(painelPesquisa);
		
		
		janela.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
	}

}
