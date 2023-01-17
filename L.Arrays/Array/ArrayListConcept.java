package L.Array;

import java.util.ArrayList;

public class ArrayListConcept {
    static void XYZ(){
        ArrayList arrayList =new ArrayList();
        arrayList.add(100);
        arrayList.add(true);
        arrayList.add('f');
        arrayList.add("Tester");
        arrayList.add(12.32);
        arrayList.add(123.45f);
        arrayList.add("fnjksdf");

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.size());
    }

    public static void main(String[] args) {
        XYZ();
    }
}
