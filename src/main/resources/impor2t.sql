
DROP TABLE CITY;

create table city
(
    city_id long auto_increment not null,
    city_name VARCHAR not null,
    lat       double not null,
    lon       double not null
);
INSERT INTO city (city_name, lat, lon) VALUES
                                      ('Kraków', 50.049683, 19.944544),
                                      ('Gdańsk', 54.372158, 18.638306),
                                      ('Warszawa', 52.237049, 21.017532),
                                      ('Lublin', 51.246452, 22.568445),
                                      ('Katowice', 50.270908, 19.039993),
                                      ('Berlin', 52.520008, 13.404954),
                                      ('Paryż', 48.856613, 2.352222),
                                      ('London', 51.507351, -0.127758),
                                      ('NowyYork', 40.712776, -74.005974),
                                      ('Toruń', 53.013790, 18.598444);