import java.util.Arrays;
import java.util.Objects;

public class Metodos {
        public boolean VerificarPalindromo(String string){
//            Forma 1
//            int contador = 0;
//            int j = 0;
//            for(int i = string.length() - 1; i >= 0; i--){
//                if (string.charAt(i) == string.charAt(j)){
//                    contador++;
//                }
//                j++;
//            }
//            Forma 2 utilizando break e dois for
            int contador = 0;
            int indice = 0;
            for(int i = string.length() - 1; i >= 0; i--){
                for (int j = indice; j < string.length(); j++) {
                    if (string.charAt(i) == string.charAt(j)){
                        contador++;
                    }
                    indice++;
                    break;
                }
            }
            if (contador == string.length()) {
                return true;
            }else {
                return false;
            }

        }
        public int ContarDigitos(String string) {

            int contador = 0;

            for (int i = 0; i < string.length(); i++) {
                char a = string.charAt(i);
                if (Character.isDigit(a)){
                    contador++;
                }
            }
            return contador;
        }

        public String ReescreverNumeros(int numeros){
            String[] numerosEscritos = {"zero,", "um,","dois,","tres,","quatro,","cinco,","seis,","sete,","oito,","nove,"};
            String stgnuemros = Integer.toString(numeros);
            int[] numerosArray = new int[stgnuemros.length()];
            String convertido = "";
            for (int i = 0; i < stgnuemros.length(); i++){
                numerosArray[i] = Character.getNumericValue(stgnuemros.charAt(i));
            }
            for (int i = 0; i < stgnuemros.length(); i++) {
                for (int j = 0; j < numerosEscritos.length; j++) {
                    if (numerosArray[i] == j){
                        convertido += (numerosEscritos[j] + " ");
                    }
                }
            }
            return convertido;
        }

        public String PegarIniciais(String nome){
        nome = nome.toLowerCase();
        StringBuilder iniciais = new StringBuilder();
        String[] ArrString = nome.split(" ");
        String[] conectores = {"e","do","da","dos","das","de","di","du"};
            for (int i = 0; i < ArrString.length; i++) {
                for (int j = 0; j < conectores.length; j++) {
                    if (Objects.equals(ArrString[i], conectores[j])){
                        ArrString[i] = ArrString[i].replace(conectores[j],"");
//                        ArrString[i] = "";
                    }
                }
            }
            for (String a :
                    ArrString) {
                if (!Objects.equals(a,"")){
                    iniciais.append(a.toUpperCase().charAt(0));
                }
            }
            return iniciais.toString();
        }

        public int ContarVogais(String string){
            char[] vogais = {'a','e','i','o','u'};
            int contador = 0;
            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < vogais.length; j++) {
                    if (string.charAt(i) == vogais[j]){
                        contador++;
                    }
                }
            }
            return contador;
        }
}
