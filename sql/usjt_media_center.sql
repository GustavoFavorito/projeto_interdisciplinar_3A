CREATE DATABASE MediaCenter;

USE MediaCenter;

CREATE TABLE Usuario
(
    UsuarioID INT NOT NULL AUTO_INCREMENT,
    Nome VARCHAR(255) NOT NULL,
    Senha VARCHAR(255) NOT NULL,
    TipoUsuarioID INT NOT NULL
)

CREATE TABLE TipoUsuario
(
    TipoUsuarioID INT NOT NULL AUTO_INCREMENT,
    TipoUsuarioDescricao VARCHAR(255) NOT NULL
)

CREATE TABLE TipoArquivo
(
    TipoArquivoID INT NOT NULL AUTO_INCREMENT,
    TipoArquivoDescricao VARCHAR(255)
)

CREATE TABLE Arquivo
(
    ArquivoID INT NOT NULL AUTO_INCREMENT,
    ArquivoExtensao VARCHAR(255) NOT NULL,
    Caminho VARCHAR(255) NOT NULL,
    Nome VARCHAR(255) NOT NULL,
    TipoArquivoID INT NOT NULL
)

CREATE TABLE Tag
(
    TagID INT NOT NULL AUTO_INCREMENT,
    Nome VARCHAR(255) NOT NULL
)

CREATE TABLE Categoria
(
    CategoriaID INT NOT NULL AUTO_INCREMENT,
    CategoriaDescricao VARCHAR(255)
)

CREATE TABLE NivelAcesso
(
    NivelAcessoID INT NOT NULL AUTO_INCREMENT,
    NivelAcessoDescricao VARCHAR(255)
)

CREATE TABLE Procedencia
(
    ProcedenciaID INT NOT NULL AUTO_INCREMENT,
    ProcedenciaDescricao VARCHAR(255) NOT NULL,
    Fonte VARCHAR(255) NOT NULL
)

CREATE TABLE Conteudo
(
    ConteudoID INT NOT NULL AUTO_INCREMENT,
    TagID INT NOT NULL,
    ArquivoID IN NOT NULL,
    UsuarioInclusaoID INT NOT NULL,
    CategoriaID INT NOT NULL,
    NivelAcessoID INT NOT NULL,
    ProcedenciaID INT NOT NULL
)

CREATE TABLE FeedBack
(
    FeedBackID INT NOT NULL AUTO_INCREMENT,
    FeedBackDescricao VARCHAR(255) NOT NULL,
    ConteudoID INT NOT NULL
)