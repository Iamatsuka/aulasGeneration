CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

create table tb_classe(
	id_classe bigint(5) auto_increment,
	tipo varchar(20) not null,
	genero varchar(20) not null,
	primary key(id_classe)
);
        
create table tb_personagem(
	id_personagem bigint(5)auto_increment,
	nome varchar(20),
	ataque bigint(10),
	defesa bigint(10),
	vida bigint(10),
	id_classe bigint(5),
	primary key(id_personagem),
	FOREIGN KEY (id_classe) REFERENCES tb_classe(id_classe)
);
select * from tb_personagem;

insert into tb_classe(tipo,genero) VALUES ("arqueiro", "masculino");
insert into tb_classe(tipo,genero) VALUES ("feiticeira", "feminino");
insert into tb_classe(tipo,genero) VALUES ("soldado", "masculino");
insert into tb_classe(tipo,genero) VALUES ("amazona", "feminino");
insert into tb_classe(tipo,genero) VALUES ("bruxo", "masculino");

insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("caique", 2500, 1999, 5, 1);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("caio", 5000, 1000, 5, 5);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("caue", 4500, 6000, 5, 3);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("ricardo", 2500, 1400, 5, 1);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("purga", 4000, 1600, 5, 2);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("luna", 2300, 1999, 5, 4);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("marinilda", 3200, 1469, 5, 2);
insert into tb_personagem(nome, ataque, defesa, vida,id_classe) VALUES ("jobrinha", 2050, 1099, 5, 3);

select * from tb_personagem where ataque > 2000;
select * from tb_personagem where defesa > 1000 and defesa <2000;
select * from tb_personagem where nome like '%c%';
select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_personagem;
select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.id_personagem 
where tb_classe.tipo like "arqueiro"


