package interface_grafica; // Declaração do pacote do projeto

import javax.swing.*; // Importa componentes visuais do Swing (JFrame, JButton, JPanel, ImageIcon, etc.)
import javax.swing.border.EmptyBorder; // Importa classe para criar margens internas no painel
import java.awt.*; // Importa classes do AWT para cores, fontes, dimensões e layouts (BorderLayout, GridLayout)
import java.net.URL; // Importa a classe URL para localizar ficheiros de imagem nos recursos do projeto

public class Aula3_ExemploJButton {

	public static void main(String[] args) {
		// 1. Tenta aplicar o visual nativo do sistema operacional (Windows/Linux/Mac) à janela do Swing
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ignore) {
			// Se falhar em carregar o visual do sistema, mantém o estilo padrão (Metal)
		}
		
		// 2. Instancia a janela principal definindo o título da barra superior
		JFrame janela = new JFrame("Exemplo JButton Melhorado");
		
		// 3. Define que o programa deve encerrar completamente ao fechar a janela no "X"
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 4. Define o layout da janela principal como BorderLayout com 10px de espaçamento horizontal e vertical
		janela.setLayout(new BorderLayout(10, 10));
		
		// 5. Cria o painel central organizado em grade com 4 linhas e 1 coluna (espaçamento de 10px entre as linhas)
		JPanel painelCentro = new JPanel(new GridLayout(4, 1, 10, 10));
		
		// 6. Define uma margem interna de 10px nas 4 bordas do painel (espaço entre a borda e os botões)
		painelCentro.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		
		// ==================== BOTÃO 01: BÁSICO ====================
		
		// 7. Instancia um botão simples apenas com texto
		JButton botao1 = new JButton("Clique em Mim");
		
		// 8. Define o texto de ajuda (dica/tooltip) que aparece ao passar o rato por cima do botão
		botao1.setToolTipText("Exemplo de botão básico");
		
		// 9. Associa uma ação ao clique do botão usando expressão Lambda
		botao1.addActionListener(e -> {
			JOptionPane.showMessageDialog(janela, "Você Clicou no botão Básico!");
		});
		
		
		// ==================== BOTÃO 02: ESTILIZADO / AZUL ====================
		
		// 10. Instancia o segundo botão
		JButton botao2 = new JButton("Botão Azul");
		
		// 11. Redefine o Look and Feel do botão para o estilo básico, permitindo personalizar cores de fundo manualmente
	    botao2.setUI(new javax.swing.plaf.basic.BasicButtonUI());
	    
	    // 12. Garante que a área de conteúdo do botão seja preenchida com a cor de fundo escolhida
	    botao2.setContentAreaFilled(true);
	    
	    // 13. Torna o componente opaco para que a cor de fundo seja desenhada corretamente
	    botao2.setOpaque(true);
	    
	    // 14. Define a cor de fundo usando valores RGB (Azul)
	    botao2.setBackground(new Color(0, 85, 204));
	    
	    // 15. Define a cor do texto para branco
	    botao2.setForeground(Color.white);
	    
	    // 16. Desenha uma borda fina em redor do botão com uma tonalidade azul mais escura
	    botao2.setBorder(BorderFactory.createLineBorder(new Color(0, 70, 170)));
	    
	    // 17. Desativa a linha pontilhada de foco em redor do texto quando o botão é clicado
	    botao2.setFocusPainted(false);
	    
	    // 18. Altera a fonte do texto para Arial, Negrito, tamanho 14
	    botao2.setFont(new Font("Arial", Font.BOLD, 14));
	    
	    // 19. Define o evento de clique do segundo botão
	    botao2.addActionListener(e ->
	    	JOptionPane.showMessageDialog(
	    			janela,
	    			"Botão Azul Pressionado!"
	    		)	    	
	    );
	    
	    
	    // ==================== BOTÃO 03: FONTE GRANDE ====================
	    
	    // 20. Instancia o terceiro botão
	    JButton botao3 = new JButton("Fonte Grande");
	    
	    // 21. Personaliza a fonte para destacar a legibilidade (Arial, Negrito, tamanho 18)
	    botao3.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    // 22. Define a mensagem exibida no clique
	    botao3.addActionListener(e ->
	    	JOptionPane.showMessageDialog(
	    			janela,
	    			"Você clicou no botão com fonte grande!"
	    			)
	    );
	    
	    
	    // ==================== BOTÃO 04: COM ÍCONE E TEXTO ====================
	    
	    // 23. Procura o caminho do ficheiro de imagem localizado na pasta/pacote dos recursos do projeto
	    URL urlIcone = Aula3_ExemploJButton.class.getResource("/interface_grafica/java.png");
	    
	    ImageIcon iconeAjustado = null;
	    
	    // 24. Verifica se a imagem foi encontrada no caminho indicado
	    if(urlIcone != null) {
	    	// Carrega a imagem original
	    	ImageIcon iconeOriginal = new ImageIcon(urlIcone);
	    	Image img = iconeOriginal.getImage();
	    	
	    	// Dimenções desejadas para o ícone
	    	int largura = 48;
	    	int alturaIcone = 48;
	    	
	    	// Redimensiona a imagem com um algoritmo de suavização (SCALE_SMOOTH) para não perder qualidade
	    	Image imgEscalada = img.getScaledInstance(largura, alturaIcone, Image.SCALE_SMOOTH);
	    	
	    	// Cria o novo ImageIcon pronto com a dimensão ajustada
	    	iconeAjustado = new ImageIcon(imgEscalada);	    	
	    }
	    
	    // 25. Cria o botão com ícone usando operador ternário (se a imagem existir, passa o ícone; caso contrário, só o texto)
	    JButton botao4 = (iconeAjustado != null)
	    		? new JButton("Com ícone", iconeAjustado)
	    		: new JButton("Com Ícone");
	    
	    // 26. Alinha o texto centralizado horizontalmente em relação ao ícone
	    botao4.setHorizontalTextPosition(SwingConstants.CENTER);
	    
	    // 27. Posiciona o texto abaixo do ícone (VERTICAL_BOTTOM)
	    botao4.setVerticalTextPosition(SwingConstants.BOTTOM);
	    
	    // 28. Define o espaçamento em píxeis (8px) entre a imagem e o texto
	    botao4.setIconTextGap(8);
		
	    // 29. Define as margens internas do botão (topo, esquerda, baixo, direita)
	    botao4.setMargin(new Insets(10, 12, 10, 12));
	}
}