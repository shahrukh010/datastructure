package com.code.math;
public class  Mathmatics {


    public int countDigit(int n){

        int result = 1;
        while(n / 10 !=0){
            result++;
            n = n / 10;
        }
        return result;
    }

    public boolean isPalindrome(int n){

        int tmp = n;
        int res = 0;

        while(tmp !=0){

            res = res * 10 + tmp %10;
            tmp = tmp / 10;
        }
        return res == n;
    }


    public int factorial(int n){

        int res = n;

        if(n == 0)
            return 1;

        for(int index = 1; index < n; index++){

            res = res * index;
        }
        return res;
    }


    public int countTrailingZero(int n){


        int result = 0;

        if( n <=10 ){
        int resOfFact = this.factorial(n);


        while(resOfFact % 10 == 0){
            result++;
            resOfFact = resOfFact / 10;
        }

        return result;
       }

       result = 0;
       for(int index = 5; index < n; index = index * 5){

           result = result + n/index;
       }
        return result;
    }


    public int gcd(int a, int b){

        int minValue = Math.min(a,b);
        int n = 1;
        int result = 0;

        //time is depend on MinValue
       
        
        /*
        while(n <=minValue){

            if(a % n == 0 && b % n == 0)
                result = n;
            n++;
        }
        */


        //more optimize solution
       
        while(minValue > 0){

            if(a % minValue ==0 && b % minValue == 0)
                return minValue;
            minValue--;
        }
        
        return result;
    }


    public int lcm(int a, int b){

        int MaxValue = Math.max(a, b);

        while(true){

            if(MaxValue % a == 0 && MaxValue % b == 0){
                return MaxValue;
            }
            MaxValue++;
        }
    }


    public boolean isPrime(int n){

        if(n==1)
            return false;

        /*
           //O(n)
        for(int index = 2; index <n; index++){

            if(n %index==0)
                return false;
        }*/

        //o(sqrootn)
        /*
        for(int index = 2; index * index <= n; index++){

            if(n % index==0)
                return false;
        }*/

        if(n == 2 || n == 3)
            return true;

        if(n % 2 == 0 || n % 3 == 0)//just skiping which is divisable by 2 or 3 because of these are not prime number
            return false;

        for( int index = 5 ; index * index <= n; index = index + 6 ){

            if(n % index == 0 || (n %(index+2) == 0 ))
                return false;
        }
        return true;
    }

    public java.util.List primeFactor(int n){

        java.util.List result = new java.util.ArrayList<>();

        for(int index = 2; index * index <= n; index++){

            if(isPrime(index)){

                int tmp = index;
                while(n % tmp == 0){

                    result.add(index);
                    tmp = tmp*tmp;
                }
            }
        }
        return result;
    }



    public java.util.List allDivisor(int n){

        java.util.List result = new java.util.ArrayList();

        int index;
        for(index = 1; index * index < n; index++ ){

            if(n % index == 0){
                result.add(index);
            }
        }

        for(; index >=1; index--){

            if(n % index == 0){
                result.add(n/index);
            }
        }

        return result;
    }


    public boolean[] printAllPrime(int n){


        boolean[]  prime = new boolean[n];

        for(int index = 2; index * index <=n; index++){

            if(isPrime(index)){


                for(int j = 2*index ; j<n; j = j+index){

                    prime[j] = true;
                }

            }
        }

        return prime;
    }


}
