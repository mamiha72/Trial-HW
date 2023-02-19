public class SqrCounter {

    public int calcSqr(int spanBeginning, int spanEnding) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
             if (i * i <= spanEnding & i * i >= spanBeginning) {
                count = count + 1;
                }
        }
        return count;
    }

}
