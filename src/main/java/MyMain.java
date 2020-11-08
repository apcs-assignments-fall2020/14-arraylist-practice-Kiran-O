import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for (int i = 0; i < list.size(); i++){
            int k = list.get(i);
            if (k % 2 != 0){
                c++;
            }
        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++){
            int newlst1 = list1.get(i);
            for (int k = 0; k < list2.size(); k++){
                int newlst2 = list2.get(k);
                if (newlst1 == newlst2){
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            arr_list.add(i, arr[i]);
        }
        return arr_list;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?");
        int num = scan.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the " + num + " numbers now.");
        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = scan.nextInt();
        convertToArrayList(array);
    }
}
}
