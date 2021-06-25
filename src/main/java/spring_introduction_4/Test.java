package spring_introduction_4;

public class Test {

    public static void main(String[] args) {
        Jar jar = new Cola();
        Mama mama = new Mama(jar);
        mama.pourDrink();
    }
}
