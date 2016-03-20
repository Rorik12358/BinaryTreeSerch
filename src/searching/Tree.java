package searching;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by R2-D2 on 20.03.2016.
 */
public class Tree {
    // Make up binary tree:
    /*
                   15
           12              17
       7      13       16     18
    5            14              20

    Imagine tree like array: where root with index i=0, and go left 2i+1 and go right 2i + 2
     */
    private static Integer[] tree = {15,12,17,7,13,16,18,5,null,null,14,null,null,null,20,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,};


    public static Integer[] getTree() {
        return tree;
    }
    static StringBuilder output = new StringBuilder("founded: ");

    public static void search(Integer num, int i){
        try {
            if (tree[i].equals(num)) {
                System.out.println(output);
                output.substring(0, 9);
            } else if (tree[i].compareTo(num) > 0) {
                i = 2 * i + 1;
                output.append("go left, ");
                search(num, i);
            } else {
                i = 2 * i + 2;
                output.append("go right, ");
                search(num, i);
            }
        }catch (NullPointerException e){
            System.out.println("There no this element");
        }

    }
}
