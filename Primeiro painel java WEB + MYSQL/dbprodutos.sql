CREATE DATABASE dbprodutos;

USE dbprodutos;

CREATE TABLE Produto(
	codigo int primary key,
    nomeProduto varchar(30) not null,
    valor float not null,
    quantidade int not null
);