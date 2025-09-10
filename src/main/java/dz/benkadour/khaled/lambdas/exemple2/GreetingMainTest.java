package dz.benkadour.khaled.lambdas.exemple2;

/**
 * Create By KHALED_BENKADOUR_CTR_CONSTANTINE on (10/09/2025)
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (10/09/2025)
 * @TIME : (10:08)
 * @Project_Name : TESTING-LEARNING
 */
public class GreetingMainTest {
    public static void main(String[] args) {
        
        /*GreetingService greetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hi ...." + message);
            }
        };

         */

        //GreetingService greetingService1 = (String firstName, String lastName, int age) -> {
        //    System.out.println("FN :: " + firstName);
        //    System.out.println("LN :: " + lastName);
        //    System.out.println("AGE :: " + age);
        //};

        //greetingService1.greet("BENKADOUR", "KHALED", 33);

        System.out.println("------------------------------------------");

        //GreetingService g = (firstName, lastName, age) -> firstName+""+ lastName+ "" + age;

        //System.out.println(g.greet2("KHALED", "BENKADOUR", 33));


        GreetingService g1 = (n) -> n.toUpperCase();
        test((n) -> n.toUpperCase());


    }

    private static void test(GreetingService greetingService) {
        String returnString = greetingService.greet("udemy courses");
        System.out.println("GreetingService returned: " + returnString);
    }
}
