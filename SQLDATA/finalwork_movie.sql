create table movie
(
    num        int auto_increment
        primary key,
    ranks      int         default 99            null,
    movie_name varchar(50) default 'not_defined' null,
    audience   int         default 30            null
);

INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (1, 2140, '익스포즈', 29);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (2, 2258, '마지막 국화 이야기', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (3, 1843, '에스워치', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (4, 2241, '인간의 조건(1·2부)', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (5, 105, '비스트', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (6, 3624, '엘비스와 대통령', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (7, 84, '강철비', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (8, 3765, '바바둑', 30);
INSERT INTO finalwork.movie (num, ranks, movie_name, audience) VALUES (9, 1518, '원숭이 산', 30);
