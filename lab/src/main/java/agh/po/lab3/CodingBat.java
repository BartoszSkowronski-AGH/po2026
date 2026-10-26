package agh.po.lab3;

public class CodingBat {

    // Warmup 1:
    public static boolean hasTeen(int a, int b, int c) {
        if(a >12 && a<20){
            return true;
        }
        else if(b >12 && b<20){
            return true;
        }
        else if(c >12 && c<20){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean or35(int n) {
        if(n%3 == 0 || n%5 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    // Array 2:

    public static boolean has77(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 7){
                if(nums.length > i+1){
                    if(nums[i+1] == 7){
                        return true;
                    }
                }
                if(nums.length > i+2){
                    if(nums[i+2] == 7){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //String-1

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public static void main(String[] args){
        int a = 3, b=4, c=5, n= 35;
        System.out.println(CodingBat.hasTeen(a,b,c));
        System.out.println(CodingBat.or35(n));
        System.out.println(CodingBat.has77(new int[]{2,3,4,5,5,6,7}));
        System.out.println(CodingBat.makeAbba("Hello", "Bye"));
    }
}

