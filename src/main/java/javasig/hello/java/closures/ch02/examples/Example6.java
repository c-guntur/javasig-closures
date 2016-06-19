package javasig.hello.java.closures.ch02.examples;

import javasig.hello.java.closures.ch02.domain.Customer;
import javasig.hello.java.closures.ch02.domain.Gender;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * General API features
 * Uncomment the TODO
 * and fix the statement to achieve the desired outcome.
 */
public class Example6 {
    public static void main(String[] args) {
        // Run a for loop to print the first 10 numbers
        // Classic: for(int i = 0; i < 10; i++) System.out.println(i);
        // TODO: Solve using a Java 8 Stream equivalent
        // ... Add code below
        System.out.println();


        List<Customer> customers = Customer.seedCustomers();

        //---------------------------------------------------------------------
        // Find if any customer is from Chicago using a Predicate
        // Do this with both sequential and parallel streams
        Predicate<Customer> chicagoCustomers = c -> c.livesIn("Chicago");
        // TODO: Solve using a stream and parallelStream usage
        System.out.println("Any Chicago customers : " + "<REPLACE STRING WITH CODE>");
        System.out.println("Any Chicago customers (with parallel) : " + "<REPLACE STRING WITH CODE>");

        System.out.println();


        //---------------------------------------------------------------------
        // Check if all customers are male using a Predicate
        // Do this with both sequential and parallel streams
        // TODO: Solve using a stream and parallelStream usage
        Predicate<Customer> allMaleCustomers = null; // Fix this null
        System.out.println("Are all customers male? : " + "<REPLACE STRING WITH CODE>");
        System.out.println("Are all customers male? (with parallel) : " + "<REPLACE STRING WITH CODE>");

        System.out.println();


        //---------------------------------------------------------------------
        // Find all the cities customers are from using a Function
        Function<Customer, String> customerCities = c -> c.getCity();
        System.out.println("All distinct cities : ");
        // TODO: Solve using a stream using the above function
        List<String> distinctCities = null; // Fix this null
        // TODO: Uncomment line below.
//        distinctCities.forEach(System.out::println);

        System.out.println();


        //---------------------------------------------------------------------
        // Find count of customers from NYC
        // TODO: Solve using a stream and parallelStream usage with a Predicate
        // ... Add code below (Predicate or Function) ???

        System.out.println("Count of NYC Customers : " + "<REPLACE STRING WITH CODE>");
        System.out.println("Count of NYC Customers (with parallel) : " + "<REPLACE STRING WITH CODE>");

        System.out.println();


        //---------------------------------------------------------------------
        // Find any customer from NYC - note we use an Optional here.
        // Do this with both sequential as well as parallel streams.
        Optional<Customer> customer;
        // TODO: Solve using a stream and parallelStream usage
        // ... Add code
        System.out.println("Any NYC Customer : " + "<REPLACE STRING WITH CODE>");
        // ... Add code
        System.out.println("Any NYC Customer (with parallel) : " + "<REPLACE STRING WITH CODE>");

        System.out.println();


        //---------------------------------------------------------------------
        // Find any customer from NYC - return the first one found.
        // TODO: Solve using a stream and parallelStream usage
        // ... Add code
        System.out.println("First found NYC Customer : " + "<REPLACE STRING WITH CODE>");
        // ... Add code
        System.out.println("First found NYC Customer (with parallel) : " + "<REPLACE STRING WITH CODE>");

        System.out.println();


        //---------------------------------------------------------------------
        // Find total loyalty for customers from NYC
        // ***************
        // Java classic style provided as an example.
        // ***************
        int totalNYLoyalty = 0;
        for(Customer c : customers) {
            if("New York".equals(c.getCity())) {
                totalNYLoyalty += c.getLoyalty();
            }
        }
        System.out.println("Total NY Loyalty (classic): " + totalNYLoyalty);
        // ***************
        // Java 8
        // ***************
        totalNYLoyalty = 0;
        // TODO: Solve using a Java8 equivalent of the above.
        // ... Add code
        System.out.println("Total NY Loyalty (java8): " + totalNYLoyalty);

        System.out.println();


        //---------------------------------------------------------------------
        // Find the sum of ages of all NYC Customers
        // bonus points for multiple solutions.
        // TODO: Fix the supplier below.
        Supplier<Stream<Customer>> customerStreamSupplier = null; // Fix the null

        // TODO: Print the sum of ages of all NYC Customers
        // Bonus points for each one-liner response.
        // ... Add code below
        System.out.println("Sum of ages of NYC Customers : " + "<REPLACE STRING WITH CODE>");

        System.out.println();


    }
}
