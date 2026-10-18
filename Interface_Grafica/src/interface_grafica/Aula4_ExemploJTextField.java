package interface_grafica; // Declaração do pacote onde esta classe Java está organizada

import javax.swing.*; // Importa os componentes gráficos do Swing (JFrame, JPanel, JTextField, JButton, etc.)
import java.awt.*;   // Importa as classes de layout e design do AWT (GridLayout, FlowLayout, BorderLayout)

public class Aula4_ExemploJTextField {

	public static void main(String[] args) {

		// 1. Instancia a janela principal definindo o texto que aparecerá na barra de título
		JFrame janela = new JFrame("Exemplos JTexTField");

		// 2. Define a dimensão inicial da janela em píxeis (largura: 500px, altura: 400px)
		janela.setSize(500, 400);

		// 3. Configura a aplicação para encerrar o processo totalmente ao clicar no "X" da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 4. Aplica um layout de grade (3 linhas, 1 coluna) com espaçamento de 10px entre os painéis
		janela.setLayout(new GridLayout(3, 1, 10, 10));


		// ==================== SEÇÃO 1: PAINEL DE LOGIN SIMPLES ====================

		// 5. Cria o painel do login usando FlowLayout para alinhar os componentes lado a lado (da esquerda para a direita)
		JPanel painelLogin = new JPanel(new FlowLayout());

		// 6. Desenha uma borda ao redor do painel com a legenda "Login Simples" no topo
		painelLogin.setBorder(BorderFactory.createTitledBorder("Login Simples"));

		// 7. Cria o rótulo de texto para orientar o campo do usuário
		JLabel rotuloUsuario = new JLabel("Usuário:");

		// 8. Cria o campo de texto editável com capacidade visível aproximada de 10 colunas
		JTextField campoUsuario = new JTextField(10);

		// 9. Cria o botão de ação para disparar a verificação de login
		JButton botaoLogin = new JButton("Entrar");

		// 10. Ouve o clique do botão usando expressão Lambda (e -> ...) para executar o código do evento
		botaoLogin.addActionListener(e -> {
			// Captura o texto digitado no campoUsuario via .getText() e exibe na caixa de diálogo de informação
			JOptionPane.showMessageDialog(janela, "Bem Vindo, " + campoUsuario.getText() + "!", "Login",
					JOptionPane.INFORMATION_MESSAGE
			);
		});

		// 11. Adiciona os componentes (Rótulo, Campo de Texto e Botão) dentro do painel de login na ordem em que vão aparecer
		painelLogin.add(rotuloUsuario);
		painelLogin.add(campoUsuario);
		painelLogin.add(botaoLogin);


		// ==================== SEÇÃO 2: PAINEL DE VALIDAÇÃO NUMÉRICA ====================

		// 12. Cria o segundo painel para validação de dados
		JPanel painelValidacao = new JPanel(new FlowLayout());

		// 13. Adiciona a borda com o título de seção "Validação de número"
		painelValidacao.setBorder(BorderFactory.createTitledBorder("Validação de número"));

		// 14. Instancia o rótulo descritivo do campo numérico
		JLabel rotuloNumero = new JLabel("Digite um número:");

		// 15. Instancia o campo de entrada com largura visível de 8 colunas
		JTextField campoNumero = new JTextField(8);

		// 16. Instancia o botão para disparar a validação
		JButton botaoVerificar = new JButton("Verificar");

		// 17. Trata o evento do botão de verificação tratando possíveis erros de digitação do usuário
		botaoVerificar.addActionListener(e -> {
			try {
				// Tenta converter o texto inserido para um número inteiro (int)
				int numero = Integer.parseInt(campoNumero.getText());

				// Se a conversão for bem-sucedida, exibe a mensagem confirmando o número
				JOptionPane.showMessageDialog(janela, "Você digitou o número ! " + numero, "Número válido",
						JOptionPane.INFORMATION_MESSAGE
				);

			} catch (NumberFormatException ex) {
				// Se o usuário digitar letras ou símbolos, o Integer.parseInt lança uma exceção capturada aqui
				JOptionPane.showMessageDialog(janela, "Digite apenas números!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		});

		// 18. Adiciona os elementos no painel de validação
		painelValidacao.add(rotuloNumero);
		painelValidacao.add(campoNumero);
		painelValidacao.add(botaoVerificar);


		// ==================== SEÇÃO 3: PAINEL DE PESQUISA SIMULADA ====================

		// 19. Cria o painel de pesquisa usando BorderLayout para dividir a área interna em seções (Norte/Centro)
		JPanel painelPesquisa = new JPanel(new BorderLayout());

		// 20. Adiciona a borda com título "Pesquisa simulada"
		painelPesquisa.setBorder(BorderFactory.createTitledBorder("Pesquisa simulada"));

		// 21. Cria um subpainel superior para alinhar o campo de busca e o botão na mesma linha
		JPanel painelTopo = new JPanel(new FlowLayout());

		// 22. Componentes da barra de pesquisa
		JLabel rotuloPesquisa = new JLabel("Pesquisar");
		JTextField campoPesquisa = new JTextField(15);
		JButton botaoPesquisar = new JButton("Pesquisar");

		// 23. Cria uma área de texto de múltiplas linhas (5 linhas x 25 colunas) para exibir a lista de resultados
		JTextArea resultados = new JTextArea(5, 25);

		// 24. Bloqueia a edição direta na área de resultados para que o usuário não altere o texto manualmente
		resultados.setEditable(false);

		// 25. Envolve o JTextArea em um painel com rolagem automática caso o conteúdo ultrapasse a altura visível
		JScrollPane rolagemResultados = new JScrollPane(resultados);

		// 26. Ação do botão de pesquisa para atualizar o JTextArea dinamicamente
		botaoPesquisar.addActionListener(e -> {
			// Captura o termo de busca digitado pelo usuário
			String termo = campoPesquisa.getText();

			// Limpa e substitui o conteúdo inicial da caixa de resultados com o cabeçalho
			resultados.setText("Resultados para \"" + termo + "\":\n");

			// Adiciona (concatena) novas linhas de resultados no final do texto existente
			resultados.append(" - Exemplo 1\n");
			resultados.append(" - Exemplo 2\n");
			resultados.append(" - Exemplo 3\n");
		});

		// 27. Monta a barra superior (subpainel) adicionando rótulo, campo e botão
		painelTopo.add(rotuloPesquisa);
		painelTopo.add(campoPesquisa);
		painelTopo.add(botaoPesquisar);

		// 28. Adiciona a barra no topo (NORTH) e a área de texto rolável no centro (CENTER) do painelPesquisa
		painelPesquisa.add(painelTopo, BorderLayout.NORTH);
		painelPesquisa.add(rolagemResultados, BorderLayout.CENTER);


		// ==================== MONTAGEM E EXIBIÇÃO DA JANELA ====================

		// 29. Adiciona os 3 painéis principais dentro da grade (GridLayout) da janela
		janela.add(painelLogin);
		janela.add(painelValidacao);
		janela.add(painelPesquisa);

		// 30. Torna a janela e todos os seus componentes visíveis na tela
		janela.setVisible(true);

	}

}