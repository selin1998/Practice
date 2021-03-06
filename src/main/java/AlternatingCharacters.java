import java.util.stream.IntStream;

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int counter=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                counter++;
            }
        }
        return counter;
    }

    static int alternatingCharacters2(String s) {
        int [] counter={0};
        IntStream.range(1,s.length()).boxed().forEach(i->{
            if(s.charAt(i)==s.charAt(i-1)) counter[0]++;
        });
        return counter[0];
    }
    public static void main(String[] args) {

        System.out.println(alternatingCharacters("ABABAB"));
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
        System.out.println(alternatingCharacters2("ABABAB"));
        System.out.println(alternatingCharacters2("AAAA"));
        System.out.println(alternatingCharacters2("BBBBB"));
        System.out.println(alternatingCharacters2("BABABA"));
        System.out.println(alternatingCharacters2("AAABBB"));
    }
}
