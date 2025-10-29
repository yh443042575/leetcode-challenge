package pers.sakuta.leetcode.challenge.domain.recursion;

import java.util.HashMap;
import java.util.Map;

public class ClimbStair {
    public static Map<Integer,Integer> results = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(ClimbStair.climbStairs(10));
    }

    public static Integer climbStairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if (results.containsKey(n)) {
            return results.get(n);
        }else{
            int subRes = climbStairs(n - 1) + climbStairs(n - 2);
            results.put(n,subRes);
            return subRes;
        }
    }

}
