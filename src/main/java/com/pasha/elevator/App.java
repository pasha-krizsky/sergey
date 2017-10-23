package com.pasha.elevator;

public class App {

    public static void main(String[] args) {

        Container container = new Container();

        Reader reader = new Reader(container);
        Processor processor = new Processor(container);

        Thread threadReader = new Thread(reader);
        Thread threadProcessor = new Thread(processor);

        threadReader.start();
        threadProcessor.start();

        try {
            threadReader.join();
            threadProcessor.join();
        } catch (InterruptedException e) {
            System.out.println("Ops");
            e.printStackTrace();
        }

    }
}
