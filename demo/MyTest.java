package com.demo;

public class MyTest {

    public static int[] chkPair(int input[], int size, int targetNum)
    {
    	int output[]= new int[2]; 
    	
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (input[i] + input[j] == targetNum) {
                	 output[0] = i;
                	 output[1] = j;
                }
            }
        }
        return output;
        
    }

	

    public static void main(String[] args)
    {

        int input[] = {2,7,11,15};
        int x = 9;
        int size = input.length;
        int output[]= chkPair(input, size, x);
        System.out.println("Indices " + output[0] + "....." + output[1]);
    
 
    }
	
	
	
}
