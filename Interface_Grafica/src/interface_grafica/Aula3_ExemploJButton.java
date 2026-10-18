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
		
		
		
		//BOTÃO 01
		JButton botao1 = new JButton("Clique em Mim");
		
		botao1.setToolTipText("Exemplo de botão básico");
		
		botao1.addActionListener(e -> {
			
			JOptionPane.showMessageDialog(janela, "Você Clicou no botão Básico!");
		});
		
		
		
		//BOTAO 02
		JButton botao2 = new JButton("Botão Azul");
		
	    botao2.setUI(new javax.swing.plaf.basic.BasicButtonUI());
	    
	    botao2.setContentAreaFilled(true);
	    
	    botao2.setOpaque(true);
	    
	    botao2.setBackground(new Color(0, 85, 204));
	    
	    botao2.setForeground(Color.white);//Definindo a cor de fora 
	    
	    botao2.setBorder(BorderFactory.createLineBorder(new Color(0, 70, 170)));
	    
	    botao2.setFocusPainted(false);
	    
	    botao2.setFont(new Font("Arial", Font.BOLD, 14));
	    
	    botao2.addActionListener(e ->
	    	JOptionPane.showMessageDialog(
	    			janela,
	    			"Botão Azul Pressionado!"
	    			
	    		)	    	
	    );
	    
	    //BOTÃO 03	    
	    JButton botao3 = new JButton("Fonte Grande");
	    
	    botao3.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    botao3.addActionListener(e ->
	    	JOptionPane.showMessageDialog(
	    			janela,
	    			"Você clicou no botão com fonte grande!"
	    			)
	    );
	    
	    //BOTÃO 04	    
	    URL urlIcone = Aula3_ExemploJButton.class.getResource("/interface_grafica/java.png");
	    
	    ImageIcon iconeAjustado =  null;
	    
	    if(urlIcone != null) {
	    	
	    	ImageIcon iconeOriginal = new ImageIcon(urlIcone);
	    	
	    	Image img = iconeOriginal.getImage();
	    	
	    	int largura     = 48;
	    	int alturaIcone = 48;
	    	
	    	Image imgEscalada =  img.getScaledInstance(largura, alturaIcone, Image.SCALE_SMOOTH);
	    	
	    	iconeAjustado =  new ImageIcon(imgEscalada);	    	
	    	
	    }
	    
	    JButton botao4 = (iconeAjustado != null)
	    		? new JButton("Com ícone", iconeAjustado)
	    		: new JButton("Com Ícone");
	    
	    botao4.setHorizontalTextPosition(SwingConstants.CENTER);
	    botao4.setVerticalTextPosition(SwingConstants.BOTTOM);
	    
	    botao4.setIconTextGap(8);
		
	    botao4.setMargin(new Insets(10, 12, 10, 12));
	    
	    botao4.setFont(new Font("Arial", Font.PLAIN, 14));
	    
	    botao4.setPreferredSize(new Dimension(160, 120));
	    
	    botao4.addActionListener(e ->
	    	JOptionPane.showMessageDialog(
	    			
	    			janela,
	    			"Botão com ícone pressionado!"
	    			)	    	
	    );
	    
		painelCentro.add(botao1);
		painelCentro.add(botao2);
		painelCentro.add(botao3);
		painelCentro.add(botao4);
		
		
		janela.add(painelCentro, BorderLayout.CENTER);
		
		janela.pack();
		
		janela.setMinimumSize(new Dimension(420, 360));
		
		janela.setLocationRelativeTo(null);
		
		janela.setVisible(true);
		
	}

}
