create table member
(
    id    char(20) null,
    pwd   int      null,
    isin  tinyint  null,
    admin tinyint  null,
    num   int auto_increment
        primary key
);

INSERT INTO finalwork.member (id, pwd, isin, admin, num) VALUES ('1234', 1234, 1, 1, 1);
