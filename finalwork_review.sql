create table review
(
    num        int       not null
        primary key,
    id         char(20)  null,
    movie_name char(20)  null,
    title      char(30)  null,
    content    char(100) null
);

