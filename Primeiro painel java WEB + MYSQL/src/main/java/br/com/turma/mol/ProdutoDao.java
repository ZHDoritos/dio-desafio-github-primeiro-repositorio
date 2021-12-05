package br.com.turma.mol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.turma.jdbc.Conexao;

public class ProdutoDao {

public void cadastrar(Produto produto) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "INSERT INTO Produto(codigo,nomeProduto,valor,quantidade) VALUES(?,?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, produto.getCodigo());
			preparador.setString(2, produto.getNomeProduto());
			preparador.setDouble(3, produto.getValor());
			preparador.setInt(4, produto.getQuantidade());
			
			preparador.execute();
			con.close();
			
			System.out.println("Produto Cadastrado com Sucesso!!!");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Produto> mostrarTodos(){
		
		Connection con = Conexao.obterConexao();
		ArrayList<Produto> produtos = new ArrayList<>();
				
		String sql = "SELECT * FROM Produto";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
					
				while(resultado.next()) {
					Produto produto = new Produto();
					produto.setCodigo(resultado.getInt("codigo"));
					produto.setNomeProduto(resultado.getString("nomeProduto"));
					produto.setValor(resultado.getDouble("valor"));
					produto.setQuantidade(resultado.getInt("quantidade"));
					
					produtos.add(produto);
				}
;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
		
	}
}
