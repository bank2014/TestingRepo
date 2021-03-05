
public class Gulden {
    public static int[] cal(int number) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }
}
