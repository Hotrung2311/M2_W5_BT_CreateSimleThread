public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (Integer i = 0; i < 10; i++){
                System.out.println(this.name + ": số: " + i + " hashcode: " + i.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class test{
    public static void main(String[] args) {
        NumberGenerator a = new NumberGenerator("A");
        NumberGenerator b = new NumberGenerator("B");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();


    }
}
