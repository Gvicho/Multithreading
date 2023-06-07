public class MultithreadingThing extends Thread {
    int threadNumber;
    MultithreadingThing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(i+" From Thread N"+threadNumber);
            if(threadNumber == 1) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
