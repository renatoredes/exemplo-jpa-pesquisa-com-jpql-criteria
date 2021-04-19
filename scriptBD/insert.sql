insert into categoria (nome) values ('venda');
select * from categoria;

insert into conta (agencia, numero,saldo,titular) values (003,003,800000,'Renato');
select * from conta;

insert into cliente (endereco, nome, profissao,conta_id) values ('Recife', 'Renato','Engenheiro de Software',1);
select * from cliente;


select * from movimentacao;
insert into Movimentacao (data, valor, conta_id, descricao, tipoMovimentacao) values ('2021-01-12 18:01:07', 80.0, 2, 'Restaurante', 1);
insert into Movimentacao (data, valor, conta_id, descricao, tipoMovimentacao) values ('2021-01-12 19:31:12', 100.0, 2, 'Cinema', 1);
insert into Movimentacao (data, valor, conta_id, descricao, tipoMovimentacao) values ('2021-01-13 10:01:54', 40.0, 2, 'Café da manhã', 1);
insert into Movimentacao (data, valor, conta_id, descricao, tipoMovimentacao) values ('2021-01-14 15:20:13', 20.0, 2, 'Lanche', 1);

select * from movimentacao_categoria;
insert into movimentacao_categoria(movimentacao_id, categorias_id) values (2,1);

Hibernate: 
    insert 
    into
        Categoria
        (nome) 
    values
        (?)
Hibernate: 
    insert 
    into
        Categoria
        (nome) 
    values
        (?)
Hibernate: 
    insert 
    into
        Conta
        (agencia, numero, saldo, titular) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        Conta
        (agencia, numero, saldo, titular) 
    values
        (?, ?, ?, ?)
Hibernate: 
    insert 
    into
        Movimentacao
        (conta_id, data, descricao, tipoMovimentacao, valor) 
    values
        (?, ?, ?, ?, ?)
Hibernate: 
    insert 
    into
        Movimentacao
        (conta_id, data, descricao, tipoMovimentacao, valor) 
    values
        (?, ?, ?, ?, ?)
Hibernate: 
    insert 
    into
        Movimentacao_Categoria
        (Movimentacao_id, categorias_id) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        Movimentacao_Categoria
        (Movimentacao_id, categorias_id) 
    values
        (?, ?)
