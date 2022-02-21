package App.desafio3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class desafioAnagrama {
    /**
     * @author Ricardo Muraoka
     * @version 1.0.0
     */
    public static int countAnagrams(String ana) {

        HashMap<String, Integer> map = new HashMap<>();
        int totalCount = 0;

        // Gerando strings de strings
        for(int i = 0 ; i < ana.length(); i++){
            for(int j=i+1 ; j <= ana.length(); j++){

                String stringAtual = ana.substring(i,j);

                // Ordenando strings
                char[] stringCheck = stringAtual.toCharArray();
                Arrays.sort(stringCheck);
                stringAtual = String.valueOf(stringCheck);

                // Se a string ordenada já tiver sido vista
                if(map.containsKey(stringAtual)) {
                    // Quantas vezes já foram vistas e adicionando
                    int count = map.getOrDefault(stringAtual, 0);
                    totalCount += count;
                    map.merge(stringAtual, 1, Integer::sum);
                } else {
                    // Caso não tenha sido vista, indicar que já foi vista
                    map.put(stringAtual, 1);
                }
            }
        }
        return totalCount;
    }
}

