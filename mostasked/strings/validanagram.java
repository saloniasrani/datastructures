// approach 1

class Solution {

  public boolean isAnagram(String s, String t) {
    char[] c = s.toCharArray();
    Arrays.sort(c);
    char[] y = t.toCharArray();
    Arrays.sort(y);

    if (Arrays.equals(c, y)) return true; else return false;
  }
}

// approach 2
class Solution {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] checker = new int[26];
    for (int i = 0; i < s.length(); i++) {
      checker[s.charAt(i) - 'a'] += 1;
    }
    for (int i = 0; i < t.length(); i++) {
      checker[t.charAt(i) - 'a'] -= 1;
    }
    for (int num : checker) {
      if (num != 0) return false;
    }
    return true;
  }
}
