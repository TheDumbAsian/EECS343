/**
 * Quine - a class with two method A and B such that the class prints the source code of itself, 
 *          and A and B print each other.
 */
public class Quine {

    /**
     * This method prints the start of the class, start of the main function, the string that contains the partial source code, and then the rest of this method; <p>
     * Then this method invokes B() to print method A, and then invokes A() to print B; <p>
     * And finally print the close brackets.
     * @param args - no args needed
     */
    public static void main(String[] args) {
        String[] sourceOfMain = {
            "public class Quine {",
            "   public static void main(String[] args) {",
            "       String[] sourceOfMain = {",
            "           ",
            "       }",
            "       char q = 34;",
            "       for (int i = 0; i < 3; i++) {",
            "           System.out.println(sourceOfMain[i]);",
            "       }",
            "       for (String line : sourceOfMain) {",
            "           System.out.println(sourceOfMain[3] + q + line + q);",
            "       }",
            "       for (int i = 3; i < 21; i++) {",
            "           System.out.println(sourceOfMain[i]);",
            "       }",
            "       B();",
            "       A();",
            "       for (int i = 21; i < sourceOfMain.length; i++) {",
            "           System.out.println(sourceOfMain[i]);",
            "       }",
            "   }",
            "   ",
            "}"
        };

        char q = 34;
        for (int i = 0; i < 3; i++) {
            System.out.println(sourceOfMain[i]);
        }
        for (String line : sourceOfMain) {
            System.out.println(sourceOfMain[3] + q + line + q);
        }
        for (int i = 3; i < 21; i++) {
            System.out.println(sourceOfMain[i]);
        }
        B();
        A();
        for (int i = 21; i < sourceOfMain.length; i++) {
            System.out.println(sourceOfMain[i]);
        }

    }

    /**
     * Print method {@code Quine.B}
     */
    public static void A(){

        String[] sourceOfA = {
            "   public static void A(){",
            "      String sourceOfA = {",
            "          ",
            "      };",
            "      String sourceOfB = {",
            "          ",
            "      };",
            "      char q = 34;",
            "      for (int i = 0; i < 2; i++) {",
            "          System.out.println(sourceOfB[i]);",
            "      }",
            "      for (String line : sourceOfA) {",
            "          System.out.println(sourceOfB[2] + q + line + q);",
            "      }",
            "      for (int i = 3; i < 5; i++) {",
            "          System.out.println(sourceOfB[i]);",
            "      }",
            "      for (String line : sourceOfB) {",
            "          System.out.println(sourceOfB[5] + q + line + q);",
            "      }",
            "      for (int i = 6; i < sourceOfB.length; i++) {",
            "          System.out.println(sourceOfB[i]);",
            "      }",
            "   }"
        };

        String[] sourceOfB = {
            "   public static void B(){",
            "      String sourceOfA = {",
            "          ",
            "      };",
            "      String sourceOfB = {",
            "          ",
            "      };",
            "      char q = 34;",
            "      for (int i = 0; i < 2; i++) {",
            "          System.out.println(sourceOfA[i]);",
            "      }",
            "      for (String line : sourceOfA) {",
            "          System.out.println(sourceOfA[2] + q + line + q);",
            "      }",
            "      for (int i = 3; i < 5; i++) {",
            "          System.out.println(sourceOfA[i]);",
            "      }",
            "      for (String line : sourceOfB) {",
            "          System.out.println(sourceOfA[5] + q + line + q);",
            "      }",
            "      for (int i = 6; i < sourceOfB.length; i++) {",
            "          System.out.println(sourceOfA[i]);",
            "      }",
            "   }"
        };

        char q = 34;
        for (int i = 0; i < 2; i++) {
            System.out.println(sourceOfB[i]);
        }
        for (String line : sourceOfA) {
            System.out.println(sourceOfB[2] + q + line + q);
        }
        for (int i = 3; i < 5; i++) {
            System.out.println(sourceOfB[i]);
        }
        for (String line : sourceOfB) {
            System.out.println(sourceOfB[5] + q + line + q);
        }
        for (int i = 6; i < sourceOfB.length; i++) {
            System.out.println(sourceOfB[i]);
        }
    }

    /**
     * Print method {@code Quine.A}
     */
    public static void B(){

        String[] sourceOfA = {
            "   public static void A(){",
            "      String sourceOfA = {",
            "          ",
            "      };",
            "      String sourceOfB = {",
            "          ",
            "      };",
            "      char q = 34;",
            "      for (int i = 0; i < 2; i++) {",
            "          System.out.println(sourceOfB[i]);",
            "      }",
            "      for (String line : sourceOfA) {",
            "          System.out.println(sourceOfB[2] + q + line + q);",
            "      }",
            "      for (int i = 3; i < 5; i++) {",
            "          System.out.println(sourceOfB[i]);",
            "      }",
            "      for (String line : sourceOfB) {",
            "          System.out.println(sourceOfB[5] + q + line + q);",
            "      }",
            "      for (int i = 6; i < sourceOfB.length; i++) {",
            "          System.out.println(sourceOfB[i]);",
            "      }",
            "   }"
        };

        String[] sourceOfB = {
            "   public static void B(){",
            "      String sourceOfA = {",
            "          ",
            "      };",
            "      String sourceOfB = {",
            "          ",
            "      };",
            "      char q = 34;",
            "      for (int i = 0; i < 2; i++) {",
            "          System.out.println(sourceOfA[i]);",
            "      }",
            "      for (String line : sourceOfA) {",
            "          System.out.println(sourceOfA[2] + q + line + q);",
            "      }",
            "      for (int i = 3; i < 5; i++) {",
            "          System.out.println(sourceOfA[i]);",
            "      }",
            "      for (String line : sourceOfB) {",
            "          System.out.println(sourceOfA[5] + q + line + q);",
            "      }",
            "      for (int i = 6; i < sourceOfB.length; i++) {",
            "          System.out.println(sourceOfA[i]);",
            "      }",
            "   }"
        };
        
        char q = 34;
        for (int i = 0; i < 2; i++) {
            System.out.println(sourceOfA[i]);
        }
        for (String line : sourceOfA) {
            System.out.println(sourceOfA[2] + q + line + q);
        }
        for (int i = 3; i < 5; i++) {
            System.out.println(sourceOfA[i]);
        }
        for (String line : sourceOfB) {
            System.out.println(sourceOfA[5] + q + line + q);
        }
        for (int i = 6; i < sourceOfB.length; i++) {
            System.out.println(sourceOfA[i]);
        }
    }
}