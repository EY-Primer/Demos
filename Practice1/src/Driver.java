import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        int[] numbers = {4,1,6,8,2,14,47,86,0,0};

        //sorting lowest to highest
        int[] l2h = lowestToHighest(numbers);
        System.out.println(Arrays.toString(l2h));

        //sorting highest to lowest
        int[] h2l = highestToLowest(numbers);
        System.out.println(Arrays.toString(h2l));

    }

    public static int[] lowestToHighest(int[] numbers){

        boolean numberSwapped = true; //need this to be true for the while loop to run in the first place

        while(numberSwapped){ //this will break when we iterate through the array without swapping anything

            numberSwapped = false; //will go back to true if a number is swapped

            //iterate through the Array
            for(int i = 0; i < numbers.length - 1; i++){
                if (numbers[i] > numbers[i + 1]) { //if the numbers are not in order
                    int temp = numbers[i]; //store the first value
                    //these two lines perform the actual swap
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    numberSwapped = true; //set this back to true to check for more unordered elements
                }
            }
        }
        return numbers;
    }

    public static int[] highestToLowest(int[] numbers){

        boolean numberSwapped = true; //need this to be true for the while loop to run in the first place

        while(numberSwapped){ //this will break when we iterate through the array without swapping anything

            numberSwapped = false; //will go back to true if a number is swapped

            //iterate through the Array
            for(int i = 0; i < numbers.length - 1; i++){
                if (numbers[i] < numbers[i + 1]) { //if the numbers are not in order
                    int temp = numbers[i]; //store the first value
                    //these two lines perform the actual swap
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    numberSwapped = true; //set this back to true to check for more unordered elements
                }
            }
        }
        return numbers;
    }

}
