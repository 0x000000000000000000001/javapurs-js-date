public class Partial {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object _crashWith = FFI_STUB;
    public static Object _crashWith(Object... args) { return null; }

public static final Object crashWith = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Partial._crashWith;
public static final Object crash = (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> ((java.util.function.Function<Object, Object>) (Partial._crashWith)).apply("Partial.crash: partial function");
}
