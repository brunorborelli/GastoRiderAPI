CREATE TABLE IF NOT EXISTS Marca (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Modelo (
    id SERIAL PRIMARY KEY,
    id_marca BIGINT REFERENCES Marca(id),
    nome VARCHAR(255)
);

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

CREATE TABLE IF NOT EXISTS tipo_gastos (
  id SERIAL PRIMARY KEY,
  tipo_gasto VARCHAR(50) NOT NULL,
  descricao VARCHAR(100)
);

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

CREATE TABLE IF NOT EXISTS Gastos (
    id SERIAL PRIMARY KEY,
    id_categoria BIGINT REFERENCES tipo_gastos(id),
    id_carro BIGINT REFERENCES Carro(id),
    descricao VARCHAR(255),
    data VARCHAR(10),
    gasto DECIMAL(10, 2)
);

-- INSERT INTO Usuario (CPF, Nome, Sobrenome, Genero, DataNascimento, DataCadastro, Cidade, Estado, Pais, Email, Senha, CNH, TipoCNH)
-- VALUES
--     ('12345678901', 'João', 'Silva', 'Masculino', '1990-01-01', '2023-06-11', 'São Paulo', 'SP', 'Brasil', 'joao.silva@example.com', 'senha123', '123456789', 'B'),
--     ('98765432101', 'Maria', 'Santos', 'Feminino', '1985-05-15', '2023-06-11', 'Rio de Janeiro', 'RJ', 'Brasil', 'maria.santos@example.com', 'senha456', '987654321', 'AB'),
--     ('54321678901', 'Pedro', 'Ferreira', 'Masculino', '1995-12-10', '2023-06-11', 'Belo Horizonte', 'MG', 'Brasil', 'pedro.ferreira@example.com', 'senha789', '543216789', 'A');
-- 
-- 
-- 
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
-- 
-- 
-- 
-- INSERT INTO Marca (nome)
-- VALUES ('Volkswagen'),
--        ('Chevrolet'),
--        ('Ford'),
--        ('Toyota'),
--        ('Honda'),
--        ('Hyundai'),
--        ('Renault'),
--        ('Fiat'),
--        ('Nissan'),
--        ('Mercedes-Benz');
-- 
-- -- Recupera os IDs das marcas inseridas
-- WITH marca_ids AS (
--   SELECT id, nome FROM Marca
-- )
-- INSERT INTO Modelo (id_marca, nome)
-- SELECT marca_ids.id, 'Gol'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Volkswagen'
-- UNION ALL
-- SELECT marca_ids.id, 'Polo'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Volkswagen'
-- UNION ALL
-- SELECT marca_ids.id, 'Onix'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Chevrolet'
-- UNION ALL
-- SELECT marca_ids.id, 'Cruze'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Chevrolet'
-- UNION ALL
-- SELECT marca_ids.id, 'Ka'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Ford'
-- UNION ALL
-- SELECT marca_ids.id, 'Fiesta'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Ford'
-- UNION ALL
-- SELECT marca_ids.id, 'Corolla'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Toyota'
-- UNION ALL
-- SELECT marca_ids.id, 'Hilux'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Toyota'
-- UNION ALL
-- SELECT marca_ids.id, 'Civic'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Honda'
-- UNION ALL
-- SELECT marca_ids.id, 'HR-V'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Honda'
-- UNION ALL
-- SELECT marca_ids.id, 'HB20'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Hyundai'
-- UNION ALL
-- SELECT marca_ids.id, 'Creta'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Hyundai'
-- UNION ALL
-- SELECT marca_ids.id, 'Kwid'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Renault'
-- UNION ALL
-- SELECT marca_ids.id, 'Duster'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Renault'
-- UNION ALL
-- SELECT marca_ids.id, 'Uno'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Fiat'
-- UNION ALL
-- SELECT marca_ids.id, 'Toro'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Fiat'
-- UNION ALL
-- SELECT marca_ids.id, 'March'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Nissan'
-- UNION ALL
-- SELECT marca_ids.id, 'Kicks'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Nissan'
-- UNION ALL
-- SELECT marca_ids.id, 'Classe C'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Mercedes-Benz'
-- UNION ALL
-- SELECT marca_ids.id, 'Classe E'
-- FROM marca_ids
-- WHERE marca_ids.nome = 'Mercedes-Benz';
-- 
-- 
-- 
-- INSERT INTO Carro (id_usuario, placa, marca, modelo, descricao, tipo_combustivel, km_cadastrado, foto)
-- VALUES (1, 1234, (SELECT id FROM Marca WHERE nome = 'Volkswagen'), (SELECT id FROM Modelo WHERE nome = 'Gol'), 'Fusca 1970', 'Gasolina', 100000, 'fusca.jpg');
-- 
-- INSERT INTO Carro (id_usuario, placa, marca, modelo, descricao, tipo_combustivel, km_cadastrado, foto)
-- VALUES (1, 5678, (SELECT id FROM Marca WHERE nome = 'Chevrolet'), (SELECT id FROM Modelo WHERE nome = 'Onix'), 'Opala 1980', 'Álcool', 150000, 'opala.jpg');
-- 
-- 
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (1, (SELECT id FROM Carro WHERE descricao = 'Fusca 1970'), 'Troca de óleo', '2023-06-01', 50.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (2, (SELECT id FROM Carro WHERE descricao = 'Fusca 1970'), 'Limpeza interna', '2023-06-02', 30.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (3, (SELECT id FROM Carro WHERE descricao = 'Opala 1980'), 'Abastecimento', '2023-06-03', 70.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (4, (SELECT id FROM Carro WHERE descricao = 'Fusca 1970'), 'Estacionamento', '2023-06-04', 10.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (1, (SELECT id FROM Carro WHERE descricao = 'Opala 1980'), 'Troca de óleo', '2023-06-05', 50.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (2, (SELECT id FROM Carro WHERE descricao = 'Fusca 1970'), 'Limpeza interna', '2023-06-06', 30.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (3, (SELECT id FROM Carro WHERE descricao = 'Opala 1980'), 'Abastecimento', '2023-06-07', 70.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (4, (SELECT id FROM Carro WHERE descricao = 'Fusca 1970'), 'Estacionamento', '2023-06-08', 10.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (1, (SELECT id FROM Carro WHERE descricao = 'Opala 1980'), 'Troca de óleo', '2023-06-09', 50.00);
-- 
-- INSERT INTO Gastos (id_categoria, id_carro, descricao, data, gasto)
-- VALUES (2, (SELECT id FROM Carro WHERE descricao = 'Fusca 1970'), 'Limpeza interna', '2023-06-10', 30.00);
