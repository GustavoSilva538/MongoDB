import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Principal {
    public static void main(String[] args) {
        MongoClient cliente = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase bancoDeDados = cliente.getDatabase("test");
        MongoCollection<Document> alunos = bancoDeDados.getCollection("alunos");

        try {
            System.out.println("Testando a conexão...");

            for (String nomeDoBanco : cliente.listDatabaseNames()) {
                System.out.println("Banco encontrado: " + nomeDoBanco);
            }

            System.out.println("Conexão estabelecida com sucesso!");
        } catch (Exception e) {
            System.out.println("Falha na conexão: Verifique se o servidor do MongoDB está rodando na sua máquina.");
        }

        Document aluno = alunos.find().first();
        System.out.println("Aluno encontrado: " + aluno);

        //Inserindo Valores

        /*
        Document novoAluno = new Document("nome", "João")
                .append("dataNascimento", new Date(2003,10,10))
                .append("curso", new Document("nome", "Historia"))
                .append("notas", Arrays.asList(10,9,8));

        alunos.insertOne(novoAluno);

         */



        //Fazendo o update

        /*
        alunos.updateOne(Filters.eq("nome","João"),new Document("$set",new Document("nome","João Silva")));
         */

        //O Filters.eq(), serve para filtrar um valor igual (.eq)



        //Fazendo o deleteOne

        /*
        alunos.deleteOne(Filters.eq("nome","João Silva"));
         */



        cliente.close();

    }



}