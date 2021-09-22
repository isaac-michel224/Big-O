public class Algorithms {

    //START - we declare three integers (two as parameters)
    public static int add (int a, int b) {
        //c is declared here and initialized as the
        //sum of a and b
        int c = a + b;
        System.out.println("Here is the value of a + b: " + c);
//        return c;
        //printing out c
        return c;
    }

    //the following method represents constant time
    //it can be described with the following notation: O(1)

    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    //the following represents linear time
    //it can be described with the following notation: O(n)
    public static void printAllItems(int[] items) {
        for(int item:items) {
            System.out.println(item);
        }
    }


    //the following represents quadratic time
    //it can be described with the following notation: O(n^2)
    public static void printAllPossibleOrderedPairs(int[] items) {
        for (int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }

        //take note the N could describe the actual value
        public static void printHelloNTimes(int n) {
            for (int i = 0; i < n; i++){
                System.out.println("hi");
            }
        }

        }






