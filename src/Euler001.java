public class Euler001 {
    public static void main(String[] args) {
        double count = 0;
        double endSum = 0;

        while(count < 1000) {
            if(count % 3 == 0 || count % 5 == 0) {
                endSum = endSum + count;
            }
            count++;
        }

        System.out.println(endSum);
    }
}