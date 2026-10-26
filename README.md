# MongoDB

Este repositório armazena configurações e códigos de exemplo para realizar a conexão com um banco de dados NoSQL MongoDB, utilizando a linguagem Java e o gerenciador de dependências Maven.

## 📁 Estrutura do Repositório

O projeto está organizado em dois diretórios principais:

### 1. `Cluster-MongoDB`
Contém as informações e credenciais para o acesso ao banco de dados em nuvem.
* **String de Conexão:** Link estruturado para acesso direto ao cluster através do terminal (CMD/Mongo Shell).
* **Credenciais:** Arquivos de texto contendo a senha e outras informações de autenticação do cluster.

### 2. `Java-MongoDB`
Diretório contendo o projeto Java configurado para se conectar ao banco.
* **`pom.xml`:** Arquivo de configuração do Maven contendo as dependências essenciais, como o driver oficial do MongoDB para Java.
* **Classes Java:** Códigos-fonte implementando a classe de conexão (`MongoClient`) e demais lógicas de integração.
