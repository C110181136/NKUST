import java.util.ArrayList;
import java.util.HashSet;

public class underline {
    public static void main(String[] args) {
        ArrayList<String>word1 = new ArrayList<String>();
        int gg;
        String[] num1 ={ "0","0","1","1","1","2","2","3","3","4"};
        HashSet<String>num = new  HashSet<String>();
        for(int d=0; d<num1.length; d++) {
            num.add(num1[d]);
        }
        for(String aa:num){
            word1.add(aa);

        }
        gg = num1.length - num.size();
        for(int c =0; c<gg; c++){
            word1.add("_");
        }
        System.out.println(word1);
    }
}
