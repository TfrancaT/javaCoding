CREATE TABLE Farmacia(
	CNPJ_Farmacia NUMERIC(14) PRIMARY KEY NOT NULL,
    nome_Farmacia VARCHAR(45),
    ctt_Farmacia NUMERIC(14),
    enderecoFarmacia VARCHAR(45)
);

CREATE TABLE Produto(
	codigoProduto INT PRIMARY KEY NOT NULL,
    valorProduto DECIMAL,
    quantidadeProduto INT
);

CREATE TABLE Farmaceutico(
	rgFarmaceutico INT PRIMARY KEY NOT NULL, 
    nomeFarmaceutico VARCHAR(45) 
);