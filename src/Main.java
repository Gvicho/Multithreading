public class Main {
    public static void main(String[] args) {
        MultithreadingThing myThing = new MultithreadingThing(0);
        MultithreadingThing myThing1 = new MultithreadingThing(1);

        myThing.start();
        myThing1.start();
        for(int i = 0;i<3;i++) {
            System.out.println("main "+i);
        }

        /*
        //damatebiti funqcieabi

        myThing.join();
        myThing.isAlive();
         */
    }
}