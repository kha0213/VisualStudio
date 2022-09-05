drop table if exists member CASCADE;

create table member
(
    id bigint generated by default as identity,
    name varchar(255),
    createDate datetime default now(),
    lastModifyDate datetime default now()
);

insert into member (name) values ('영롱');