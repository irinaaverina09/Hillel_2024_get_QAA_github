package HomeWork13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserProvider {

        private static final String [] userName = new String[] {"Olya","Sergey", "Yevhen", "Kate", "Vasyl"};
        private static final Integer [] userAge = new Integer[] {25, 60, 15, 18, 33, 45, 17, 16};
        private static final String [] userGender = new String[] {"Female","Male"};
        private static final String [] userEmail = new String[] {null,"test@gmail.com", "test@amazon.com", "test@microsoft.com"};


        public static User getUser() {
        Random random = new Random();
        return new User(userName[random.nextInt(userName.length)], userAge[random.nextInt(userAge.length)], userEmail[random.nextInt(userEmail.length)], userGender[random.nextInt(userGender.length)]);
    }
}

