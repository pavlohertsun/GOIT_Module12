package task2;

import lombok.Data;
@Data
public class FizzBuzzChecker {
    private int n;
    private int current = 1;
    public FizzBuzzChecker(int n) {
        this.n = n;
    }

    public synchronized void fizz() throws InterruptedException {
        while(current <= n) {
            if(current % 3 == 0 && current % 5 != 0) {
                System.out.println("Fizz");
                current++;
                notifyAll();
            } else {
                wait();
            }
        }
    }

    public synchronized void buzz() throws InterruptedException {
        while(current <= n) {
            if(current % 3 != 0 && current % 5 == 0) {
                System.out.println("Buzz");
                current++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
    public synchronized void fizzbuzz() throws InterruptedException {
        while(current <= n) {
            if(current % 15 == 0) {
                System.out.println("FizzBuzz");
                current++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
    public synchronized void number() throws InterruptedException {
        while(current <= n) {
            if(current % 3 != 0 && current % 5 != 0) {
                System.out.println(current);
                current++;
                notifyAll();
            } else {
                wait();
            }
        }
    }
}
