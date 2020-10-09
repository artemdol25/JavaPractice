package Task2;

public class TestBall {

    public static void main(String[] args) {

        Ball footballBall = new Ball("White", 400);
        Ball basketballBall = new Ball("Orange");
        Ball volleyballBall = new Ball();

        basketballBall.setWeight(650);

        volleyballBall.setColor("Yellow");
        volleyballBall.setWeight(280);

        System.out.println("Football ball\n" + footballBall);
        System.out.println("Basketball ball\n" + basketballBall);
        System.out.println("Volleyball ball\n" + volleyballBall);
    }
}
