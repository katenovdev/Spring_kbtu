CREATE TABLE IF NOT EXISTS check_users
(
    id    SERIAL,
    email VARCHAR(200) NOT NULL,
    name  VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);