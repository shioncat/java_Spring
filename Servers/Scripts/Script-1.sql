create table if not exists fund (
	fid integer not null auto_increment,
	fname varchar(50),
	createtime datetime default current_timestamp,
	primary key(fid)
);

create table if not exists fundstock (
	sid integer not null auto_increment,
	fid integer,
	symbol varchar(50),
	share integer,
	foreign key(fid) references fund(fid), -- •~¡‰√ˆ¡p
	primary key(sid)
);


insert into fund(fname) values ('A');
insert into fund(fname) values ('B');
insert into fund(fname) values ('C');
insert into fund(fname) values ('D');
insert into fund(fname) values ('E');
insert into fund(fname) values ('F');
insert into fund(fname) values ('G');

insert into fundstock(fid, symbol,share) values(1,"2330.TW",5000);
insert into fundstock(fid, symbol,share) values(2,"2330.TW",6000);
insert into fundstock(fid, symbol,share) values(2,"2303.TW",6000);
insert into fundstock(fid, symbol,share) values(3,"2376.TW",8000);
insert into fundstock(fid, symbol,share) values(3,"1101.TW",9000);
insert into fundstock(fid, symbol,share) values(3,"2317.TW",8000);
insert into fundstock(fid, symbol,share) values(4,"3231.TW",7000);
insert into fundstock(fid, symbol,share) values(4,"2356.TW",6000);
insert into fundstock(fid, symbol,share) values(4,"2880.TW",5000);
insert into fundstock(fid, symbol,share) values(4,"2891.TW",4000);
insert into fundstock(fid, symbol,share) values(5,"2330.TW",3000);
insert into fundstock(fid, symbol,share) values(5,"1101.TW",2000);
insert into fundstock(fid, symbol,share) values(5,"2317.TW",1000);
insert into fundstock(fid, symbol,share) values(5,"2886.TW",2000);
insert into fundstock(fid, symbol,share) values(5,"2002.TW",3000);
