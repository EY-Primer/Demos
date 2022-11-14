public class Driver {

    public static void main(String[] args) {

        //we want to swap these two variables without using a third variable
        //why? literally no reason unless you're in an interview
        int x = 10;
        int y = 15;

        System.out.println("x is equal to " + x + ". y is equal to " + y);

        x += y; //x is now equal to the total of the two numbers
        y = x - y; //y is now equal 10 (25 - 15) (total - y)
        x -= y; //x is now equal 15 (25 - 10) (total - y)

        System.out.println("x is equal to " + x + ". y is equal to " + y);

        //This one is kind of a thinker.
        //You have to mentally store the value of each variable as you do each step
        //which I guess is why interviewers like this one. To see you critically think to solve problems

        System.out.println("==================================");

        detectPalindromeSB("car");
        detectPalindromeSB("racecar");

        detectPalindromeWithoutSB("hello");
        detectPalindromeWithoutSB("helloolleh");

    }

    //a palindrome is a word that reads the same forward and backward
    //essentially, we need to take a string, reverse it, and see if the reverse equals the original string

    //there are two ways to do this, the easiest is by using a StringBuilder
    //sometimes, interviewers won't let you do that. In which case, we need to manually reverse the String

    //detect palindrome with StringBuilder
    public static void detectPalindromeSB(String s){

        StringBuilder sb = new StringBuilder(s); //create a StringBuilder based on the input

        sb.reverse(); //reverse it

        String reverse = sb.toString(); //make a String variable to hold the reversed String

        //control flow to tell the user whether the String is a palindrome
        //or literally, to check if the reversed String is equal to the original String
        if(reverse.equals(s)){
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is NOT a palindrome");
        }

    }

    //detect palindrome without StringBuilder
    public static void detectPalindromeWithoutSB(String s){

        String reverse = ""; //This String will hold the reversed input

        //we have to iterate through the input, from the last index to the first index
        for(int i = s.length() - 1; i >= 0; i--){

             //this temporary char will hold each character as we iterate through the String...
             char temp = s.charAt(i);

             //we'll append each char to this variable, eventually leaving us with a reverse of the input
            reverse += temp;

        }

        //same control flow as above
        if(reverse.equals(s)){
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is NOT a palindrome");
        }

    }
}
