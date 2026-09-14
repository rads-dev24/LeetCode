class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sortedStr = new String( chArr); // String from char Array 
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>( map.values());
    }
}