package tabelaannotation;

/**
 *
 * @author bielf
 */
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // Obtenha a classe anotada
        Class<MinhaClasse> clazz = MinhaClasse.class;

        // Verifique se a classe está anotada com @Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {
            // Obtenha a annotation
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            
            // Leia o valor da annotation
            String nomeDaTabela = tabelaAnnotation.valor();
            
            // Imprima o nome da tabela
            System.out.println("Nome da Tabela: " + nomeDaTabela);
        } else {
            System.out.println("A classe não está anotada com @Tabela.");
        }
    }
}
