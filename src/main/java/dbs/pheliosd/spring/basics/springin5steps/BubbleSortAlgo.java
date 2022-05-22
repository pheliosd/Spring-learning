package dbs.pheliosd.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BubbleSortAlgo implements SortAlgorithm {
//    implementing the basic binary search algo
   
    public int[] sort (int[] numbers){
//
        Arrays.sort(numbers);
        return numbers;
    }

}
