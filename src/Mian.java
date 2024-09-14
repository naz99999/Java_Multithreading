import java.util.ArrayList;
import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {
        String s = "99999-9999-99";
        String[] sp =  s.split("-");
        System.out.println(Arrays.toString(sp));

        if(Integer.parseInt(sp[0]) > 9999) {
            System.out.println("no");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 8; i < 100; i++) {
            if (!(i%2==0 || i%3==0 || i%5==0 || i%7==0)) {
                arrayList.add(i);
            }
            if (arrayList.size() > 9) {
                break;
            }
        }
        System.out.println(arrayList);
    }
}
