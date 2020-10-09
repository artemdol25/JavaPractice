package Task2;

public class TestBall {

    public static void main(String[] args) {

        Ball ball1 = new Ball(100, 50);
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();

        ball2.setX(10);
        ball2.setY(20);

        ball3.setXY(1, 1);

        System.out.println("Ball_1\n" + ball1);

        ball1.move(5, -10);
        ball1.move(20,20);

        System.out.println(ball1);

        System.out.println("Ball_2\n" + ball2);

        ball2.move(-10,-20);

        System.out.println(ball2);

        System.out.println("Ball_3\n" + ball3);

        ball3.move(99, 99);

        System.out.println(ball3);
    }
}
