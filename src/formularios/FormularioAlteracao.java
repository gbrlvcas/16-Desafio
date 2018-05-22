package formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controladores.Acao;

public class FormularioAlteracao {

	//Construtor
	public FormularioAlteracao(String nomeProduto, double valorProduto, int quantidadeProduto) {
		
		//Caixa principal
				JFrame cxAlteracao = new JFrame("Listagem de produtos");
				cxAlteracao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				cxAlteracao.setSize(420, 600);
				cxAlteracao.setLocationRelativeTo(null);
				
//JLabel e JText ==================================================================================================================
				
				//Produto - JLabel
				JLabel lblAlterarProduto = new JLabel("Produto");
				lblAlterarProduto.setBounds(50, 50, 150, 30);
				lblAlterarProduto.setFont(new Font("Calibri", Font.BOLD, 30));
				lblAlterarProduto.setForeground(Color.DARK_GRAY);
				
				//Produto - JText
				JTextField txtAlterarProduto = new JTextField();
				txtAlterarProduto.setBounds(170, 50, 200, 30);
				txtAlterarProduto.setFont(new Font("Calibri", Font.BOLD, 25));
				txtAlterarProduto.setForeground(Color.BLACK);
				
				
				//Valor - JLabel
				JLabel lblAlterarValor = new JLabel("Valor");
				lblAlterarValor.setBounds(50, 100, 150, 30);
				lblAlterarValor.setFont(new Font("Calibri", Font.BOLD, 30));
				lblAlterarValor.setForeground(Color.DARK_GRAY);
						
				//Valor - JText
				JTextField txtAlterarValor = new JTextField();
				txtAlterarValor.setBounds(170, 100, 200, 30);
				txtAlterarValor.setFont(new Font("Calibri", Font.BOLD, 25));
				txtAlterarValor.setForeground(Color.BLACK);
				
				
				//Quantidade - JLabel
				JLabel lblAlterarQuantidade = new JLabel("Quantidade");
				lblAlterarQuantidade.setBounds(50, 150, 150, 30);
				lblAlterarQuantidade.setFont(new Font("Calibri", Font.BOLD, 30));
				lblAlterarQuantidade.setForeground(Color.DARK_GRAY);
								
				//Quantidade - JText
				JTextField txtAlterarQuantidade = new JTextField();
				txtAlterarQuantidade.setBounds(220, 150, 100, 30);
				txtAlterarQuantidade.setFont(new Font("Calibri", Font.BOLD, 25));
				txtAlterarQuantidade.setForeground(Color.BLACK);
				txtAlterarQuantidade.setHorizontalAlignment(SwingConstants.CENTER);		
				
				//JButton - Alterar produto
				JButton btnAlterar = new JButton("Alterar");
				btnAlterar.setBounds(190, 200, 150, 50);
				btnAlterar.setFont(new Font("Calibri", Font.BOLD, 25));
				btnAlterar.setBackground(Color.GRAY);
				btnAlterar.setForeground(Color.WHITE);
				
				//Ação do botão - Alterar
				btnAlterar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						String alterarNome = txtAlterarProduto.getText();
						double alterarValor = Double.parseDouble(txtAlterarValor.getText());
						int alterarQuantidade = Integer.parseInt(txtAlterarQuantidade.getText());
						
						Acao a = new Acao();
						
						a.alterarProduto(alterarNome, alterarValor, alterarQuantidade);
					
						
					}
				});
				
				
				
				
//Adicionar aos componentes ========================================================================================
				
		//Background
		JLabel BG2 = new JLabel(new ImageIcon("C:\\Users\\104969\\Desktop\\Trabalho Programador\\16 - Desafio\\src\\formularios\\BG.gif"));
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
			
			//Botão alterar
			cxAlteracao.add(btnAlterar);
				
					
		//Background		
		cxAlteracao.add(BG2);
		
		//Deixar caixa visivel
		cxAlteracao.setVisible(true);
	}
}
