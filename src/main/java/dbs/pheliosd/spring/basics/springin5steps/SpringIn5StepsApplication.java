package dbs.pheliosd.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        BinarySearchImpl binarysearch = new BinarySearchImpl();
        int result = binarysearch.binarySearch(new int[] {10,3,5,6}, 6);
        System.out.println(result);


        SpringApplication.run(SpringIn5StepsApplication.class, args);


    }

}
