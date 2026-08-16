public class Partial_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object _unsafePartial = FFI_STUB;
    public static Object _unsafePartial(Object... args) { return null; }

public static final Object unsafePartial = Partial_Unsafe._unsafePartial;
public static final Object unsafeCrashWith = (java.util.function.Function<Object, Object>) (msg_0) -> ((java.util.function.Function<Object, Object>) (Partial._crashWith)).apply(msg_0);
}
