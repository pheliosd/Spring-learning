package dbs.pheliosd.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {


        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
        int result = binarySearch.binarySearch(new int[] {10,3,5,6}, 6);
        System.out.println(result);


        SpringApplication.run(SpringIn5StepsApplication.class, args);


    }

}
