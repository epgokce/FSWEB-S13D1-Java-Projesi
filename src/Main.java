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
}