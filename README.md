# 🍃 Conexão Java & MongoDB Atlas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

Este repositório contém a infraestrutura e os códigos-fonte necessários para estabelecer uma conexão segura e eficiente entre uma aplicação Java e um banco de dados NoSQL hospedado no MongoDB Atlas. O projeto utiliza o Maven para o gerenciamento de dependências e demonstra a configuração básica do `MongoClient`.

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter as seguintes ferramentas instaladas:
- **Java Development Kit (JDK)** atualizado.
- **Apache Maven** para gerenciamento dos pacotes.
- Uma IDE de sua preferência (recomendado: **IntelliJ IDEA** ou **Visual Studio Code**).
- Conta ativa no **MongoDB Atlas** com um cluster configurado.

## 📁 Arquitetura do Repositório

O projeto está modularizado para separar a configuração do banco da lógica da aplicação:

```text
📦 MongoDB
 ┣ 📂 Cluster-MongoDB
 ┃ ┗ 📜 Instruções de acesso e string de conexão (Terminal/Mongo Shell)
 ┗ 📂 Java-MongoDB
   ┣ 📜 pom.xml (Dependências do driver oficial do MongoDB)
   ┗ 📂 src/main/java
     ┗ 📜 Classes Java (Implementação da conexão e operações básicas)
