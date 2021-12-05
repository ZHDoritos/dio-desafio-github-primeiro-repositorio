package br.com.turma.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.mol.Produto;
import br.com.turma.mol.ProdutoDao;

@WebServlet("/mostrar")
public class MostrarServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoDao produtoDao = new ProdutoDao();
		ArrayList<Produto> produtos = produtoDao.mostrarTodos();
		
		request.setAttribute("produtos", produtos);
		RequestDispatcher rd = request.getRequestDispatcher("/formMostrarProdutos.jsp");
		rd.forward(request, response);
	}

}
