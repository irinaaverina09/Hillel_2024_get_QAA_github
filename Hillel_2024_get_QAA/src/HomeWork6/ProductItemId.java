package HomeWork6;
import java.util.Random;
public class ProductItemId {

    public void checkProductItemId() {
        Random random = new Random();
        int x = random.nextInt(50);
        System.out.println("Your product items id is " + x);
    }
}
