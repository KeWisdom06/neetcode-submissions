// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairList){
        List<List<Pair>> listState = new ArrayList<>();
        for(int i = 0; i < pairList.size(); i++){
            for(int j = i; j>0; j--){
                
                if(pairList.get(j-1).key>pairList.get(j).key){
                    Pair temp = pairList.get(j);
                    pairList.set(j, pairList.get(j-1));
                    pairList.set(j-1, temp);
                    

                }
                
                
            }
            List<Pair> dupList = new ArrayList<>(pairList);
            listState.add(dupList);
        
        
        }

        return listState;

    }
}
