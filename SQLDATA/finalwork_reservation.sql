create table reservation
(
    num        int auto_increment
        primary key,
    id         char(20)     null,
    seatnumber char(10)     null,
    times      char(30)     null,
    reserved   tinyint      null,
    movie_name varchar(200) null
);

INSERT INTO finalwork.reservation (num, id, seatnumber, times, reserved, movie_name) VALUES (1, null, null, null, null, '익스포즈');
