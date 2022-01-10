public class LazyInitizationWithDoubleCheckLocking {

    private static LazyInitizationWithDoubleCheckLocking instance;

    private LazyInitizationWithDoubleCheckLocking() {

    }

    public static LazyInitizationWithDoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (LazyInitizationWithDoubleCheckLocking.class) {
                if (instance == null)
                    instance = new LazyInitizationWithDoubleCheckLocking();
            }

        }
        return instance;
    }
}
