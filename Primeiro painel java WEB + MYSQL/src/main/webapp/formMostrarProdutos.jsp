<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOSTRAR PRODUTOS</title>
<style>
	.botao {
		background-color: #4CAF50;
  		border: 1px;
  		color: white;
  		padding: 15px 32px;
  		text-align: center;
  		text-decoration: none;
  		display: inline-block;
  		font-size: 16px;
  		margin: 4px 2px;
  		cursor: pointer;
	}
	.quadrado {
		border: 1;
		border-style: groove;
	}
	.top {
		background-color: #4CAF50;
  		border: none;
  		color: white;
  		padding: 15px 32px;
  		text-align: center;
  		text-decoration: none;
  		font-size: 16px;
  		margin: 4px 2px;
	}
</style>
</head>
<body>
	
	<c:if test="${not empty produtos}">
	
	<table class="quadrado" border="1" align="center">
			
		<thead class="quadrado">
			<tr>
			<th class="top" colspan="4">TOTAL DE PRODUTOS</th><br><br>
			</tr>
			<tr style="background-color: black; color: white">
				<th>Código</th>
				<th>Produto</th>
				<th>Valor</th>
				<th>Quantidade</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="produto" items="${produtos}">
			<tr border="1" style="text-align: center;">
				<td>${produto.codigo}</td>
				<td>${produto.nomeProduto}</td>
				<td>${produto.valor}</td>
				<td>${produto.quantidade}</td><br><br>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<center><a class="botao" href="formCadastroProdutos.html">Cadastrar Produto</a></center>
	</c:if>
	<c:if test="${empty produtos}">
		<h4> Nenhum Produto Cadastrado!</h4>
	</c:if>
	
</body>
</html>