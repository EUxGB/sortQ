import java.util.Arrays;
public class Main {


    public static void sortQ(int[] a, int first, int last) {
        if (a.length == 0) return ;
        if (first >= last) return ;

        int F = first;
        int L = last;
        int P = F + (L - F) / 2;


        while (F <= L) {
            while ( a[F] < a[P]) F++;
            while (a[L] > a[P]) L--;


            if (F <= L) {
                int temp = a[F];
                a[F] = a[L];
                a[L] = temp;


//                if (F == P) P = L;
//                if (L == P) P = F;
                System.out.println();
                System.out.print(P + "-pivit = " + a[P] + "  [" + F + " " + L + "]");
                System.out.println();
                F++;
                L--;

            }
        }
        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < a.length; i++)
//            System.out.print(a[i]);
        if (first < L) sortQ(a, first, L);
        if (last > F) sortQ(a, F, last);

//            while (F<=L)
//            if (L>first) sortQ(a, first, L);
//            if (F<last) sortQ(a, F, last);


        return ;
    }


    public static void main(String[] args) {

        int[] a = {9, 5, 2, 7, 1, 0, 3, 6, 8, 1};
        System.out.print("0  1  2  3  4  5  6  7  8  9");
        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println();

        //System.out.println("опорный элемент " +a[(int )a.length/2]);


        sortQ(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

//        for(int i=0;i<a.length;i++)
//            System.out.print(a[i]);


    }
}