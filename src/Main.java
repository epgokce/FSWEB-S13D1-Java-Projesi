public class Main {
    public static void main(String[] args) {
        System.out.println("Barking Dog:");
        System.out.println(shouldWakeUp (true, 1)); //true
        System.out.println(shouldWakeUp (false, 2)); //false
        System.out.println(shouldWakeUp (true, 8)); //false
        System.out.println(shouldWakeUp (true, -1)); //false
        System.out.println("Age Detection:");
        System.out.println(hasTeen(9, 99, 19)); // true;
        System.out.println(hasTeen(23, 15, 42)); // true;
        System.out.println(hasTeen(22, 23, 34)); //false;
        System.out.println("Playful Cat:");
        System.out.println(isCatPlaying(true, 10)); //false
        System.out.println(isCatPlaying(false, 36)); //false
        System.out.println(isCatPlaying(false, 35)); // true

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23)
            return false;

        if(!barking)
            return false;

        return hourOfDay < 8 || hourOfDay > 20;

    }
    public static boolean inAgeLimit(int age) {
        int ageMax = 19;
        int ageMin = 13;

        return age >=ageMin && age <= ageMax;
    }

    public static boolean hasTeen(int a, int b, int c) {

        return inAgeLimit(a) || inAgeLimit(b) || inAgeLimit(c);
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {

        int minTemp = 25;
        int maxTemp = 35;

        if(summer)
            maxTemp = 45;


        return minTemp <= temperature && maxTemp >= temperature;
    }
}