package ro.mta.facc.selab;

import java.util.concurrent.RunnableScheduledFuture;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        Carte c = new Carte("Biblia Pierduta", "Igor Bergler", 2017, 600);
        Biblioteca b = new Biblioteca();
        b.add(c);

        b.add(new Carte("Invitatie la vals", "Mihail Dumes", 1910, 250));
        b.add(new Carte("Invitatie la vals", "Mihail Dumes", 1910, 250));

        b.add(new Carte("Moara cu Noroc","Ion Slavici",1997,230));

        b.sort();
        System.out.println(b);

        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("alt thread!");
            }
        }).start();
    }
}
