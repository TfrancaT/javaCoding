Create Database arquivo;
use arquivo;

Create Table Pessoa(
	idPessoa Int Primary Key Not Null,
    nomePessoa Varchar(30) Not Null,
    cpfPessoa Varchar(11) Not Null
);

Create Table Telefone(
	idTelefone Int Primary Key Not Null,
    cttTelefone Varchar(11) Not Null,
    idPessoa Int Not Null,
    
    Constraint fk_Pessoa_Telefone Foreign Key (idPessoa) references Pessoa (idPessoa)
);

Insert Into Pessoa Values ('1', 'Ciclano Bomba', '11111111111');
Insert Into Telefone Values ('1', '71911111111', '1');