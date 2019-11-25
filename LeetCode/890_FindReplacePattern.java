class Solution {
    /*
    Runtime: 2 ms
    Time complexity: O(n^2) (n = words.length = pattern.length)
    Space complexity: O(n)
    */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            HashMap<Character, Character> map = new HashMap<>();
            boolean matches = true; //to check if the word matches the pattern
            for(int j = 0; j < pattern.length(); j++) {
                char letterInWord = words[i].charAt(j);
                char letterInPattern = pattern.charAt(j);
                if(!map.containsKey(letterInWord)) {
                    if(map.containsValue(letterInPattern)) {
                        matches = false;
                    }
                    else {
                        map.put(letterInWord, letterInPattern);
                    }
                }
                else {
                    if(map.get(letterInWord) != letterInPattern) matches = false;
                }
            }
            if(matches) list.add(words[i]);
        }
        return list;
    }
}