package interface_grafica;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class Aula_1_ExemplosComponentesBasicos {

	public static void main(String[] args) {
		
	JFrame janela = new JFrame("Componentes Básicos = Swing");	

	
	janela.setSize(500, 400);
	
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	janela.setLayout(new GridLayout(0, 2, 10, 10));
	
	//CRIANDO O BOTÃO
	JButton btnLabel = new JButton("Exemplo JLabel");
	
	JButton btnButton = new JButton("Exemplo JButton");
	
	JButton btnTextField = new JButton("Exemplo JTextField");
	
	JButton btnTextArea = new JButton("Exemplo JTextArea");
	
	JButton btnPassword = new JButton("Exemplo JPasswordField");
	
	JButton btnCheckBox = new JButton("Exemplo JCheckBox");
	
	JButton btnRadio = new JButton("Exemplo JRadioButton");
	
	JButton btnCombo = new JButton("Exemplo JComboBox");
	
	JButton btnList = new JButton("Exemplo JList");
	
	JButton btnTable = new JButton("Exemplo JTable");
	
	JButton btnTree = new JButton("Exemplo JTree");
	
	
	janela.add(btnLabel);
	
	janela.add(btnButton);
	
	janela.add(btnTextField);
	
	janela.add(btnTextArea);
	
	janela.add(btnPassword);
	
	janela.add(btnCheckBox);
	
	janela.add(btnRadio);
	
	janela.add(btnCombo);
	
	janela.add(btnList);
	
	janela.add(btnTable);
	
	janela.add(btnTree);
	
	btnLabel.addActionListener(e -> {
		
		JOptionPane.showMessageDialog(
				
				janela,
				
				new JLabel("Sou um JLabel (rótulo de texto)!")
			);
		
	});
	
	btnButton.addActionListener(e -> {
	
	JButton botao =  new JButton("Clique em mim!");
	
	JOptionPane.showMessageDialog(
			
			janela,
			botao,
			"Exemplo JButton",
			JOptionPane.PLAIN_MESSAGE
		);	
	});
	
	btnTextField.addActionListener(e -> {
		
		JTextField campo = new JTextField(15);
		
		JOptionPane.showMessageDialog(
				janela,
				campo,
				"Digite algo (JTextFiekd)",
				JOptionPane.PLAIN_MESSAGE
				);		
	});
	
	
	btnTextArea.addActionListener(e -> {
		
		JTextArea area = new JTextArea(5, 20);
		
		JScrollPane rolagem = new JScrollPane(area);
		
		JOptionPane.showMessageDialog(
				janela,
				rolagem,
				"Digite várias linhas (JTextArea)",
				JOptionPane.PLAIN_MESSAGE
				
	   );		
	});
	
	btnPassword.addActionListener(e -> {
		
		JPasswordField senha = new JPasswordField(10);
		
		JOptionPane.showMessageDialog(
				
				janela,
				senha,
				"Digite a senha (JPasswordField)",
				JOptionPane.PLAIN_MESSAGE
				);
	});
	
	btnCheckBox.addActionListener(e -> {
		
		JCheckBox check = new JCheckBox("Aceito os termos");
		
		JOptionPane.showMessageDialog(				
				janela,
				check,
				"Exemplo JCheckBox",
				JOptionPane.PLAIN_MESSAGE
				);
		});
	
	
	
	janela.setVisible(true);
	}

}
