import java.util.*;
public class Main {

    public static void main(String[] args){
        String input = "hello";
        String result = capitalize(input);
        System.out.println(result);
    }

/*
positions in string
hello
h=0
e=1
l=2
l=3
o=4
01234
The reason we use input.substring(0,1) is that we are telling it to stop at position 1
So, this will take the input
hello
H----

So it stops
if we used input.substring(0,2)
hello
HE---
Then, we use the input.substring (beginIndex at 1)
This begins the index at the position 1
Then we add these two together and return the result!
 */
    public static String capitalize(String input){
        return input.substring(0,1).toUpperCase() + input.substring(1);
    }
}
