package formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controladores.Acao;


public class FormularioPrincipal {

	//Construtor
	public FormularioPrincipal(){
		
		//Caixa principal
		JFrame cxPrincipal = new JFrame("Listagem de produtos");
		cxPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cxPrincipal.setSize(420, 600);
		cxPrincipal.setLocationRelativeTo(null);
		
//JLabel e JText ==================================================================================================================
		
		//Produto - JLabel
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(50, 50, 150, 30);
		lblProduto.setFont(new Font("Calibri", Font.BOLD, 30));
		lblProduto.setForeground(Color.DARK_GRAY);
		
		//Produto - JText
		JTextField txtProduto = new JTextField();
		txtProduto.setBounds(170, 50, 200, 30);
		txtProduto.setFont(new Font("Calibri", Font.BOLD, 25));
		txtProduto.setForeground(Color.BLACK);
		
		
		//Valor - JLabel
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(50, 100, 150, 30);
		lblValor.setFont(new Font("Calibri", Font.BOLD, 30));
		lblValor.setForeground(Color.DARK_GRAY);
				
		//Valor - JText
		JTextField txtValor = new JTextField();
		txtValor.setBounds(170, 100, 200, 30);
		txtValor.setFont(new Font("Calibri", Font.BOLD, 25));
		txtValor.setForeground(Color.BLACK);
		
		
		//Quantidade - JLabel
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(50, 150, 150, 30);
		lblQuantidade.setFont(new Font("Calibri", Font.BOLD, 30));
		lblQuantidade.setForeground(Color.DARK_GRAY);
						
		//Quantidade- JText
		JTextField txtQuantidade = new JTextField();
		txtQuantidade.setBounds(220, 150, 100, 30);
		txtQuantidade.setFont(new Font("Calibri", Font.BOLD, 25));
		txtQuantidade.setForeground(Color.BLACK);
		txtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//Instanciar um objeto da classe Ação
		Acao a = new Acao();
		
		//JTable
		JTable tabela = new JTable(a.listarProdutos());
		
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(20, 300, 365, 300);
		
		
		
		
//Botão e ação ===================================================================================================================
		
		//JButton - Cadastrar
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(190, 200, 150, 50);
		btnCadastrar.setFont(new Font("Calibri", Font.BOLD, 25));
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setForeground(Color.WHITE);
		
		//Função - Cadastrar
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Variaveis para pegar os valores
				String nomeProduto = txtProduto.getText();
				double valorProduto = Double.parseDouble(txtValor.getText());
				int quantidadeProduto = Integer.parseInt(txtQuantidade.getText());
				
				//Chamando método
				a.cadastrarProduto(nomeProduto, valorProduto, quantidadeProduto);
				
				//Mostrar os produtos
				tabela.setModel(a.listarProdutos());
				
			}
		});
		
		
		//Ação - Clique na tabela
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				//Obter a linha
				int linha = tabela.getSelectedRow();
				
				//Obter os dados
				String nomeProduto = tabela.getValueAt(linha,0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidadeProduto = Integer.parseInt(tabela.getValueAt(linha, 2).toString());
				
				//Criando o formulario de alteração
				FormularioAlteracao FA = new FormularioAlteracao(nomeProduto, valorProduto, quantidadeProduto, linha);
				
				//Fechar formulario principal
				cxPrincipal.dispose();

				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
//Adicionando componentes =========================================================================================================
		
		//Background
		JLabel BG = new JLabel(new ImageIcon("C:\\Users\\104969\\Desktop\\Trabalho Programador\\16 - Desafio\\src\\formularios\\BG.gif"));
		BG.setBounds(0, 10, 420, 500);
		
		//Composições da caixa
		
			//Produto
			cxPrincipal.add(lblProduto);
			cxPrincipal.add(txtProduto);
			
			//Valor
			cxPrincipal.add(lblValor);
			cxPrincipal.add(txtValor);
			
			//Quantidade
			cxPrincipal.add(lblQuantidade);
			cxPrincipal.add(txtQuantidade);
			
			//Botão - Cadastrar
			cxPrincipal.add(btnCadastrar);
			
			//Tabela dos produtos - JTable
			cxPrincipal.add(barra);
		
			//Background
			cxPrincipal.add(BG);
					

		//Deixando programa visivel
		cxPrincipal.setVisible(true);
	}
}
