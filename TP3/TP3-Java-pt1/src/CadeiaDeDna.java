import java.util.Random;

public class CadeiaDeDna {
    public static void gerarCadeiaDeDna(int tamanho){
        String[] ArrayDna1 = new String[tamanho];
        String[] ArrayDna2 = new String[tamanho];
        String[] Proteina = {"A", "C", "G", "T"};
        Random gerador = new Random();
        for (int i = 0; i < ArrayDna1.length; i++) {
            ArrayDna1[i] = Proteina[gerador.nextInt(4)];
        }
        for (int i = 0; i < ArrayDna2.length; i++) {
            ArrayDna2[i] = Proteina[gerador.nextInt(4)];
        }
        AlgoritmosGeneticos.recombinacao(tamanho, ArrayDna1, ArrayDna2);
    }
}
