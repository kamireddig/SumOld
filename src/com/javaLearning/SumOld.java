package com.javaLearning;

public class SumOld {
    public static void main(String[] args){
        sumOdd(1,100);
        sumOdd(-1,100);
        sumOdd(100,100);
        sumOdd(13,13);
        sumOdd(100,-100);
        sumOdd(100,1000);
    }
    public static boolean isOdd(int number){
        if (number > 0) {
            if (number % 2 == 1)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static int sumOdd (int start, int end){
        int temp = 0;
        if (start > 0 && start <= end){
            for (int i=start;i<=end;i++) {
                if (isOdd(i)) {
                    temp = temp + i;
                }
            }
            return temp;
        }
        else
            return -1;
    }
}
