package controladores;

import javax.swing.table.DefaultTableModel;

import formularios.FormularioAlteracao;
import formularios.FormularioPrincipal;

public class Acao {

	
	//Método cadastrar produtos
	public void cadastrarProduto(String nomeProduto, double valorProduto, int quantidadeProduto){
		
		//Cadastrar produto
		Produto p = new Produto();
		
		p.nomeProduto = nomeProduto;
		p.valorProduto = valorProduto;
		p.quantidadeProduto = quantidadeProduto;
		
		//Adicionando dados ao vetor
		Produto.registrarProduto.add(p);
		
	}
	
		//Método para retonar os dados do produto
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
	
	//Método para alterar o produto
	public void alterarProduto(String alterarNome, double alterarValor, int alterarQuantidade, int linha) {
		
		//Criando objeto e atribuindo dados
		Produto p = new Produto();
		
		p.nomeProduto = alterarNome;
		p.valorProduto = alterarValor;
		p.quantidadeProduto = alterarQuantidade;
		
		//Alterando os valores
		Produto.registrarProduto.set(linha, p);

	}
	
	//Método pra excluir a linha do produto
	public void ExcluirProduto(int linha){
		
		Produto.registrarProduto.remove(linha);
	}
}
