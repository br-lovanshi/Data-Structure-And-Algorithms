public class PalindromNum {
    public static void main(String[] args) {
        int n = 121;
        boolean isPalindrome = isPalindrome(n);
        if (isPalindrome) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
        String str = "";
        str += "3";
        str += "4";
        System.out.println(str);
    }

    public static boolean isPalindrome(int n){
        int originalNum = n;
        int reverseNum = 0;
        while(n >0){
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        return reverseNum == originalNum;
    }

    public static boolean isPalindromeStr(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
        }
        
        return true;}

        public static boolean isPalindromeStrRec(int x){
  
        String str = Integer.toString(x);
        String reverString = "";
        for(int i = str.length()-1; i>=0; i--){
            reverString += str.charAt(i);
        }
        System.out.println("Str " + str + "\n Reverse " + reverString);
        return str.equals(reverString);

        }
}
