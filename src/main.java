import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        Pessoas pessoa1 = new Pessoas();
        Pessoas pessoa2 = new Pessoas();
        Pessoas pessoa3 = new Pessoas();
        Pessoas pessoa4 = new Pessoas();

        pessoa1.setNome("João");
        pessoa2.setNome("Miguel");
        pessoa3.setNome("Maria");
        pessoa4.setNome("Lucas");

        List<String> listaDeApelidos1 = new ArrayList<>();
        listaDeApelidos1.add("Juan");
        listaDeApelidos1.add("Fissura");
        listaDeApelidos1.add("Maromba");

        List<String> listaDeApelidos2 = new ArrayList<>();
        listaDeApelidos2.add("Night Watch");
        listaDeApelidos2.add("Bruce Wayne");
        listaDeApelidos2.add("Tampinha");

        List<String> listaDeApelidos3 = new ArrayList<>();
        listaDeApelidos3.add("Wonder Woman");
        listaDeApelidos3.add("Mary");
        listaDeApelidos3.add("Marilene");

        List<String> listaDeApelidos4 = new ArrayList<>();
        listaDeApelidos4.add("Lukinha");
        listaDeApelidos4.add("Jeorge");
        listaDeApelidos4.add("George");

        Map<String, List> apelidos = new HashMap<>();
        apelidos.put(pessoa1.getNome(),listaDeApelidos1);
        apelidos.put(pessoa2.getNome(),listaDeApelidos2);
        apelidos.put(pessoa3.getNome(),listaDeApelidos3);
        apelidos.put(pessoa4.getNome(),listaDeApelidos4);

        System.out.println("_____________________________________________");
        System.out.println("Existem "+apelidos.size()+" Pessoas, nesta lista de Apelidos");
        System.out.println("_____________________________________________");

        for (String chaveNome : apelidos.keySet()) {
            List pessoa = apelidos.get(chaveNome);
            String pessoaEApelidos = chaveNome + " - " + pessoa;
            System.out.println(pessoaEApelidos);
        }
        System.out.println("_____________________________________________");



    }
}
