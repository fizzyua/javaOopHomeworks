package com.company;

public class ServiseTwo implements Runnable{
    private int sum;
    private int start;
    private  int finish;
    private int [] mas;

    public ServiseTwo(int start, int finish, int[] mas) {
        this.start = start;
        this.finish = finish;
        this.mas = mas;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = start; i < finish; i++){
            /*System.out.println(Thread.currentThread().getName() + "  " + sum);*/
            sum +=mas[i];
        }
    }
}
