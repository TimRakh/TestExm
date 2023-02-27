public class Square {
    public double squareOfArea(double a){return a * a;}

    public double squareOfCircle(double a) throws MistakesNumbers {
        if (a ==0){
            return 0;
        } else if (a < 0)
            throw new MistakesNumbers("Числа не могут быть отрицательными");
        return 3.14 * a * a;}

    public double squareOfOval(double a, double b){
        if(a == 0||b ==0){
            return 0;
        }
        return 3.14 * a * b;}
}
