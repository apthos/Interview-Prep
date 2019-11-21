class Solution {
    /*
    Runtime: 7 ms
    Time complexity: O(n)
    Space complexity: O()
    */
    public int maxNumberOfBalloons(String text) {
        //Map to store the amount of times each letter from balloon is seen
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        //Count amount of letters from balloon in text
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            }
        }
        
        //Create balloons until the map runs out of a necessary character to create balloon
        int count = 0;
        while((map.get('b') > 0) && (map.get('a') > 0) && (map.get('l') > 1) && (map.get('o') > 1) && map.get('n') > 0) {
            map.replace('b', map.get('b') - 1);
            map.replace('a', map.get('a') - 1); 
            map.replace('l', map.get('l') - 2); 
            map.replace('o', map.get('o') - 2); 
            map.replace('n', map.get('n') - 1);
            count++;
        }
        
        return count;
    }
}