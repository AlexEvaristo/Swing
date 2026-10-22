package interface_grafica;

import javax.swing.*;

import java.awt.*;

//INICIANDO COM O INTELIJ

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
		
		// 9. Adiciona o painel de rolagem (com a área de texto dentro) na região central do painelBlocosNotas, fazendo com que ele ocupe todo o espaço disponível
		painelBlocosNotas.add(rolageNotas, BorderLayout.CENTER);
		
		// Instancia um novo painel para o log organizando seus componentes com o layout BorderLayout (Norte, Sul, Leste, Oeste e Centro)
		JPanel painelLog = new JPanel(new BorderLayout());
		
		// 10. Adiciona uma borda ao redor do painel de log com o título "Área de Log" no topo
		painelLog.setBorder(BorderFactory.createTitledBorder("Área de Log"));

		// 11. Cria a área de texto para mensagens de log, configurada inicialmente para 5 linhas e 30 colunas
		JTextArea areaLog = new JTextArea(5, 30);
		
		JScrollPane rolagemLog = new JScrollPane(areaLog);
		painelLog.add(rolagemLog, BorderLayout.CENTER);

		// 12. Desativa a edição do campo para que o usuário não possa digitar manualmente no log
		areaLog.setEditable(false);

		// 13. Define a cor de fundo do JTextArea como preta
		areaLog.setBackground(Color.BLACK);

		// 14. Define a cor do texto do JTextArea como verde (estilo terminal/hacker)
		areaLog.setForeground(Color.GREEN);

		// 15. Define a fonte como "Monospaced" (largura fixa de caracteres), tamanho 12, garantindo o alinhamento de texto de log
		areaLog.setFont(new Font("Monospaced", Font.PLAIN, 12));

		// 16. Adiciona o painel do bloco de notas à grade principal da janela
		janela.add(painelBlocosNotas);

		// 17. Adiciona o painel de log à grade principal da janela
		janela.add(painelLog);

		// 18. [Linha comentada] Reservada para adicionar o painel do contador na janela quando for ativado
		//janela.add(painelContador);

		// 20. Torna a janela e todos os seus componentes adicionados visíveis na tela
		janela.setVisible(true);		
	}
}
