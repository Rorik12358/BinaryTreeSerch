package searching;

/**
 * Created by R2-D2 on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Make up binary tree:
    /*
                   15
           12              17
       7      13       16     18
    5            14              20

    Imagine tree like array: where root with index i=0, and go left 2i+1 and go right 2i + 2
     */
        Tree.search(20,0);
        Tree.search(15, 0);
    }
}
