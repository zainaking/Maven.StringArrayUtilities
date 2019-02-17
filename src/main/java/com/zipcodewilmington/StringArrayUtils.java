package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];

    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }


    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) { //open book (array) // look in each page value
        for (String currentWord : array) {

            if (currentWord.equals(value)) { // compare 'currentWord' to 'value'
                return true;
            }
        }
        return false;

    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO

    // create the array
    // itar through param - array backwards
    // Get current string
    // Place current string in array at current index
    // dirive new array from index; (lenghtIndex)-1
    //Place current sting in array at newArrayIndex
    //Place current string in array at (length - currentIndex-1) = newArray curentIndex
    //
    public static String[] reverse(String[] array) {

        String[] x = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            x[i] = array[array.length - 1 - i];
        }
        return x;
    }


    public static void main(String[] args) {
        reverse(new String[]{"The", "Quick", "Brown"});

    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        return Arrays.equals(array, reversedArray);

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String stringRepresentation = Arrays.toString(array).toLowerCase();
        for (char letter = 'a'; letter < 'z'; letter++) {
            //if letter is not represented
            String letterAsString = "" + letter;
            if (stringRepresentation.contains(letterAsString) == false) {
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String answerString = "";
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                answerString = answerString + array[i] + " ";
                System.out.print(answerString);
            }

        }
        String[] answer = answerString.split("");
        return answer;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arraList = new ArrayList<String>();
        arraList.add(array[0]);
        for (int index = 0; index <= array.length - 2; index++){
            if (array[index] != array[index + 1]);
            {
                arraList.add(array[index + 1]);
            }
    }

    String[] result = arraList.toArray(new String[arraList.size()]);

             return result;
}

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= array.length; i++) {
            if (array[i].equals(array[i + 1]) && array[i + 1].equals(array[i + 2])) {
                list.add(array[i]);
                list.add(array[i]);
                list.add(array[i]);
            } else if (array[i].equals(array[i + 1])) {
                list.add(array[i]);
                list.add(array[1]);
            } else {
                list.add(array[i]);
            }
        }


        return list.toArray(new String[list.size()]);
    }
}



