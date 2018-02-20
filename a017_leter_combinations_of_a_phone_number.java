class Solution {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if (digits != null && digits.length() != 0) {
            combination("", digits, 0, ret);
        }
        return ret;
    }

    private void combination(String prefix, String digits, int offset, List<String> ret) {
        if (offset == digits.length()) {
            ret.add(prefix);
            return;
        }
        String letters = KEYS[digits.charAt(offset) - '0'];
        for (char c : letters.toCharArray()) {
            combination(prefix + c, digits, offset + 1, ret);
        }
    }
}