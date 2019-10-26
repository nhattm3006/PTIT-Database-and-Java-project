create database quanlygamingcenter;
use quanlygamingcenter;

-- Tạo các bảng
create table acc(
    id int auto_increment, -- id tài khoản
    acc_name varchar(18) unique not null, -- tên tài khoản
    passwd varchar(18) not null, -- mật khẩu
    date_created date not null, -- ngày tạo tài khoản
    money float default(0) not null, -- số dư trong tài khoản
    primary key (id)
);

create table com_area(
    id int auto_increment, -- id khu
    area_name varchar(18) unique not null, -- tên khu
    cost_per_hour float not null, -- giá tiền cho mỗi giờ sử dụng
    primary key (id)
);

create table computer(
    id int auto_increment, -- id máy
    area_id int not null, -- máy thuộc khu nào
    stt enum('mainten', 'in use', 'not in use') not null,
    -- trạng thái: bảo trì / đang sử dụng / còn trống
    acc_id int, -- tài khoản nào đang sử dụng
    primary key (id),
    foreign key (area_id) references com_area(id),
    foreign key (acc_id) references acc(id)
);

create table type_of_goods(
    id int auto_increment, -- id loại hàng
    type_name varchar(18) unique not null, -- tên loại hàng
    primary key (id)
);

create table goods(
    id int auto_increment, -- id sản phẩm
    goods_name varchar(18) unique not null, -- tên sản phẩm
    type_id int, -- sản phẩm thuộc loại nào
    unit varchar(10) not null, -- đơn vị sản phẩm
    price float not null, -- giá tiền trên mỗi đơn vị sản phẩm
    stock int default(0) not null, -- số lượng còn trong kho
    primary key (id),
    foreign key (type_id) references type_of_goods(id)
);

create table bill(
    id int auto_increment, -- id hóa đơn
    acc_id int, -- hóa đơn của tài khoản nào
    date_created date not null, -- ngày tạo hóa đơn
    total float not null, -- tổng tiền hóa đơn
    primary key (id),
    foreign key (acc_id) references acc(id)
);

create table single_order(
    id int auto_increment, -- id đơn hàng
    goods_id int, -- id sản phẩm đặt mua
    bill_id int, -- id hóa đơn tổng
    amount float not null, -- số lượng sản phẩm
    price float not null, -- giá đơn hàng
    primary key (id),
    foreign key (goods_id) references goods(id),
    foreign key (bill_id) references bill(id)
);

-- Nhập data
-- Nhập các tài khoản
insert into acc(acc_name, passwd, date_created, money) 
value('iamabear', '30061999', current_date(), 50000);

insert into acc(acc_name, passwd, date_created, money) 
value('hieu2805', 'hieungau', current_date(), 10000);

insert into acc(acc_name, passwd, date_created, money) 
value('giang199', 'onfire1999', current_date(), 50000);

insert into acc(acc_name, passwd, date_created, money) 
value('long013', '6799', current_date(), 5000);

-- Nhập các khu máy
insert into com_area(area_name, cost_per_hour) 
value('Thuong', 6000);

insert into com_area(area_name, cost_per_hour) 
value('VIP', 10000);

insert into com_area(area_name, cost_per_hour) 
value('Hut thuoc', 6000);

insert into com_area(area_name, cost_per_hour) 
value('Thi dau', 15000);

insert into com_area(area_name, cost_per_hour) 
value('Streaming', 20000);

-- Nhập các máy
insert into computer(area_id, stt)
value(1, 'mainten');

insert into computer(area_id, stt)
value(1, 'mainten');

insert into computer(area_id, stt)
value(1, 'not in use');

insert into computer(area_id, stt)
value(1, 'not in use');

insert into computer(area_id, stt)
value(1, 'not in use');

insert into computer(area_id, stt, acc_id)
value(1, 'in use', 4);

insert into computer(area_id, stt, acc_id)
value(1, 'in use', 1);

insert into computer(area_id, stt, acc_id)
value(2, 'in use', 2);

insert into computer(area_id, stt)
value(2, 'not in use');

insert into computer(area_id, stt, acc_id)
value(4, 'in use', 3);

insert into computer(area_id, stt)
value(4, 'not in use');

insert into computer(area_id, stt)
value(4, 'not in use');

insert into computer(area_id, stt, acc_id)
value(3, 'in use', 3);

-- Nhập loại mặt hàng
insert into type_of_goods(type_name)
value("drink");
insert into type_of_goods(type_name)
value("food");
insert into type_of_goods(type_name)
value("card");


-- Chức năng
select * from com_area;

select * from type_of_goods;

select id, 
    (select area_name from com_area 
        where com_area.id = computer.area_id) as 'area', 
    stt, 
    (select acc_name from acc 
        where acc.id = computer.acc_id) as 'account' 
from computer;

select * from acc;

select id, goods_name, 
    (select type_name from type_of_goods 
        where type_of_goods.id = goods.type_id) as 'type', 
    unit, 
    price, 
    stock 
from goods;

