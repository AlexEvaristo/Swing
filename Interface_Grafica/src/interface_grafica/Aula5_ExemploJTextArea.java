package interface_grafica;

import javax.swing.*;
import java.awt.*;


public class Aula5_ExemploJTextArea {

	public static void main(String[] args) {
		
		// 1. Cria a janela principal do programa com o título "Exemplos JTextArea" na barra superior
		JFrame janela = new JFrame("Exemplos JTextArea");

		// 2. Define a largura (400px) e a altura (400px) iniciais da janela
		janela.setSize(400, 400);

		// 3. Configura para encerrar a execução do programa Java quando o utilizador fechar a janela no "X"
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 4. Define o layout da janela como uma grelha de 3 linhas e 1 coluna, com 10px de espaçamento horizontal e vertical entre os elementos
		janela.setLayout(new GridLayout(3, 1, 10, 10));

		// 5. Cria um painel (contentor) que organiza os seus componentes usando o BorderLayout (Norte, Sul, Leste, Oeste e Centro)
		JPanel painelBlocosNotas = new JPanel(new BorderLayout());

		
		// 6. Adiciona uma borda decorativa ao painel com o título "Bloco de Notas" destacado na parte superior
		painelBlocosNotas.setBorder(BorderFactory.createTitledBorder("Bloco de Notas"));

		// 7. Cria a área de texto de múltiplas linhas configurada para exibir inicialmente 5 linhas e 30 colunas de largura
		JTextArea areaNotas = new JTextArea(5, 30);

		// 8. Envolve o JTextArea em um painel de rolagem, adicionando barras de rolagem (vertical/horizontal) automaticamente quando o texto ultrapassar o tamanho visível
		JScrollPane rolageNotas = new JScrollPane(areaNotas);
		
		
	}

}
