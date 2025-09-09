// RevStrWarmup.java
// dB 9/09/27
public class RevStrWarmUp {
    public static void main(String[] args) {

        // Create a program that reverses a string using a for loop

        String str = "Hello reverse!";
        String result = "";

        for (int i = str.length()-1; i>=0; i--)
            result+=str.charAt(i);

        System.out.println(result);

        // Create a program that reverses a string using a for loop

        // there is mo input in this program, everything is hard coded
        // processing is: Decrementing a for loop, finding the length of the string
        // create a new string
        // with the end characters at the end of the string

        String myStr = "abcdefghijk";
        String myRevStr = "";

        int strLength = myStr.length();

        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 11 is " + myStr.charAt(10) );

        for (int i = (strLength-1); i >= 0; i--){
            System.out.println("\n the char at " + i + " is " + myStr.charAt(i));
            myRevStr = myRevStr + myStr.charAt(i);
        }
        System.out.println("\n myRevStr is: " + myRevStr + "\n\n");
    }
}

