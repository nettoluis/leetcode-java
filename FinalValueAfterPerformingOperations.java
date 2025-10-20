class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '-') {
                --value;
            } else {
                ++value;
            }
        }

        return value;
    }
}
