public class Problem4 {

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {result += array[i];}
        return result;
    }

    public boolean isPalindrome(int number) {
        String str_number = new String();
        str_number = String.valueOf(number);

        String first_part = str_number.substring(0, str_number.length() / 2);
        String second_part = str_number.substring(str_number.length() / 2 + str_number.length() % 2);

        if (first_part.equals(reverseString(second_part))) {return true;}
        return false;
    }

    public void solve() {
        int result = Integer.MIN_VALUE;

        for (int i = 100; i < 999; i++) {
            for (int j = 100; j <= i; j++) {
                if (i * j > result && isPalindrome(i * j)) {result = i * j;}
            }
        }

        System.out.println(result);
    }
}
