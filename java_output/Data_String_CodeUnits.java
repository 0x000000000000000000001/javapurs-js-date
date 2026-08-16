public class Data_String_CodeUnits {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object _charAt = FFI_STUB;
    public static Object _charAt(Object... args) { return null; }
    public static Object _indexOf = FFI_STUB;
    public static Object _indexOf(Object... args) { return null; }
    public static Object _indexOfStartingAt = FFI_STUB;
    public static Object _indexOfStartingAt(Object... args) { return null; }
    public static Object _lastIndexOf = FFI_STUB;
    public static Object _lastIndexOf(Object... args) { return null; }
    public static Object _lastIndexOfStartingAt = FFI_STUB;
    public static Object _lastIndexOfStartingAt(Object... args) { return null; }
    public static Object _toChar = FFI_STUB;
    public static Object _toChar(Object... args) { return null; }
    public static Object countPrefix = FFI_STUB;
    public static Object countPrefix(Object... args) { return null; }
    public static Object drop = FFI_STUB;
    public static Object drop(Object... args) { return null; }
    public static Object fromCharArray = FFI_STUB;
    public static Object fromCharArray(Object... args) { return null; }
    public static Object length = FFI_STUB;
    public static Object length(Object... args) { return null; }
    public static Object singleton = FFI_STUB;
    public static Object singleton(Object... args) { return null; }
    public static Object slice = FFI_STUB;
    public static Object slice(Object... args) { return null; }
    public static Object splitAt = FFI_STUB;
    public static Object splitAt(Object... args) { return null; }
    public static Object take = FFI_STUB;
    public static Object take(Object... args) { return null; }
    public static Object toCharArray = FFI_STUB;
    public static Object toCharArray(Object... args) { return null; }

public static final Object uncons = (java.util.function.Function<Object, Object>) (v_0) -> ( ((Boolean) (java.util.Objects.equals(v_0, ""))) ? new Data_Maybe.Nothing() : new Data_Maybe.Just((new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("head", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_Unsafe.charAt)).apply(0))).apply(v_0)); __map.put("tail", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.drop)).apply(1))).apply(v_0));  return __map; } }).get()));
public static final Object toChar = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits._toChar)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object takeWhile = (java.util.function.Function<Object, Object>) (p_0) -> (java.util.function.Function<Object, Object>) (s_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.take)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.countPrefix)).apply(p_0))).apply(s_1)))).apply(s_1);
public static final Object takeRight = (java.util.function.Function<Object, Object>) (i_0) -> (java.util.function.Function<Object, Object>) (s_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.drop)).apply((((Integer) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.length)).apply(s_1))) - ((Integer) (i_0)))))).apply(s_1);
public static final Object stripSuffix = (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (str_1) -> { Object v1_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.splitAt)).apply((((Integer) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.length)).apply(str_1))) - ((Integer) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.length)).apply(v_0))))))).apply(str_1); return ( ((Boolean) (java.util.Objects.equals(((java.util.LinkedHashMap<String, Object>) v1_2).get("after"), v_0))) ? new Data_Maybe.Just(((java.util.LinkedHashMap<String, Object>) v1_2).get("before")) : new Data_Maybe.Nothing()); };
public static final Object stripPrefix = (java.util.function.Function<Object, Object>) (v_0) -> (java.util.function.Function<Object, Object>) (str_1) -> { Object v1_2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.splitAt)).apply(((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.length)).apply(v_0)))).apply(str_1); return ( ((Boolean) (java.util.Objects.equals(((java.util.LinkedHashMap<String, Object>) v1_2).get("before"), v_0))) ? new Data_Maybe.Just(((java.util.LinkedHashMap<String, Object>) v1_2).get("after")) : new Data_Maybe.Nothing()); };
public static final Object lastIndexOfprime = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits._lastIndexOfStartingAt)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object lastIndexOf = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits._lastIndexOf)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object indexOfprime = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits._indexOfStartingAt)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object indexOf = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits._indexOf)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object dropWhile = (java.util.function.Function<Object, Object>) (p_0) -> (java.util.function.Function<Object, Object>) (s_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.drop)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.countPrefix)).apply(p_0))).apply(s_1)))).apply(s_1);
public static final Object dropRight = (java.util.function.Function<Object, Object>) (i_0) -> (java.util.function.Function<Object, Object>) (s_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.take)).apply((((Integer) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.length)).apply(s_1))) - ((Integer) (i_0)))))).apply(s_1);
public static final Object contains = (java.util.function.Function<Object, Object>) (pat_0) -> { Object __local_var_1 = ((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.indexOf)).apply(pat_0); return (java.util.function.Function<Object, Object>) (x_2) -> { Object __local_var_3 = ((java.util.function.Function<Object, Object>) (__local_var_1)).apply(x_2); return ( ((Boolean) ((__local_var_3 instanceof Data_Maybe.Nothing))) ? false : ( ((Boolean) ((__local_var_3 instanceof Data_Maybe.Just))) ? true : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; };
public static final Object charAt = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits._charAt)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
}
