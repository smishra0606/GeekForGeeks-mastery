class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // The rightmost element is always a leader
        int max = arr[n - 1];
        result.add(max);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                result.add(max);
            }
        }

        // Reverse to maintain original order
        Collections.reverse(result);
        return result;
    }
}
