import java.util.Scanner;

public class Revision {
        public static void main(String[] args){
            // double score = Math.random() * 100;
            // System.out.println("score is " + score);

            // System.out.println((double) (1 / 2));
            // System.out.println((double) 1 / 2);
            // float f = 34;
            // System.out.println(f);

            Scanner input = new Scanner(System.in);
// double i = Math.pow(2, 3);
// double d = input.nextDouble();
// System.out.println(i);
// System.out.println(d);
boolean even = false;
if (even = true) {
  System.out.println("It is even");
}
// int x = 10;
        // int y = 10;
        // System.out.println((y > 10) && (x-- > 10));
        // System.out.println((y > 10) && (x++ > 10));
        
        // int x;
        // double d = 1.5;
        
        // switch (d) {
        //   case 1.0: x = 1;
        //   case 1.5: x = 2;
        //   case 2.0: x = 3;
        // }
        // System.out.println(Math.round(5.5));
        // System.out.println(Math.round(6.5));
        // System.out.println(Math.rint(3.5));
        // System.out.println(Math.rint(4.5));
        // System.out.println("Java " + 1 + 2 + 3 );
        // System.out.printf("%5.1f", 4.56);
        // System.out.printf("%3.1e", 1234.56);
        // System.out.printf("%7b", true);
        // System.out.printf("%10s", 123456);
        // int i = 3434; double d = 3434;
// System.out.println('A' + 1);
    //     double sum = 0;
    // for (double d = 0; d < 10;) {
    //   d += 0.1;
    //   sum += sum + d;
    // //   System.out.println(sum);
    //   System.out.println(d);
    // }
    // }
    // for ( ;  ; ){
    //     int i = 0;
    //     i += 1;
    //     System.out.println(i);
    //     if (i == 2){
    //         break;
    //     }
    // }
    
    // int i = 0;
    // for (i = 0; i < 10; i++);
    //   System.out.println(i + 4);
    // System.out.println((int)(Math.random() * 100));


    // int[] x = new int[3];
    // System.out.println("x[0] is " + x[0]);
    // char[] charArray = new char[]{'a', 'b'};
    // System.out.println(charArray[0]);
    
    // double[] x = {2.5, 3, 4};
    // for (double value: x)
    //   System.out.print(value + " ");
    
//     int[] x = {120, 200, 016};
//     for (int i = 0; i < x.length; i++)
//       System.out.print(x[i] + " ");
      
//       String[] a = new String [5];
// for (int i = 0; i < a.length; i++)
//       System.out.print(a[i] + " ");

// int[][][] data = {{{1, 2}, {3, 4}},
//       {{5, 6}, {7, 8}}};

//     System.out.print(ttt(data[0]));
//   }

public static int ttt(int[][] m) {
  int v = m[0][0];
  
  for (int i = 0; i < m.length; i++)
    for (int j = 0; j < m[i].length; j++)
      if (v < m[i][j]){
        v = m[i][j];
        System.out.println(v)
      }
 
  return v;
  // for(; ;);
    //   }

            }
}
