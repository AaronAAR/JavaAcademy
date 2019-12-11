public class Problema2 {

    public static void main(String[] args) {
        Problema2 number = new Problema2();

        System.out.println(number.closestValue(19, 21));
        System.out.println(number.closestValue(17, 22));
        System.out.println(number.closestValue(22, 31));
    }

    public int closestValue(int n1, int n2) {

        if(n1 > 21 && n2 > 21) {
            return 0;
        } else if (n1 <= 21 && n1 > n2) {
            return n1;
        } else if (n2 <= 21 && n2>n1) {
            return n2;
        }
        return n1;
    }
}
