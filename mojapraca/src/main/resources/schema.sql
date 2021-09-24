drop table if exists product;

create table product(
    id int NOT NULL AUTO_INCREMENT primary key,
    codeEAN int not null,
    quantity int not null,
    data timestamp
);

drop table if exists nazwy_produktu;

create table nazwy_produktu(
    id int not null auto_increment primary key,
    name varchar(255) not null,
    codeEAN_product int not null
);

--
--alter table nazwy_produktu
--add constraint nazwy_produktu_po_EAN
--foreign key (codeEAN_product) references product(codeEAN);