create database airline_db;

create user 'oziichukwu1'@'localhost'identified by 'password';

grant all privileges on airline_db.* to 'oziichukwu1'@'localhost';

flush privileges;