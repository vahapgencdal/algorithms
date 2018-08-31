package com.algorithms.fibonacci;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {

    /**
     * This is O(nlogn) complexity solution
     * @param n
     * @return
     */
    public static long calculateNLogNComplexity(long n){
        if(n<=0)
            return 0;
        else if(n==1)
            return 1;
        else return calculateNLogNComplexity(n-1)+calculateNLogNComplexity(n-2);
    }

    /**
     * This is the o(n) complexity of fibonacci
     * @param n
     * @return
     */
    public long calculateOnComplexity(long n){

        if (n<=0)
            return 0;

        long firstNumber=0;
        long secondNumber=1;
        long total=1;

        for(int i=1;i<n;i++){
            total=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=total;

        }
        System.out.println(total);
    return total;
    }

    public long[][] matrixCalc(long n){

        long matrix[][];


        if(n==1) {
            matrix = new long[][]{{1 , 1},{1 , 0}};
        }else if(n%2==0) {
            matrix = matrixCalc(n / 2);
            matrix = multiplyMatrix(matrix, matrix);
        }else{
            matrix = matrixCalc((n - 1) / 2);
            matrix = multiplyMatrix(matrix, matrix);
            matrix = multiplyMatrix(matrix, new long[][]{{1 , 1},{1 , 0}});
        }
        return matrix;
    }

    private long[][] multiplyMatrix(long[][] mo, long[][] ms){
        long result[][]={
                        {mo[0][0] * ms[0][0] + mo[0][1]*ms[1][0] , mo[0][0] * ms[0][1] + mo[0][1]*ms[1][1]},
                        {mo[1][0] * ms[0][0] + mo[1][1]*ms[1][1] , mo[1][0] * ms[0][1] + mo[1][1]*ms[1][1]}
                        };
        return result;
    }

    /**
     * This is the Olog(n) complexity of fibonacci
     * @param n
     * @return
     */
    public long calculateOLogNComplexity(long n){
        if(n<=0)
            return 0;
        else if (n==1)
            return 1;
        else
            return matrixCalc(n)[0][1];
    }

}
