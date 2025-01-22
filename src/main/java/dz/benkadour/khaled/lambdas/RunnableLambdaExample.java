package dz.benkadour.khaled.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();


        Runnable rannableLambda = () -> System.out.println("Inside Rannable Lambda");

        new Thread(rannableLambda).start();

    }

}
