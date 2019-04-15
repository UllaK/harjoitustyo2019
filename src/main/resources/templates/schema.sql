CREATE TABLE IF NOT EXISTS vaatteet (
    vaatteet_id int(5) NOT NULL AUTO_INCREMENT,
    merkki varchar(50) DEFAULT NULL,
    koko varchar(50) DEFAULT NULL,
    kuvaus varchar(100) DEFAULT NULL,
    PRIMARY KEY(vaatteet_id)
    );