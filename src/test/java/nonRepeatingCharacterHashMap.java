import java.util.HashMap;

public class nonRepeatingCharacterHashMap {

    public static void main(String[] args) {
String str="asdsadasdasdp";
        HashMap<Character,Integer> hMap= new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character currentCharacter=str.charAt(i);
            if(hMap.containsKey(currentCharacter)){
                int currentFreq=hMap.get(currentCharacter);
                currentFreq++;
                hMap.put(currentCharacter,currentFreq);
            }
            else
            {
                hMap.put(currentCharacter,1);
            }
        }
        boolean noRepeatingCharacterFound=false;
        for (int i = 0; i < str.length(); i++) {
            Character currentCharacter = str.charAt(i);
            int currentFreq=hMap.get(currentCharacter);
            System.out.println(currentFreq);
            if(currentFreq==1)
            {
                System.out.println(currentCharacter);
                noRepeatingCharacterFound=true;
                break;
            }
        }
        if(!noRepeatingCharacterFound)
        {
            System.out.println(-1);
        }
    }
}
