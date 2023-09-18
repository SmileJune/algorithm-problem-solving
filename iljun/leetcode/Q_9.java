package iljun.leetcode;

import java.util.*;

public class Q_9 {
    public boolean isPalindrome(int x) {
        String input = x + "";
        for(int i = 0; i <= (input.length() / 2); i++) {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
