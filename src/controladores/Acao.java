package controladores;

import javax.swing.table.DefaultTableModel;

import formularios.FormularioAlteracao;
import formularios.FormularioPrincipal;

public class Acao {

	
	//M�todo cadastrar produtos
	public void cadastrarProduto(String nomeProduto, double valorProduto, int quantidadeProduto){
		
		//Cadastrar produto
		Produto p = new Produto();
		
		p.nomeProduto = nomeProduto;
		p.valorProduto = valorProduto;
		p.quantidadeProduto = quantidadeProduto;
		
		//Adicionando dados ao vetor
		Produto.registrarProduto.add(p);
		
	}
	
		//M�todo para retonar os dados do produto
	public DefaultTableModel listarProdutos(){
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		modelo.addColumn("Quantidade");
		
		
			//Realizando o for int para mostrar todos os dados cadastrados
			for (int indice = 0; indice < Produto.registrarProduto.size(); indice++){
				modelo.addRow(new Object[] { 
						Produto.registrarProduto.get(indice).nomeProduto,
						Produto.registrarProduto.get(indice).valorProduto,
						Produto.registrarProduto.get(indice).quantidadeProduto
				});
			}

			//Retornar
			return modelo;
		
		
	}
	
	//M�todo para alterar o produto
	public void alterarProduto(String alterarNome, double alterarValor, int alterarQuantidade) {
		
			
		
		
		
	}
}
