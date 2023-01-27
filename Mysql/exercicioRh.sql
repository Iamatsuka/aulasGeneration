create database db_recursos;

use db_recursos;
create table tb_colaborador(
	id bigint(5) auto_increment,
    nome varchar(30) not null,
    salario decimal(5),
    cel varchar(15),
    cpf varchar(15),
    primary key(id)
);

insert into tb_colaborador(nome, salario, cel, cpf) values ("Caique da Motta Pino", 15000, "(11) 912345678", "000.000.000-00");
insert into tb_colaborador(nome, salario, cel, cpf) values ("Ricardo Teles", 1500, "(11) 912345678", "000.000.000-00");
insert into tb_colaborador(nome, salario, cel, cpf) values ("Lia Ribeiro", 2001, "(11) 912345678", "000.000.000-00");
insert into tb_colaborador(nome, salario, cel, cpf) values ("Maria Beatriz", 5000, "(11) 912345678", "000.000.000-00");
insert into tb_colaborador(nome, salario, cel, cpf) values ("Hercules", 1999, "(11) 912345678", "000.000.000-00");

select * from tb_colaborador where salario > 2000;
select * from tb_colaborador where salario < 2000;

update tb_colaborador set nome = "ricardo" where id = 2;


	
	