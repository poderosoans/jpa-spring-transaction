drop database if exists tienda;

create database tienda;

use tienda;

create table usuario(
  id bigint primary key auto_increment,
  nombre varchar(100) not null,
  apellido varchar(100) not null,
  fecha_nacimiento datetime not null
);

insert into usuario values (null, 'Luiggi', 'Mendoza', '1987-12-01');

create table tab_producto (
  id bigint primary key auto_increment,
  nombre varchar(100) not null,
  descripcion varchar(500),
  precio decimal(10,2) not null,
  imagen blob
);

create table categoria(
  id bigint primary key auto_increment,
  nombre varchar(100) not null
);

insert into categoria values
(null, 'Electrodomésticos'),
(null, 'Juguetería'),
(null, 'Deportes');

alter table tab_producto
 add id_categoria bigint not null,
 add foreign key (id_categoria) references categoria(id);


insert into tab_producto values
(null, 'Refrigeradora LG H230', 'Refrigeradora LG H230 enfría más que su corazón', 700, null, 1),
(null, 'Lavadora LG S400', 'Lavadora LG S400', 640, null, 1),
(null, 'Cocina IKEA Gris 852', 'Cocina IKEA Gris 852', 970, null, 1),
(null, 'Playstation 4 Slim SSD 120 GB', 'Playstation 4 Slim SSD 120 GB', 2500, null, 2),
(null, 'Peluche Oso Panda Cariñositos', 'Peluche Oso Panda Cariñositos', 35, null, 2),
(null, 'Mesa de ping pong 220 x 90', 'Mesa de ping pong 220 x 90', 357, null, 2),
(null, 'Faja corredora 14 velocidades', 'Faja corredora 14 velocidades', 1500, null, 3),
(null, 'Faja corredora 8 velocidades', 'Faja corredora 8 velocidades', 950, null, 3)
;

create table carrito (
  id bigint primary key auto_increment,
  total decimal(10,2) not null,
  fecha_creacion datetime,
  fecha_compra datetime,
  direccion_envio varchar(100),
  activo bit,
  id_usuario bigint not null,
  foreign key (id_usuario) references usuario(id)
);

create table detalle_carrito (
  id bigint primary key auto_increment,
  id_carrito bigint not null,
  id_producto bigint not null,
  cantidad int not null,
  precio_unitario decimal(10,2) not null,
  foreign key (id_carrito) references carrito(id),
  foreign key (id_producto) references tab_producto(id)
);



insert into carrito values
(null, 640, now(), now(), 'Jr Lampa 123', false, 1), -- 2
(null, 2277, now(), now(), 'Jr Ayacucho 1241', false, 1), -- 3 + 8 + 6
(null, 4735, now(), now(), 'Av Brasil 1210 Dpto 1504', false, 1) -- 1 + 7 + 4 + 5
;

insert into detalle_carrito values
(null, 1, 2, 1, 640),

(null, 2, 3, 1, 970.00),
(null, 2, 8, 1, 950.00),
(null, 2, 6, 1, 357.00),

(null, 3, 1, 1, 700.00),
(null, 3, 7, 1, 1500.00),
(null, 3, 4, 1, 2500.00),
(null, 3, 5, 1, 35.00);

