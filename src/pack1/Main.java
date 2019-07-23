
package pack1.good;


import pack1.ExtCheck;
import pack1.ImplCheck;
import pack1.IntCheck;

/**
 * You need junit and hamcrest
 *
 * https://mvnrepository.com/artifact/junit/junit/4.12
 * https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all/1.3
 */

public class Main {

    public static void main(String[] args) {
        IntCheck aB = new ImplCheck();
        IntCheck aC = new ExtCheck();
        //test   ;
        System.out.println(aC.sum(1,1));
    }
}
