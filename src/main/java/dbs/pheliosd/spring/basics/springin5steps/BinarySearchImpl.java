package dbs.pheliosd.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
//    implementing the basic binary search algo

    private  SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbertosearchfor){
//        if we include no of operation like bubblesort
//        and latter we nned to shift to quick sort then this will be i a trouble to and nne dt to rewrite the code
//        this leads to tight couple
        int[] sortedNums = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }

}
