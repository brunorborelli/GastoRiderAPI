CREATE TABLE IF NOT EXISTS Usuario (
    Id SERIAL PRIMARY KEY,
    CPF VARCHAR(11),
    Nome VARCHAR(100),
    Sobrenome VARCHAR(100),
    Genero VARCHAR(10),
    DataNascimento VARCHAR(10),
    DataCadastro VARCHAR(10),
    Cidade VARCHAR(100),
    Estado VARCHAR(50),
    Pais VARCHAR(50),
    Email VARCHAR(100),
    Senha VARCHAR(100),
    CNH VARCHAR(20),
    TipoCNH VARCHAR(20)
);

INSERT INTO Usuario (CPF, Nome, Sobrenome, Genero, DataNascimento, DataCadastro, Cidade, Estado, Pais, Email, Senha, CNH, TipoCNH)
VALUES
    ('12345678901', 'João', 'Silva', 'Masculino', '1990-01-01', '2023-06-11', 'São Paulo', 'SP', 'Brasil', 'joao.silva@example.com', 'senha123', '123456789', 'B'),
    ('98765432101', 'Maria', 'Santos', 'Feminino', '1985-05-15', '2023-06-11', 'Rio de Janeiro', 'RJ', 'Brasil', 'maria.santos@example.com', 'senha456', '987654321', 'AB'),
    ('54321678901', 'Pedro', 'Ferreira', 'Masculino', '1995-12-10', '2023-06-11', 'Belo Horizonte', 'MG', 'Brasil', 'pedro.ferreira@example.com', 'senha789', '543216789', 'A');
