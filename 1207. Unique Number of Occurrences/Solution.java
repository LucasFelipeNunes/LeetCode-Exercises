import java.util.HashMap;

class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> ocorrencias = new HashMap<Integer, Integer>();
        
        for(int i = 0;i < arr.length;i++){
            Integer valor = ocorrencias.get(arr[i]);
            ocorrencias.put(arr[i], valor != null ? ++valor : 1);
        }
        
        for(int i : ocorrencias.keySet()){
            for(int j : ocorrencias.keySet()){
                if(ocorrencias.get(i) == ocorrencias.get(j) && i != j){
                    return false;
                }
            }
        }
        
        return true;
    }
}
