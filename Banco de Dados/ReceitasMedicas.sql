# Criando o banco de dados do projeto
create database if not exists db_rm;

# Selecionando o banco para uso
use db_rm;

# Criando a tabela paciente com os dados a serem inseridos
create table if not exists tbl_paciente(
	p_id varchar(15) primary key not null,
    p_nome varchar(50) not null,
    p_dataNasc date not null,
    p_cpf varchar(12) not null,
    p_remedio varchar(40) not null,
    p_dosagem varchar(50) not null,
    unique (p_id)
);
