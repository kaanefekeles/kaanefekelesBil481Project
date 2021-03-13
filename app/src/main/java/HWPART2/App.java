/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HWPART2;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    public static boolean subsequentSubsetController(ArrayList<Integer> array, int first,int second,int third) {
        //checks if the given integers are present in the array with the given order 
        // for example let say the given array is 5 8 9 6 7 1 3 85 8   and the given inputs are 6 7 1 
        //it would return true since such subset in the given order exists within the given array and
        //lets say the given input is 8 9 85 it would return false since such subset exists but is not in that order
        if (array == null){
            return false;
        }
        if(array.size() == 0){
            return false;
        }
        if(array.indexOf(first) == -1){
            return false;
        }
        if(array.indexOf(second) == -1){
            return false;
        }
        if(array.indexOf(third) == -1){
            return false;
        }
        for(int i =0 ;i<array.size();i++){
            if(array.get(i) == first){
                if(i+1<array.size()){
                    if(array.get(i+1) == second){
                        if(i+2<array.size()){
                            if(array.get(i+2).equals(third)){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
      }
}
