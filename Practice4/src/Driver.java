public class Driver {

    public static void main(String[] args) {

        System.out.println("Factorial of 5 is: " + findFactorial(5));
        System.out.println("Factorial of 10 is: " + findFactorial(10));

        int[] arr = {1,5,2,6,8,3,6,1,5,200};

        findLowestAndHighest(arr);

    }

    public static int findFactorial(int number){

        int factorial = 1;

        for(int i = number; i > 0; i--){
            factorial *= i;
        }

        return factorial;

    }

    public static void findLowestAndHighest(int[] numbers){

        boolean numberSwapped = true;

        while(numberSwapped){

            numberSwapped = false; //this will go back to true if a number is swapped

            //we need a for loop to iterate through the array
            //why length - 1? because we're only ever going to be comparing two numbers
            //there's no reason to look at the last number alone
            for(int i = 0; i < numbers.length - 1; i++){

                //if the left number is greater than the right number... swap them!
                if(numbers[i] > numbers[i + 1]){
                    //classic coding problem - swap two Array elements
                    //it's very helpful to create a third variable so we don't lose our data
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1]; //the left element is now equal to the right element
                    numbers[i + 1] = temp; //the right element is now equal to what the left element was

                    numberSwapped = true; //to keep the while loop going
                }
            }

        } //end of while loop

        System.out.println("Lowest number is: " + numbers[0]);
        System.out.println("Highest number is: " + numbers[numbers.length - 1]);

    }

}
