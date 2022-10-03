public class App {
    public static void main(String[] args) throws Exception {
//sheesh is a variable so you can change it
//for
        for (int sheesh = 5; sheesh != 0; sheesh--) {

            if (sheesh == 4) {
                System.out.println("Wait! Timeout! AAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            }
            System.out.println("John Darrel");
        }            
        
//palayaw is a variable so you can change it
//do while
         int palayaw = 5;

        do {
            System.out.println("Poquiz");
            palayaw--;
        } while (palayaw != 0);
        
//while
         int surNameIto= 0;

        while (surNameIto != 10) {
            surNameIto++;
            
            if (surNameIto == 3) {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
                continue;
            }
            System.out.println("alyas legendary master");
        }
    }
}
