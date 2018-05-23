package formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

import controladores.Acao;
import controladores.Produto;

public class FormularioAlteracao {

	//Construtor
	public FormularioAlteracao(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {
		
		//Caixa principal
				JFrame cxAlteracao = new JFrame("Listagem de produtos");
				cxAlteracao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				cxAlteracao.setSize(420, 600);
				cxAlteracao.setLocationRelativeTo(null);
				
//JLabel e JText ==================================================================================================================
				
				//Produto - JLabel
				JLabel lblAlterarProduto = new JLabel("Produto");
				lblAlterarProduto.setBounds(50, 350, 150, 30);
				lblAlterarProduto.setFont(new Font("Calibri", Font.BOLD, 30));
				lblAlterarProduto.setForeground(Color.WHITE);
				
				//Produto - JText
				JTextField txtAlterarProduto = new JTextField();
				txtAlterarProduto.setBounds(170, 350, 200, 30);
				txtAlterarProduto.setFont(new Font("Calibri", Font.BOLD, 25));
				txtAlterarProduto.setForeground(Color.BLACK);
				
				
				//Valor - JLabel
				JLabel lblAlterarValor = new JLabel("Valor");
				lblAlterarValor.setBounds(50, 400, 150, 30);
				lblAlterarValor.setFont(new Font("Calibri", Font.BOLD, 30));
				lblAlterarValor.setForeground(Color.WHITE);
						
				//Valor - JText
				JTextField txtAlterarValor = new JTextField();
				txtAlterarValor.setBounds(170, 400, 200, 30);
				txtAlterarValor.setFont(new Font("Calibri", Font.BOLD, 25));
				txtAlterarValor.setForeground(Color.BLACK);
				
				
				//Quantidade - JLabel
				JLabel lblAlterarQuantidade = new JLabel("Quantidade");
				lblAlterarQuantidade.setBounds(50, 450, 150, 30);
				lblAlterarQuantidade.setFont(new Font("Calibri", Font.BOLD, 30));
				lblAlterarQuantidade.setForeground(Color.WHITE);
				
				//Listar dados - JTextArea
				JTextArea txtArea = new JTextArea("      Produto: "+nomeProduto+"\n          Valor: "+valorProduto+"\nQuantidade: "+quantidadeProduto);
				txtArea.setBounds(20, 10, 300, 100);
				txtArea.setOpaque(false);
				txtArea.setFont(new Font("Calibri", Font.BOLD, 25));
				txtArea.setForeground(Color.white);
				
				
								
				//Quantidade - JText
				JTextField txtAlterarQuantidade = new JTextField();
				txtAlterarQuantidade.setBounds(220, 450, 100, 30);
				txtAlterarQuantidade.setFont(new Font("Calibri", Font.BOLD, 25));
				txtAlterarQuantidade.setForeground(Color.BLACK);
				txtAlterarQuantidade.setHorizontalAlignment(SwingConstants.CENTER);		
				
				//Mensagem - JLabel
				JLabel mensagem = new JLabel("");
				mensagem.setBounds(100, 240, 200, 30);
				mensagem.setFont(new Font("Calibri", Font.BOLD, 25));
				mensagem.setForeground(Color.WHITE);
				mensagem.setHorizontalAlignment(SwingConstants.CENTER);
				
				
				//JButton - Alterar produto
				JButton btnAlterar = new JButton("Alterar");
				btnAlterar.setBounds(15, 500, 110, 50);
				btnAlterar.setFont(new Font("Calibri", Font.BOLD, 25));
				btnAlterar.setBackground(Color.GRAY);
				btnAlterar.setForeground(Color.WHITE);
				
				//JButton - Excluir
				JButton btnExcluir = new JButton("Excluir");
				btnExcluir.setBounds(147, 500, 110, 50);
				btnExcluir.setFont(new Font("Calibri", Font.BOLD, 25));
				btnExcluir.setBackground(Color.GRAY);
				btnExcluir.setForeground(Color.WHITE);
				
				//JButton - Sair
				JButton btnSair = new JButton("Sair");
				btnSair.setBounds(280, 500, 110, 50);
				btnSair.setFont(new Font("Calibri", Font.BOLD, 25));
				btnSair.setBackground(Color.GRAY);
				btnSair.setForeground(Color.WHITE);
				
				//Instanciando o botão
				Acao a = new Acao();
				
				//Ação do botão - Alterar
				btnAlterar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						//Variaveis
						String alterarNome = txtAlterarProduto.getText();
						double alterarValor = Double.parseDouble(txtAlterarValor.getText());
						int alterarQuantidade = Integer.parseInt(txtAlterarQuantidade.getText());
						
						//Realizando a ação
						a.alterarProduto(alterarNome, alterarValor, alterarQuantidade, linha);
						
						//Mostrando mensagem ao cliente
						mensagem.setText("Dados alterados");
						
					}
				});
				
				//Função do botão - Excluir
				btnExcluir.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Realizando a ação
						a.ExcluirProduto(linha);
						
						//Mostrando mensagem ao cliente
						mensagem.setText("Dados excluidos");
						
					}
				});
				
				
				//Função do botão - Sair
				btnSair.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Realização a ação
						
							//Voltar para a aba Principal
							FormularioPrincipal FP = new FormularioPrincipal();
							
							//Apagar mensagem ao cliente
							mensagem.setText("");
				
							//Fechar a aba de alteração
							cxAlteracao.dispose();
						
					}
				});
				
				
				
//Adicionar aos componentes ========================================================================================
				
		//Background
		JLabel BG2 = new JLabel(new ImageIcon("C:\\Users\\104969\\Desktop\\Trabalho Programador\\16 - Desafio\\src\\formularios\\BG2.gif"));
		BG2.setBounds(0, 10, 420, 500);
				
		//Composições da caixa
				
			//Produto
		    cxAlteracao.add(lblAlterarProduto);
			cxAlteracao.add(txtAlterarProduto);
				
		    //Valor
			cxAlteracao.add(lblAlterarValor);
			cxAlteracao.add(txtAlterarValor);
				
			//Quantidade
			cxAlteracao.add(lblAlterarQuantidade);
			cxAlteracao.add(txtAlterarQuantidade);

			//Exibir dados
			cxAlteracao.add(txtArea);
			
			//Mensagem
			cxAlteracao.add(mensagem);
			
			//Botões
			cxAlteracao.add(btnAlterar);
			cxAlteracao.add(btnExcluir);
			cxAlteracao.add(btnSair);
				
					
		//Background		
		cxAlteracao.add(BG2);
		
		//Deixar caixa visivel
		cxAlteracao.setVisible(true);
	}
}
