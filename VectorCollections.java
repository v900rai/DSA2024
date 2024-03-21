package CollectionsFramework;

import java.util.Collections;
import java.util.Vector;

public class VectorCollections {
    public static void main(String []args){
        Vector<Integer> v=new Vector<>();

        // adding values to the Vector
        v.add(7);
        v.add(50);
        v.add(0);
        v.add(67);
        v.add(98);

        // finding the largest element
        int n = Collections.max(v);

        // printing the largest element
        System.out.println(
                "The maximum value present in Vector is : "
                        + n);
    }
}
