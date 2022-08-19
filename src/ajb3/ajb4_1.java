package ajb3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ajb4_1 {

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(6);
        a.add(11);
        a.add(21);
        a.add(77);
        a.add(109);
        ArrayList<Integer> b = new ArrayList<Integer>();
//        for(int i = a.size();i>0;i--){
//            b.add(a.get(i-1));
//        }
//        System.out.println(a);
//        System.out.println(b);

        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);

    }

}
