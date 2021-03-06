package SingletonePattern;

public class Singletone { // 싱글톤 디자인 패턴
    private static Singletone one;

    private Singletone() {
    }

    public static Singletone getInstance() {
        if (one == null) {
            new Singletone();
        }
        return one;
    }
}
