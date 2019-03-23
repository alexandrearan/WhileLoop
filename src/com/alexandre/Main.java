package com.alexandre;

public class Main {

    public static void main(String[] args) {
        int count = 1;
//	    while(count < 6){
//            System.out.println("count value is " + count);
//	        count++;
//        }
//        count = 1;
//
//	    do {
//            System.out.println("count value is " + count);
//	        count ++;
//
//        } while (count != 6);

	    // challenge

        int number = 4;
        int finish = 20;
        int total = 0;

        while(number <= finish) {
            number ++;
            if(isEvenNumber(number)) {
                total++;
            }
            if(total == 5)
                break;


        }
        System.out.println("Number of Even Numbers found:  " + total);


    }
    private static boolean isEvenNumber(int number) {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
}
