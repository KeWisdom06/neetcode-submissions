class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i =0; i<strs.length;i++) {
            char[] sChar = strs[i].toCharArray();
            Arrays.sort(sChar);
            String key = new String(sChar);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
    
}