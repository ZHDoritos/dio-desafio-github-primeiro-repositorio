package br.com.turma.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.mol.Produto;
import br.com.turma.mol.ProdutoDao;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("txtcodigo"));
		String nomeProduto = request.getParameter("txtnomeproduto");
		double valor = Double.parseDouble(request.getParameter("txtvalor").replace(",","."));
		int quantidade = Integer.parseInt(request.getParameter("txtquantidade"));
		
		Produto produto = new Produto(codigo, nomeProduto, valor, quantidade);
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.cadastrar(produto);
		
		response.sendRedirect("mostrar");
		
	}

}
