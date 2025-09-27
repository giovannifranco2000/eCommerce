create database ecommerce;
use ecommerce;

create table categorie (
	id bigint unsigned auto_increment not null,
    nome varchar(100) not null,
    descrizione text,
    primary key(id)
);

create table prodotti (
	id bigint unsigned auto_increment not null,
    categoria bigint unsigned,
    nome varchar(100) not null,
    descrizione text,
    prezzo double,
    primary key(id),
    -- rapporto 1(categoria):n(prodotti)
    foreign key(categoria) references categorie(id)
		-- se modifico l'id della categoria, aggiorno anche l'id dei prodotti ad essa appartenenti
		on update cascade
        -- se elimino la categoria, non elimino il prodotto, ma ne setto la categoria a null
        on delete set null
);

create table utenti (
	id bigint unsigned auto_increment not null,
    nome varchar(100),
    cognome varchar(100),
    username varchar(100) unique,
    email varchar(100) unique,
    password varchar(100),
    cellulare varchar(15),
    primary key(id)
);

create table ordini (
	id bigint unsigned auto_increment not null,
    utente bigint unsigned,
    data datetime default now(),
	metodo_pagamento varchar(100),
    totale double,
    primary key(id),
    -- rapporto 1(utente)-n(ordini)
    foreign key(utente) references utenti(id)
		-- se aggiorno l'id di un utente, aggiorno anche l'id dell'ordine associato
		on update cascade
        -- se elimino l'utente, elimino anche l'ordine associato
        on delete cascade
);

-- rapporto n(prodotti):n(ordini)
create table checkout (
	id bigint unsigned auto_increment not null,
    prodotto bigint unsigned not null,
    ordine bigint unsigned not null,
    quantita int unsigned not null default 1,
    prezzo_unitario double,
    primary key(id),
    -- rapporto 1(prodotto):n(ordini)
    foreign key(prodotto) references prodotti(id)
		-- se aggiorno l'id di un prodotto, aggiorno anche l'id del checkout associato
		on update cascade
        -- se elimino il prodotto, elimino anche tutti i checkout associati
        on delete cascade,
	-- rapporto 1(utente):n(ordini)
	foreign key(ordine) references ordini(id)
		-- se aggiorno l'id di un ordine, aggiorno anche l'id del checkout associato
		on update cascade
        -- se elimino l'ordine, elimino anche tutti i checkout associati
        on delete cascade
);