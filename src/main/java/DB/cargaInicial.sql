CREATE TABLE IF NOT EXISTS carros (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    status INT NOT NULL
);

INSERT INTO carros (descricao, status)
VALUES ('Celta', 1);

INSERT INTO carros (descricao, status)
VALUES ('Corola', 1);

INSERT INTO carros (descricao, status)
VALUES ('Fusca', 1);

