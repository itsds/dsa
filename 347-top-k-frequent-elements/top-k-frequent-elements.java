class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> hm = new HashMap();

    for(int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

    List<Integer>[] freq = new ArrayList[nums.length + 1];

    for(Map.Entry<Integer,Integer> entries : hm.entrySet()){
        int key = entries.getKey();
        int value= entries.getValue();

        if(freq[value]==null){
            freq[value]=new ArrayList();
        }
        freq[value].add(key);
       // freq[value].add(key);
    }

    int[] res = new int[k];
    int ind=0;

    for(int i = freq.length - 1; i >= 0; i--) {
        if(freq[i] != null){
            for(int num : freq[i]){
                res[ind++] = num;
                if(ind == k) {
                    return res;
                }
            }
        }
    }

     return new int[0];

    }
}