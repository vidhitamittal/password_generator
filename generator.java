import java.util.*;

public class generator {
    
    public static String generate() {
        Random rand = new Random();
        String str = " ";
        
        for (int i = 0; i < 6; i++) {
            str += (char) (rand.nextInt(26) + 97); // lowercase letter
            str += (char) (rand.nextInt(26) + 65); // uppercase letter
            str += (char) (rand.nextInt(10) + 48); // digit
            str += (char) (rand.nextInt(15) + 33); // special character
        }
        
        List<String> characters = new ArrayList<String>(Arrays.asList(str.split(" ")));
        Collections.shuffle(characters);
        String pass = characters.toString();
        return pass;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How long do you want the password to be? ");
        int length = sc.nextInt();
        sc.close();
        String result = generate();
        System.out.println(result.substring(0, length));
    }
}
