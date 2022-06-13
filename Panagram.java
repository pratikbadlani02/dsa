import java.util.HashSet;

public class Panagram {
    public static int solve(String[] A) {
         int sum =0;
        HashSet<Character> sol = new HashSet<>();
        for (String s : A) {
            
            s=s.toLowerCase();
            for(int i=0;i<s.length();i++){
                sol.add(s.charAt(i));
            }
            if (sol.size()==26){
                sum=1;
                break;
            }
        }
        return sum;
    }

    public static void main(String args[]) {

        String[] test = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        System.out.println(solve(test));
    }
}