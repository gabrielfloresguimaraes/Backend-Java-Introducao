package tabelaannotation;

/**
 *
 * @author bielf
 */
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<MinhaClasse> clazz = MinhaClasse.class;
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.valor());
        } else {
            System.out.println("A classe não possui a annotation Tabela.");
        }
    }
}
