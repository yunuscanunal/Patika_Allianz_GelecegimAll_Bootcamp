public class palindrome {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("abba is " + isPalindrome("abba"));
        System.out.println("kayak is " + isPalindrome("kayak"));
        System.out.println("kavak is " + isPalindrome("kavak"));
        System.out.println("anne is " + isPalindrome("anne"));
        System.out.println("baba is " + isPalindrome("baba"));
    }

}