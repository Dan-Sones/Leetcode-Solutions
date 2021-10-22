class Solution {
    public int findNumbers(int[] nums) {
        int numOfEvens = 0; //Create a counter for the total number of evens
        
        for(int i : nums){ //For all the integers in the array
            String asString = Integer.toString(i); //Convert them to a string
            if(asString.length() % 2 == 0){ // Check if the length of the number is even
                numOfEvens += 1; //if the number is even, add one to the total
            }
        }
        return numOfEvens;
    }
}