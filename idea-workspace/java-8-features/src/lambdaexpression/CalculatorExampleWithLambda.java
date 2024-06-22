package lambdaexpression;

interface Calculator{
    double calculate(int a, int b);
}

public class CalculatorExampleWithLambda {

    public static void main(String[] args) {

        Calculator add = (a,b) -> a+b;
        double sum = add.calculate(5,10);

        System.out.println(sum);

//        Calculator max = (a,b) -> {
//            if(a>b){
//                return a;
//            }
//            return b;
//        };

        Calculator max = (a,b) -> a>b?a:b ;

        double mavValue = max.calculate(10,5);
        System.out.println(mavValue);



    }

}
