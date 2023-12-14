package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FibonacciNumbers {
    private Map<Integer, Integer> mapForIteration = new HashMap();
    private Map<Integer, Integer> mapForRecursion = new HashMap();
    private Map<Integer, Integer> mapForDynamic = new HashMap();
    public FibonacciNumbers(){
        mapForIteration.put(0, 0);
        mapForIteration.put(1, 1);

        mapForRecursion.put(0, 0);
        mapForRecursion.put(1, 1);

        mapForDynamic.put(0, 0);
        mapForDynamic.put(1, 1);
    }

    public int fibonacciNumIteration(int n) {  //Time O(n)  space O(n)
        for (int i = 2; i <= n; i++) {
            mapForIteration.put(i, mapForIteration.get(i - 2) + mapForIteration.get(i - 1));
        }
        return mapForIteration.get(n);
    }

    private int numForRecursion = 2;
    public int fibonacciNumRecursion(int n) {   //time O(2^n) space  O(n)
        if (numForRecursion <= n) {
            mapForRecursion.put(numForRecursion, mapForRecursion.get(numForRecursion - 2) + mapForRecursion.get(numForRecursion - 1));
            numForRecursion+=1;
            fibonacciNumRecursion(n);
        }
        return mapForRecursion.get(n);
    }

    public int fibonacciNumDynamic(int n){
        putFibonacciNumbersToMap(n);
        return mapForIteration.get(n);
    }
    public void putFibonacciNumbersToMap(int n){   //time O(n) space O(n)
        for (int i = 2; i <= n; i++) {
            mapForDynamic.put(i, mapForDynamic.get(i - 2) + mapForDynamic.get(i - 1));
        }
    }
}

