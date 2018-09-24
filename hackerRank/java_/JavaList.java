package java_;

import java.util.*;

// https://www.hackerrank.com/challenges/java-list/problem
public class JavaList {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] elems = sc.nextLine().split(" ");
        List<String> elemList = new ArrayList<>(n);
        elemList.addAll(Arrays.asList(elems));

        int q = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < q; i++) {
            String typeAction = sc.nextLine();
            if (typeAction.equals("Insert")) {
                String[] s = sc.nextLine().split(" ");
                elemList.add(Integer.parseInt(s[0]), s[1]);
            } else if (typeAction.equals("Delete")) {
                int idx = Integer.parseInt(sc.nextLine());
                elemList.remove(idx);
            }
        }
        System.out.println(String.join(" ", elemList));
    }

}
