import java.lang.instrument.Instrumentation;

public class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        if (instrumentation == null) {
            throw new IllegalStateException("Instrumentation has not been set.");
        }
        return instrumentation.getObjectSize(o);
    }
}