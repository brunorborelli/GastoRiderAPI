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

-- INSERT INTO Usuario (CPF, Nome, Sobrenome, Genero, DataNascimento, DataCadastro, Cidade, Estado, Pais, Email, Senha, CNH, TipoCNH)
-- VALUES
--     ('12345678901', 'João', 'Silva', 'Masculino', '1990-01-01', '2023-06-11', 'São Paulo', 'SP', 'Brasil', 'joao.silva@example.com', 'senha123', '123456789', 'B'),
--     ('98765432101', 'Maria', 'Santos', 'Feminino', '1985-05-15', '2023-06-11', 'Rio de Janeiro', 'RJ', 'Brasil', 'maria.santos@example.com', 'senha456', '987654321', 'AB'),
--     ('54321678901', 'Pedro', 'Ferreira', 'Masculino', '1995-12-10', '2023-06-11', 'Belo Horizonte', 'MG', 'Brasil', 'pedro.ferreira@example.com', 'senha789', '543216789', 'A');


CREATE TABLE IF NOT EXISTS categoria_gastos (
  id SERIAL PRIMARY KEY,
  tipo_gasto VARCHAR(50) NOT NULL,
  descricao VARCHAR(100)
);

-- INSERT INTO categoria_gastos (tipo_gasto, descricao)
-- VALUES
--   ('Combustível', 'Gastos com combustível'),
--   ('Manutenção', 'Despesas de manutenção e reparos'),
--   ('Seguro', 'Pagamento de seguro'),
--   ('Estacionamento', 'Custos de estacionamento'),
--   ('Peças de reposição', 'Compras de peças de reposição'),
--   ('Lavagem', 'Gastos com lavagem e limpeza'),
--   ('Impostos e taxas', 'Pagamentos de impostos e taxas'),
--   ('Financiamento', 'Pagamentos de financiamento'),
--   ('Multas e infrações', 'Pagamento de multas e infrações'),
--   ('Licenciamento', 'Custos de licenciamento');


CREATE TABLE IF NOT EXISTS Carro (
    id SERIAL PRIMARY KEY,
    id_usuario BIGINT REFERENCES Usuario(id),
    placa INTEGER,
    marca BIGINT REFERENCES Marca(id),
    modelo BIGINT REFERENCES Modelo(id),
    descricao VARCHAR(255),
    tipo_combustivel VARCHAR(50),
    km_cadastrado INTEGER,
    foto VARCHAR(255)
);

-- INSERT INTO Carro (id_usuario, placa, marca, modelo, descricao, tipo_combustivel, km_cadastrado, foto)
-- VALUES (1, 1234, 1, 1, 'Fusca 1970', 'Gasolina', 100000, 'fusca.jpg');
-- 
-- INSERT INTO Carro (id_usuario, placa, marca, modelo, descricao, tipo_combustivel, km_cadastrado, foto)
-- VALUES (1, 5678, 2, 2, 'Opala 1980', 'Álcool', 150000, 'opala.jpg');

CREATE TABLE IF NOT EXISTS Gastos (
    id SERIAL PRIMARY KEY,
    id_categoria BIGINT REFERENCES Categoria_Gastos(id),
    id_carro BIGINT REFERENCES Carro(id),
    descricao VARCHAR(255),
    data VARCHAR(10),
    gasto DECIMAL(10, 2)
);

-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (1, 1, 'Troca de óleo', '2023-06-01', 50.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (2, 1, 'Limpeza interna', '2023-06-02', 30.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (3, 2, 'Abastecimento', '2023-06-03', 70.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (4, 3, 'Estacionamento', '2023-06-04', 10.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (1, 2, 'Troca de óleo', '2023-06-05', 50.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (2, 3, 'Limpeza interna', '2023-06-06', 30.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (3, 1, 'Abastecimento', '2023-06-07', 70.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (4, 2, 'Estacionamento', '2023-06-08', 10.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (1, 3, 'Troca de óleo', '2023-06-09', 50.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (2, 1, 'Limpeza interna', '2023-06-10', 30.00);


CREATE TABLE IF NOT EXISTS  Marca (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255)
);

-- INSERT INTO Marca (nome)
-- VALUES ('Volkswagen');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Chevrolet');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Ford');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Toyota');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Honda');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Hyundai');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Renault');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Fiat');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Nissan');
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Mercedes-Benz');



CREATE TABLE IF NOT EXISTS  Modelo (
    id SERIAL PRIMARY KEY,
    id_marca BIGINT REFERENCES Marca(id),
    nome VARCHAR(255)
);


-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Volkswagen'), 'Gol'),
--        ((SELECT id FROM Marca WHERE nome = 'Volkswagen'), 'Polo');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Chevrolet'), 'Onix'),
--        ((SELECT id FROM Marca WHERE nome = 'Chevrolet'), 'Cruze');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Ford'), 'Ka'),
--        ((SELECT id FROM Marca WHERE nome = 'Ford'), 'Fiesta');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Toyota'), 'Corolla'),
--        ((SELECT id FROM Marca WHERE nome = 'Toyota'), 'Hilux');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Honda'), 'Civic'),
--        ((SELECT id FROM Marca WHERE nome = 'Honda'), 'HR-V');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Hyundai'), 'HB20'),
--        ((SELECT id FROM Marca WHERE nome = 'Hyundai'), 'Creta');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Renault'), 'Kwid'),
--        ((SELECT id FROM Marca WHERE nome = 'Renault'), 'Duster');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Fiat'), 'Uno'),
--        ((SELECT id FROM Marca WHERE nome = 'Fiat'), 'Toro');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Nissan'), 'March'),
--        ((SELECT id FROM Marca WHERE nome = 'Nissan'), 'Kicks');
-- 
-- INSERT INTO Modelo (id_marca, nome)
-- VALUES ((SELECT id FROM Marca WHERE nome = 'Mercedes-Benz'), 'Classe C'),
--        ((SELECT id FROM Marca WHERE nome = 'Mercedes-Benz'), 'Classe E');