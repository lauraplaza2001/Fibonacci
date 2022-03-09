package org.example.fibonacci;

public class Fibonacci {
    /*
        * Fibonacci succession is : 0 1 1 2 3 5 8 13 ...
        * Each element of the succession is defined by the sum of the two numbers behind in the succession
        * Except the first element that is 0, and the second element that it is 1.
     */

    public int compute( int value){
        int result;
        if(value <= 0 || value >=50){
            throw  new RuntimeException("The value is not valid (it has to be bigger than 0 and smaller than 50). The value was  : " + value);
        }
        if(value ==1){
                result=0;
        }else if (value == 2){
                result=1;
        }else{
                result = compute(value-1) + compute(value-2);
        }
        return result;
    }

}
