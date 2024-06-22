package lambdaexpression;

interface Player{
    void play();
    default void run(){
        System.out.println("Let's Run");
    }
}

//class Bowler implements Player{
//    public void play() {
//        System.out.println("I am bowling");
//    }
//}
//
//class Batter implements Player{
//    @Override
//    public void play() {
//        System.out.println("I  am batting");
//    }
//}

public class LambdaExpressionExample {

    public static void main(String[] args) {

//        Player kholi = new Player(){
//            public void play(){
//                System.out.println("Kohli is batting");
//            }
//        };

        Player kholi = () -> System.out.println("Kohli is batting");
        Player bumrah = () -> System.out.println("Bumrah is bowling");
        Player hardik  = () -> System.out.println("Hardik is bowling and batting");


        kholi.play();
        bumrah.play();
        hardik.play();


    }

}
