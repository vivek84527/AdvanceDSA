package Recursion;

public class Recursion {
//    O(1)
    int sum(int n){
        return n*(n+1)/2;
    }

//    O(n)
    int sum1(int n){
        int i,s=0;
        for (int i1 = 0; i1 <= n; i1++) {
            s=s+i1;

        }
        return s;
    }

//    Recursion
    int sum2(int n){
        if(n==0){
            return 0;
        }
        else {
            return sum2(n-1)+n;
        }
    }
}
