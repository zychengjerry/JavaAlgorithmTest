package BasicCode_04集合类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q43_集合排序_Collections_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer("小明",scanner.nextInt());
        Customer customer2 = new Customer("小军",scanner.nextInt());
        Customer customer3 = new Customer("小红",scanner.nextInt());
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        //write your code here......
        Collections.sort(customers);    //调用排序接口

        System.out.println(customers);

    }
}

class Customer implements Comparable<Customer>{
    private String name;
    private int consumption;

    public Customer(String name, int consumption) {
        this.name = name;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", consumption=" + consumption +
                '}';
    }

    //write your code here......
    //重写compareTo
    @Override
    public int compareTo(Customer c) {
        return c.consumption - consumption;
    }

}