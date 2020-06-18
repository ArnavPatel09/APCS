package myfirstpackage;


public class Board {

   public static String printBoard(String[][] h, String[][] cs, String[][] m, String[][] s, String[][] g){
       String board = " __________________________________________________________________________________________________________________\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |       History        |       Computer       |     Mathematics      |        Sports        |       Geography      |\n" +
               "   |                      |       Science        |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |______________________|______________________|______________________|______________________|______________________|\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |         "+h[0][0]+"          |         "+cs[0][0]+"          |         "+m[0][0]+"          |         "+s[0][0]+"          |         "+g[0][0]+"          |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |______________________|______________________|______________________|______________________|______________________|\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |         "+h[1][0]+"          |         "+cs[1][0]+"          |         "+m[1][0]+"          |         "+s[1][0]+"          |         "+g[1][0]+"          |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |______________________|______________________|______________________|______________________|______________________|\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |         "+h[2][0]+"          |         "+cs[2][0]+"          |         "+m[2][0]+"          |         "+s[2][0]+"          |         "+g[2][0]+"          |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |______________________|______________________|______________________|______________________|______________________|\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |         "+h[3][0]+"          |         "+cs[3][0]+"          |         "+m[3][0]+"          |         "+s[3][0]+"          |         "+g[3][0]+"          |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |______________________|______________________|______________________|______________________|______________________|\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |         "+h[4][0]+"          |         "+cs[4][0]+"          |         "+m[4][0]+"          |         "+s[4][0]+"          |         "+g[4][0]+"          |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |                      |                      |                      |                      |                      |\n" +
               "   |______________________|______________________|______________________|______________________|______________________|";
       return board;
   }
}
