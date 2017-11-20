public class Euler002 {
    public static void main(String[] args) {
        double evenSum = 2;
        double priorNum = 2;
        double curNum = 3;

        while(curNum <= 4000000) {
            if (curNum %2 == 0) {
                evenSum = evenSum + curNum;
            }
            double tempOld = curNum;
            curNum = curNum + priorNum;
            priorNum = tempOld;
        }

        System.out.println(evenSum);
    }
}