// ==============================================================================
// Declaração do pacote
// ==============================================================================
// Em Java, as classes podem ser agrupadas em pacotes (packages), que funcionam
// 			como "pastas lógicas" para organizar melhor o código. 
package interface_grafica;


// ==============================================================================
// Importações das bibliotecas necessárias
// ==============================================================================

// Importa todas as classes do pacote javax.swing, que contém os principais
// 			componentes gráficos da biblioteca Swing, como JButton, 
//			JFrame, JLabel, etc.
// A biblioteca Swing é usada para criar interfaces gráficas em Java de forma
// 			independente de plataforma, rodando sobre a AWT (Abstract Window Toolkit).
import javax.swing.*;


// Importa a classe DefaultTableModel do pacote javax.swing.table.
// O DefaultTableModel é uma implementação padrão de TableModel que facilita
// a manipulação de dados em tabelas (JTable), permitindo criar, adicionar e
// remover linhas e colunas sem precisar implementar manualmente toda a lógica
// de gerenciamento de dados da tabela.
import javax.swing.table.DefaultTableModel;


// Importa a classe DefaultMutableTreeNode do pacote javax.swing.tree.
// Essa classe é utilizada para criar nós de árvore que podem ser alterados
// dinamicamente, servindo como base de dados para um componente JTree.
// Cada nó pode conter "filhos" e "pai", formando uma estrutura hierárquica.
import javax.swing.tree.DefaultMutableTreeNode;


// Importa todas as classes do pacote java.awt (Abstract Window Toolkit).
// AWT fornece classes fundamentais para interfaces gráficas, como Layouts
// (responsáveis por organizar os componentes na janela).
// No nosso caso, utilizaremos o GridLayout para organizar os botões em forma de grade.
import java.awt.*;



// ==============================================================================
// Definição da classe principal
// ==============================================================================

// Aqui declaramos a classe pública que será responsável por 
//			demonstrar os componentes básicos da biblioteca Swing. 
// O nome da classe é "Aula_1_ExemplosComponentesBasicos", indicando 
//			que é o primeiro exemplo de aula voltado para introduzir o 
//			uso de componentes gráficos.
// Essa classe contém o método main, que é o ponto de entrada de qualquer
// 			aplicação Java executável.
public class Aula_1_ExemplosComponentesBasicos {



    // ==========================================================================
    // Método main
    // ==========================================================================
    // O método "main" é o ponto de entrada da aplicação Java.
    // Quando rodamos a classe, a JVM (Java Virtual Machine) 
	//			inicia a partir deste método.
	// Ele deve ser declarado como "public static void main".
    // - public: pode ser chamado de qualquer lugar.
    // - static: não depende de instância da classe para ser executado.
    // - void: não retorna nenhum valor.
    // - String[] args: permite receber argumentos passados pela linha de comando.
    public static void main(String[] args) {



        // ======================================================================
        // Criação da janela principal (JFrame)
        // ======================================================================

        // O JFrame é a "janela" principal de uma aplicação Swing.
        // Ele funciona como o contêiner de nível superior, que pode conter
        // 			outros componentes gráficos (botões, rótulos, listas, etc).
        // Aqui criamos um novo JFrame com o título "Componentes Básicos - Swing",
        // 			que aparecerá na barra de título da janela do sistema operacional.
        JFrame janela = new JFrame("Componentes Básicos - Swing");

        // Define o tamanho inicial da janela.
        // O método setSize recebe dois valores em pixels:
        // - largura (500 pixels)
        // - altura (400 pixels)
        // Isso determina as dimensões iniciais da janela na tela do usuário.
        janela.setSize(500, 400);

        // Define a operação padrão quando o usuário clicar no botão de fechar (X).
        // Ao usar JFrame.EXIT_ON_CLOSE, estamos dizendo que a aplicação inteira
        // 			deve ser encerrada quando a janela for fechada.
        // Caso contrário, a janela poderia ser apenas escondida e o programa
        // 			continuaria rodando em segundo plano.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o gerenciador de layout da janela.
        // Aqui estamos usando um GridLayout, que organiza os componentes
        // 			em formato de grade (linhas e colunas).
        // Parâmetros:
        // - 0: número de linhas (0 significa que o layout calculará automaticamente
        //      	quantas linhas são necessárias, dependendo do 
        // 			número de componentes).
        // - 2: número de colunas fixas (neste caso, 2 colunas).
        // - 10: espaçamento horizontal entre os componentes (em pixels).
        // - 10: espaçamento vertical entre os componentes (em pixels).
        // Esse layout garante que os botões ficarão organizados 
        // 			de forma alinhada, ocupando todo o espaço disponível.
        janela.setLayout(new GridLayout(0, 2, 10, 10));

        // ======================================================================
        // Criação dos botões principais
        // ======================================================================
        // Abaixo vamos criar vários objetos JButton, cada um com um texto
        // 			descritivo. 
        // Esses botões serão colocados na janela principal (JFrame) e, 
        // 			quando clicados, irão abrir um diálogo (JOptionPane) 
        // 			mostrando um exemplo prático de um componente 
        // 			gráfico Swing específico.
        // Dessa forma, cada botão serve como um "atalho" para demonstrar
        // 			diferentes widgets da biblioteca Swing.
        

        // Cria um botão com o texto "Exemplo JLabel".
        // Quando clicado, esse botão abrirá um diálogo mostrando um JLabel,
        // 			que é um componente utilizado para exibir textos 
        // 			fixos na interface.
        JButton btnLabel = new JButton("Exemplo JLabel");

        // Cria um botão com o texto "Exemplo JButton".
        // Esse botão, quando acionado, abrirá um exemplo de outro botão
        // 			dentro de uma caixa de diálogo. 
        // É útil para demonstrar que botões podem ser usados tanto 
        // 			diretamente em janelas quanto embutidos
        // 			em outros contêineres.
        JButton btnButton = new JButton("Exemplo JButton");

        // Cria um botão com o texto "Exemplo JTextField".
        // O JTextField é um campo de entrada de texto de linha única,
        // 			utilizado para digitar informações como 
        // 			nomes, números, etc.
        // Ao clicar nesse botão, será exibido um JTextField dentro de um
        // 			JOptionPane para o usuário interagir.
        JButton btnTextField = new JButton("Exemplo JTextField");

        // Cria um botão com o texto "Exemplo JTextArea".
        // O JTextArea é semelhante ao JTextField, mas permite a entrada
        // 			de múltiplas linhas de texto, sendo adequado 
        // 			para observações, descrições ou mensagens mais longas.
        JButton btnTextArea = new JButton("Exemplo JTextArea");

        // Cria um botão com o texto "Exemplo JPasswordField".
        // O JPasswordField é um campo de entrada semelhante ao 
        // 			JTextField, mas que oculta os caracteres 
        // 			digitados (normalmente mostrando asteriscos ou pontos). 
        // É utilizado principalmente para entrada de senhas ou 
        // 			informações sensíveis.
        JButton btnPassword = new JButton("Exemplo JPasswordField");

        // Cria um botão com o texto "Exemplo JCheckBox".
        // O JCheckBox é um componente de seleção que permite marcar ou
        // 			desmarcar uma opção de forma independente. 
        // É útil em formulários onde o usuário pode escolher múltiplas opções.
        JButton btnCheckBox = new JButton("Exemplo JCheckBox");

        // Cria um botão com o texto "Exemplo JRadioButton".
        // O JRadioButton é um botão de seleção usado em conjunto com
        // ButtonGroup para garantir que apenas uma opção de um grupo
        // 			possa ser selecionada. 
        // Esse botão demonstrará como criar múltiplos radio 
        // 			buttons funcionando em grupo.
        JButton btnRadio = new JButton("Exemplo JRadioButton");

        // Cria um botão com o texto "Exemplo JComboBox".
        // O JComboBox é um componente de lista suspensa (drop-down list)
        // 			que permite ao usuário escolher uma única 
        // 			opção dentre várias listadas. 
        // Muito usado em formulários quando há valores predefinidos.
        JButton btnCombo = new JButton("Exemplo JComboBox");

        // Cria um botão com o texto "Exemplo JList".
        // O JList exibe uma lista de itens (texto, ícones, etc.) de 
        // 			onde o usuário pode selecionar um ou mais elementos.
        // Ao clicar nesse botão, será mostrado um JList 
        // 			dentro de um JScrollPane para permitir 
        // 			rolagem caso haja muitos itens.
        JButton btnList = new JButton("Exemplo JList");

        // Cria um botão com o texto "Exemplo JTable".
        // O JTable é um componente poderoso que exibe dados em formato
        // 			tabular (linhas e colunas). 
        // Usaremos o DefaultTableModel para popular a tabela 
        // 			com alguns dados de exemplo.
        JButton btnTable = new JButton("Exemplo JTable");

        // Cria um botão com o texto "Exemplo JTree".
        // O JTree exibe informações em formato hierárquico (pai e filhos),
        // 			semelhante à visualização de pastas no Windows Explorer.
        // Esse botão demonstrará como montar uma árvore com pastas e subpastas.
        JButton btnTree = new JButton("Exemplo JTree");

        // ======================================================================
        // Adicionando os botões criados à janela principal
        // ======================================================================
        // Aqui posicionamos todos os botões dentro do JFrame.
        // O GridLayout (2 colunas, várias linhas) garante que fiquem bem
        // 			organizados, sem precisar calcular posições manualmente.
        // ======================================================================

        // Adiciona o botão que exibirá o exemplo de JLabel.
        janela.add(btnLabel);

        // Adiciona o botão que exibirá o exemplo de JButton.
        janela.add(btnButton);

        // Adiciona o botão que exibirá o exemplo de JTextField.
        janela.add(btnTextField);

        // Adiciona o botão que exibirá o exemplo de JTextArea.
        janela.add(btnTextArea);

        // Adiciona o botão que exibirá o exemplo de JPasswordField.
        janela.add(btnPassword);

        // Adiciona o botão que exibirá o exemplo de JCheckBox.
        janela.add(btnCheckBox);

        // Adiciona o botão que exibirá o exemplo de JRadioButton.
        janela.add(btnRadio);

        // Adiciona o botão que exibirá o exemplo de JComboBox.
        janela.add(btnCombo);

        // Adiciona o botão que exibirá o exemplo de JList.
        janela.add(btnList);

        // Adiciona o botão que exibirá o exemplo de JTable.
        janela.add(btnTable);

        // Adiciona o botão que exibirá o exemplo de JTree.
        janela.add(btnTree);


        // ======================================================================
        // Definição das ações de cada botão
        // ======================================================================
        // Agora configuramos o que acontece quando cada botão for clicado.
        // Usamos addActionListener com expressão lambda (e -> {...}),
        // 			que deixa o código mais limpo em comparação ao 
        // 			ActionListener clássico.
        // ======================================================================

        // ======================================================================
        // Configuração da ação do botão "Exemplo JLabel"
        // ======================================================================
        // Quando o usuário clicar no botão "Exemplo JLabel",
        // 			será aberta uma janela de diálogo (JOptionPane) 
        // 			exibindo um JLabel.
        // O JLabel é um componente usado para exibir texto fixo,
        // 			sem interação do usuário.
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnLabel".
        // O ActionListener é o responsável por reagir a eventos de clique.
        // Aqui usamos expressão lambda (e -> {...}) em vez da 
        // 			sintaxe tradicional, deixando o código mais 
        // 			conciso e moderno.
        btnLabel.addActionListener(e -> {

            // Exibe um JOptionPane com mensagem personalizada.
            // O JOptionPane é uma caixa de diálogo pronta do Swing,
            // 			usada para mostrar mensagens rápidas ao usuário.
            JOptionPane.showMessageDialog(

                // Primeiro parâmetro: janela principal (JFrame).
                // Isso faz o diálogo ser exibido centralizado em relação à janela.
                janela,

                // Segundo parâmetro: o conteúdo exibido dentro do diálogo.
                // Aqui criamos um novo JLabel com o texto
                // 			"Sou um JLabel (rótulo de texto)!".
                // Isso demonstra que, além de strings simples, podemos
                // 			colocar qualquer componente Swing dentro de um JOptionPane.
                new JLabel("Sou um JLabel (rótulo de texto)!")
                
            );
        });



        // ======================================================================
        // Configuração da ação do botão "Exemplo JButton"
        // ======================================================================
        // Quando o usuário clicar no botão "Exemplo JButton",
        // 			será criada uma nova instância de JButton 
        // 			dinamicamente e ela será exibida dentro de um JOptionPane.
        // Isso mostra que é possível inserir botões (e qualquer 
        // 			outro componente) em caixas de diálogo de forma simples.
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnButton".
        // Novamente usamos expressão lambda para simplificar a sintaxe.
        btnButton.addActionListener(e -> {

            // Cria um novo JButton dinamicamente com o texto "Clique em mim!".
            // Esse botão não está na janela principal, ele será usado apenas
            // 			como conteúdo da caixa de diálogo.
            JButton botao = new JButton("Clique em mim!");

            // Exibe um JOptionPane contendo o botão recém-criado.
            // Parâmetros:
            // - janela: janela principal que servirá de referência 
            // 			para centralizar o diálogo.
            // - botao: o conteúdo do diálogo (pode ser qualquer componente Swing).
            // - "Exemplo JButton": título da caixa de diálogo.
            // - JOptionPane.PLAIN_MESSAGE: define o estilo da mensagem
            //   		(sem ícones de informação, erro, aviso, etc.).
            JOptionPane.showMessageDialog(
                janela,
                botao,
                "Exemplo JButton",
                JOptionPane.PLAIN_MESSAGE
            );
        });


        // ======================================================================
        // Configuração da ação do botão "Exemplo JTextField"
        // ======================================================================
        // O JTextField é um campo de entrada de texto de linha única.
        // Muito usado em formulários (ex.: nome, e-mail, CPF etc.).
        // Aqui mostramos um exemplo básico em que o usuário 
        // 			pode digitar texto dentro de um JOptionPane.
        // ======================================================================

        // Associa um ActionListener ao botão "btnTextField".
        // Sempre que o usuário clicar nesse botão, o código 
        // 			dentro da lambda será executado.
        btnTextField.addActionListener(e -> {

            // Cria um novo campo de texto (JTextField) com 15 colunas de largura.
            // O número 15 não limita a quantidade de caracteres digitados,
            // 			apenas sugere um tamanho preferencial de exibição.
            JTextField campo = new JTextField(15);

            // Exibe um JOptionPane contendo o JTextField.
            // Isso permite que o usuário digite diretamente dentro da caixa de diálogo.
            // Parâmetros:
            // - janela: a janela pai, usada como referência para centralizar o diálogo.
            // - campo: o componente JTextField a ser exibido.
            // - "Digite algo (JTextField)": título da janela do diálogo.
            // - JOptionPane.PLAIN_MESSAGE: define que o diálogo 
            // 			será simples, sem ícones.
            JOptionPane.showMessageDialog(
                janela,
                campo,
                "Digite algo (JTextField)",
                JOptionPane.PLAIN_MESSAGE
            );
        });



        // ======================================================================
        // Configuração da ação do botão "Exemplo JTextArea"
        // ======================================================================
        // O JTextArea é um campo de entrada de múltiplas linhas de texto,
        // 			ideal para mensagens longas, descrições ou observações.
        // Diferente do JTextField, ele pode crescer verticalmente.
        // ======================================================================

        // Associa um ActionListener ao botão "btnTextArea".
        // Quando o botão for clicado, será exibida uma área de 
        // 			texto em um diálogo.
        btnTextArea.addActionListener(e -> {

            // Cria uma nova JTextArea com 5 linhas visíveis e 20 colunas de largura.
            // Esses números definem o "tamanho inicial" exibido, 
            // 			mas o usuário pode digitar mais conteúdo 
            // 			além desse limite.
            JTextArea area = new JTextArea(5, 20);

            // Cria um JScrollPane envolvendo a JTextArea.
            // O JScrollPane adiciona barras de rolagem automaticamente 
            // 			caso o texto ultrapasse o tamanho visível do campo.
            JScrollPane rolagem = new JScrollPane(area);

            // Exibe o JScrollPane (com a JTextArea dentro) em um JOptionPane.
            // Isso permite ao usuário escrever várias linhas de texto em 
            // 			uma caixa de diálogo.
            // Parâmetros:
            // - janela: referência da janela pai.
            // - rolagem: o JScrollPane que contém a JTextArea.
            // - "Digite várias linhas (JTextArea)": título do diálogo.
            // - JOptionPane.PLAIN_MESSAGE: diálogo simples sem ícones.
            JOptionPane.showMessageDialog(
                janela,
                rolagem,
                "Digite várias linhas (JTextArea)",
                JOptionPane.PLAIN_MESSAGE
            );
        });


        // ======================================================================
        // Configuração da ação do botão "Exemplo JPasswordField"
        // ======================================================================
        // O JPasswordField é semelhante a um JTextField, mas 
        // 			sua função principal é permitir a entrada de 
        // 			senhas ou dados sensíveis. 
        // Os caracteres digitados aparecem como pontos ou asteriscos, 
        // 			ocultando o que foi digitado.
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnPassword".
        // Esse listener será executado sempre que o usuário clicar no botão.
        btnPassword.addActionListener(e -> {

            // Cria um novo campo de senha (JPasswordField) com tamanho 
            // 			preferencial de 10 colunas.
            // Assim como no JTextField, esse número sugere largura 
            // 			visível, mas não limita a quantidade de caracteres 
            // 			que podem ser digitados.
            JPasswordField senha = new JPasswordField(10);

            // Exibe um JOptionPane contendo o campo de senha.
            // Parâmetros:
            // - janela → referência da janela principal, usada como "pai" do diálogo.
            // - senha → o JPasswordField a ser exibido, permitindo que o usuário digite.
            // - "Digite a senha (JPasswordField)" → título do diálogo.
            // - JOptionPane.PLAIN_MESSAGE → diálogo sem ícones (mais neutro).
            JOptionPane.showMessageDialog(
                janela,
                senha,
                "Digite a senha (JPasswordField)",
                JOptionPane.PLAIN_MESSAGE
            );
        });



        // ======================================================================
        // Configuração da ação do botão "Exemplo JCheckBox"
        // ======================================================================
        // O JCheckBox é um componente de seleção que pode ser 
        // 			marcado ou desmarcado de forma independente. 
        // Diferente de botões de opção (JRadioButton), é
        // 			possível selecionar vários checkboxes ao mesmo tempo.
        // Muito usado em formulários, como "Aceito os termos" ou 
        // 			"Quero receber promoções".
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnCheckBox".
        // Ao ser clicado, abrirá um diálogo contendo uma caixa 
        // 			de seleção (checkbox).
        btnCheckBox.addActionListener(e -> {

            // Cria um novo JCheckBox com o texto "Aceito os termos".
            // Inicialmente ele é exibido desmarcado, mas o usuário pode clicar
            // 			para marcar ou desmarcar a opção dentro do diálogo.
            JCheckBox check = new JCheckBox("Aceito os termos");

            // Exibe o JCheckBox dentro de um JOptionPane.
            // O usuário verá uma janela de diálogo com a opção 
            // 			"Aceito os termos" que pode ser marcada ou 
            // 			não, simulando um exemplo básico de formulário.
            JOptionPane.showMessageDialog(
                janela,
                check,
                "Exemplo JCheckBox",
                JOptionPane.PLAIN_MESSAGE
            );
        });


        // ======================================================================
        // Configuração da ação do botão "Exemplo JRadioButton"
        // ======================================================================
        // O JRadioButton representa uma opção que pode ser 
        // 			marcada ou desmarcada, mas, quando usado em 
        // 			conjunto com um ButtonGroup, garante que apenas
        // 			uma opção de um mesmo grupo pode ser selecionada ao 
        // 			mesmo tempo.
        // Esse comportamento é o clássico "botão de rádio" (como escolher sexo,
        // 			forma de pagamento, etc.), em que selecionar uma 
        // 			opção desmarca a outra.
        // ======================================================================

        // Associa um ActionListener ao botão "btnRadio".
        // Assim, quando o usuário clicar no botão da janela principal,
        // 			será exibido um exemplo com botões de 
        // 			rádio em um JOptionPane.
        btnRadio.addActionListener(e -> {

            // Cria o primeiro botão de rádio com o texto "Opção 1".
            // Inicialmente, nenhum dos botões está selecionado.
            JRadioButton opc1 = new JRadioButton("Opção 1");

            // Cria o segundo botão de rádio com o texto "Opção 2".
            // Esse será o par do primeiro botão dentro do mesmo grupo.
            JRadioButton opc2 = new JRadioButton("Opção 2");

            // Cria um ButtonGroup, que serve para agrupar vários JRadioButtons.
            // Ao adicionar botões de rádio em um mesmo grupo, o Swing garante
            // 			que apenas UM deles pode ser selecionado de cada vez.
            ButtonGroup grupo = new ButtonGroup();

            // Adiciona o botão "Opção 1" ao grupo.
            grupo.add(opc1);

            // Adiciona o botão "Opção 2" ao mesmo grupo.
            // Agora, se o usuário selecionar "Opção 1", "Opção 2" será 
            // 			desmarcado automaticamente, e vice-versa.
            grupo.add(opc2);

            // Cria um JPanel simples para organizar os botões.
            // O JPanel é um contêiner leve do Swing, usado aqui 
            // 			para colocar os dois radio buttons lado a 
            // 			lado dentro do diálogo.
            JPanel painel = new JPanel();

            // Adiciona o botão "Opção 1" ao painel.
            painel.add(opc1);

            // Adiciona o botão "Opção 2" ao painel.
            painel.add(opc2);

            // Exibe o painel contendo os dois botões de rádio 
            // 			dentro de um JOptionPane.
            // Parâmetros:
            // - janela → a janela principal (pai do diálogo).
            // - painel → o contêiner que agrupa os botões.
            // - "Exemplo JRadioButton" → título do diálogo.
            // - JOptionPane.PLAIN_MESSAGE → diálogo simples, sem ícones extras.
            JOptionPane.showMessageDialog(
                janela,
                painel,
                "Exemplo JRadioButton",
                JOptionPane.PLAIN_MESSAGE
            );
        });

        // ======================================================================
        // Configuração da ação do botão "Exemplo JComboBox"
        // ======================================================================
        // O JComboBox é um componente de lista suspensa (drop-down list).
        // Ele permite ao usuário selecionar um item entre várias opções.
        // Muito usado em formulários, quando temos valores predefinidos
        // 			(exemplo: estados, países, formas de pagamento etc.).
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnCombo".
        // Quando o usuário clicar no botão, será aberto um JOptionPane
        // 			contendo um JComboBox para seleção de itens.
        btnCombo.addActionListener(e -> {

            // Cria um array de Strings com três opções disponíveis.
            // Esse array será usado para popular o JComboBox.
            String[] itens = {"Item 1", "Item 2", "Item 3"};

            // Cria o JComboBox utilizando o array de Strings como opções.
            // O tipo genérico <String> indica que o JComboBox 
            // 			conterá apenas Strings.
            JComboBox<String> combo = new JComboBox<>(itens);

            // Exibe o JComboBox dentro de um JOptionPane.
            // Parâmetros:
            // - janela → referência da janela principal.
            // - combo → o JComboBox que será exibido.
            // - "Exemplo JComboBox" → título do diálogo.
            // - JOptionPane.PLAIN_MESSAGE → tipo de mensagem sem ícones extras.
            JOptionPane.showMessageDialog(
                janela,
                combo,
                "Exemplo JComboBox",
                JOptionPane.PLAIN_MESSAGE
            );
        });


        // ======================================================================
        // Configuração da ação do botão "Exemplo JList"
        // ======================================================================
        // O JList é um componente que exibe uma lista de itens.
        // Diferente do JComboBox, ele mostra todos os itens de uma vez (ou
        // 			com rolagem, caso a lista seja muito longa). 
        // Pode ser configurado para seleção simples ou múltipla.
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnList".
        // Quando clicado, abrirá um JOptionPane contendo uma lista.
        btnList.addActionListener(e -> {

            // Cria um array de Strings representando os itens da lista.
            // Nesse caso, frutas simples como exemplo.
            String[] itens = {"Maçã", "Banana", "Laranja", "Uva"};

            // Cria um JList baseado no array de Strings.
            // O tipo genérico <String> garante que a lista aceitará apenas Strings.
            JList<String> lista = new JList<>(itens);

            // Coloca a JList dentro de um JScrollPane.
            // Isso é importante porque listas podem conter muitos 
            // 			itens, e o JScrollPane adiciona barras de
            // 			rolagem automaticamente quando o conteúdo 
            // 			ultrapassa o espaço visível.
            JScrollPane rolagem = new JScrollPane(lista);

            // Exibe o JScrollPane (com a lista dentro) em um JOptionPane.
            // Parâmetros:
            // - janela → referência da janela principal.
            // - rolagem → JScrollPane que contém a lista.
            // - "Exemplo JList" → título do diálogo.
            // - JOptionPane.PLAIN_MESSAGE → mensagem simples sem ícones.
            JOptionPane.showMessageDialog(
                janela,
                rolagem,
                "Exemplo JList",
                JOptionPane.PLAIN_MESSAGE
            );
        });


        // ======================================================================
        // Configuração da ação do botão "Exemplo JTable"
        // ======================================================================
        // O JTable é um dos componentes mais poderosos do Swing, 
        // 			usado para exibir dados em formato tabular (linhas e colunas).
        // Ele permite visualização organizada, parecida com uma planilha.
        // Aqui vamos exibir uma tabela simples com 2 colunas e 
        // 			alguns dados de exemplo.
        // ======================================================================

        // Adiciona um ActionListener ao botão "btnTable".
        // Assim, quando o botão for clicado, será aberta uma janela de diálogo
        // 			exibindo uma tabela com dados.
        btnTable.addActionListener(e -> {

            // Cria um array de Strings representando os nomes das 
            // 			colunas da tabela.
            // Neste caso, teremos apenas duas colunas: "ID" e "Nome".
            String[] colunas = {"ID", "Nome"};

            // Cria uma matriz de objetos (Object[][]) representando os 
            // 			dados da tabela.
            // Cada linha da matriz corresponde a uma linha na tabela.
            // Aqui temos três registros de exemplo, com IDs e nomes.
            Object[][] dados = {
                {1, "Ana"},
                {2, "Bruno"},
                {3, "Carlos"}
            };

            // Cria a tabela (JTable) utilizando um DefaultTableModel.
            // O DefaultTableModel é responsável por gerenciar os 
            // 			dados e as colunas.
            // Parâmetros:
            // - dados → a matriz bidimensional que contém os registros.
            // - colunas → o vetor de Strings que contém os nomes das colunas.
            JTable tabela = new JTable(new DefaultTableModel(dados, colunas));

            // Envolve a JTable em um JScrollPane.
            // Isso é fundamental porque uma tabela pode conter 
            // 			muitas linhas/colunas, e o JScrollPane 
            // 			permite rolagem vertical e horizontal 
            // 			automaticamente quando o conteúdo excede o 
            // 			espaço disponível.
            JScrollPane rolagem = new JScrollPane(tabela);

            // Exibe a tabela dentro de um JOptionPane.
            // Parâmetros:
            // - janela → a janela principal usada como referência para o diálogo.
            // - rolagem → o JScrollPane que contém a JTable.
            // - "Exemplo JTable" → título da janela do diálogo.
            // - JOptionPane.PLAIN_MESSAGE → estilo de diálogo simples, sem ícones.
            JOptionPane.showMessageDialog(
                janela,
                rolagem,
                "Exemplo JTable",
                JOptionPane.PLAIN_MESSAGE
            );
        });

        // ======================================================================
        // Configuração da ação do botão "Exemplo JTree"
        // ======================================================================
        // O JTree é um componente do Swing usado para visualizar 
        // 			dados em estrutura hierárquica (pai/filho), 
        // 			semelhante ao explorador de arquivos do 
        // 			sistema operacional. 
        // Cada elemento é representado por um nó (TreeNode). 
        // Aqui usamos DefaultMutableTreeNode, que permite criar e 
        // 			modificar a hierarquia dinamicamente.
        // ======================================================================

        // Associa um ActionListener ao botão "btnTree" para reagir ao clique.
        // Ao ser clicado, o código dentro da expressão lambda 
        // 			será executado, criando a hierarquia de nós e 
        // 			exibindo a árvore em um diálogo.
        btnTree.addActionListener(e -> {

            // Cria o nó raiz da árvore com o rótulo "Pastas".
            // A raiz é o nó que fica no nível mais alto (topo da 
            // 			hierarquia) e pode conter diversos nós filhos (subpastas).
            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Pastas");

            // Cria um nó filho chamado "Documentos".
            // Esse nó representará uma subpasta (ou categoria) dentro de "Pastas".
            DefaultMutableTreeNode pasta1 = new DefaultMutableTreeNode("Documentos");

            // Cria outro nó filho chamado "Imagens".
            // Assim como "Documentos", este é um segundo ramo sob a raiz.
            DefaultMutableTreeNode pasta2 = new DefaultMutableTreeNode("Imagens");

            // Adiciona o nó "Documentos" como filho da raiz.
            // A chamada raiz.add(pasta1) insere "pasta1" na 
            // 			lista de filhos de "raiz".
            raiz.add(pasta1);

            // Adiciona o nó "Imagens" como filho da raiz.
            // Agora a raiz possui dois filhos diretos: "Documentos" e "Imagens".
            raiz.add(pasta2);

            // Cria o componente JTree a partir do nó raiz construído acima.
            // O JTree percorre a estrutura de nós (raiz → filhos → netos, etc.)
            // 			para renderizar graficamente a hierarquia em 
            // 			forma de árvore.
            JTree arvore = new JTree(raiz);

            // Envolve o JTree em um JScrollPane para prover barras de 
            // 			rolagem automaticamente quando a árvore crescer 
            // 			além do espaço visível.
            // Isso é essencial em hierarquias grandes para manter a usabilidade.
            JScrollPane rolagem = new JScrollPane(arvore);

            // Exibe a árvore (dentro do JScrollPane) em um JOptionPane.
            // Parâmetros:
            // - janela: a janela principal (usada para centralizar o diálogo).
            // - rolagem: o conteúdo a ser exibido (a árvore com rolagem).
            // - "Exemplo JTree": título do diálogo.
            // - JOptionPane.PLAIN_MESSAGE: estilo visual sem ícones adicionais.
            JOptionPane.showMessageDialog(
                janela,
                rolagem,
                "Exemplo JTree",
                JOptionPane.PLAIN_MESSAGE
            );
        });



        // ======================================================================
        // Tornar a janela visível para o usuário
        // ======================================================================
        // Por padrão, um JFrame recém-criado fica invisível.
        // A chamada setVisible(true) solicita ao sistema que 
        // 			mostre a janela na tela. 
        // Essa linha deve ser uma das últimas, pois só faz sentido
        // 			exibir a janela depois de configurar tamanho,
        // 			layout e componentes.
        janela.setVisible(true);

    }
}