import java.util.ArrayList;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        char ch = firstNonRepeatingUsingStringArray("jjavva iis suuppj");
        if (ch == ' '){
            System.out.println("All characters are repeated");}
        else{
            System.out.println("First non repeating character" + ch);
    }

}
    private static char firstNonRepeatingUsingStringArray(String userString) {
        ArrayList<Character> characters = new ArrayList<Character>();

        for (int i = 0; i < userString.length(); i++) {
            System.out.println(userString.charAt(i));
            System.out.println(userString.substring(i + 1));
            System.out.println(characters);
            boolean abc=(userString.substring(i + 1).contains(userString.charAt(i) +""));
            System.out.println();
            if (!(userString.substring(i + 1).contains(userString.charAt(i) + "") || characters.contains(userString.charAt(i))) ){
                return userString.charAt(i);
            } else {
                characters.add(userString.charAt(i));
            }
        }
return ' ';
    }
}