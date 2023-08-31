use dbDepartamento;

CREATE TABLE tabDepartamento(
	departamentoCodigo INT PRIMARY KEY NOT NULL,
    departamentoNome VARCHAR(30)
);

CREATE TABLE tabFuncionario(
	funcionarioCodigo INT PRIMARY KEY NOT NULL,
    departamentoCodigo INT,
    funcionarioNome VARCHAR(30),
    funcionarioNascimento DATE,
    funcionarioSalario NUMERIC
);

CREATE TABLE tabDependente(
	dependenteCodigo INT PRIMARY KEY NOT NULL,
    funcionarioCodigo INT,
    dependenteNome VARCHAR(30)
);