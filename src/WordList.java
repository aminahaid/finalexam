/*make a list of the words in a array list(i forgot how to plug in the output into my code
print out a list in alphabetical order using the utill collection
then reverse the list using the utill collections
**/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args){

        System.out.println("Enter 10 words: ");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        ArrayList<String>
                list = new ArrayList<>();

        list.add("car");
        list.add("vase");
        list.add("shoes");
        list.add("book");
        list.add("ananas");
        list.add("truck");
        list.add("flower");
        list.add("television");
        list.add("mousse");
        list.add("office");
        System.out.println("Original order: "+"\n" + list);
        Collections.sort(list);
        System.out.println("alphabetical order: "+"\n"+ list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reversed alphabetical order: "+"\n"+list);
//i could not remove the brackets from my output.
    }
}



