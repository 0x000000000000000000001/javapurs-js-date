public class Data_String_Regex {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    public static Object _match = FFI_STUB;
    public static Object _match(Object... args) { return null; }
    public static Object _replaceBy = FFI_STUB;
    public static Object _replaceBy(Object... args) { return null; }
    public static Object _search = FFI_STUB;
    public static Object _search(Object... args) { return null; }
    public static Object flagsImpl = FFI_STUB;
    public static Object flagsImpl(Object... args) { return null; }
    public static Object regexImpl = FFI_STUB;
    public static Object regexImpl(Object... args) { return null; }
    public static Object replace = FFI_STUB;
    public static Object replace(Object... args) { return null; }
    public static Object showRegexImpl = FFI_STUB;
    public static Object showRegexImpl(Object... args) { return null; }
    public static Object source = FFI_STUB;
    public static Object source(Object... args) { return null; }
    public static Object split = FFI_STUB;
    public static Object split(Object... args) { return null; }
    public static Object test = FFI_STUB;
    public static Object test(Object... args) { return null; }

public static final Object showRegex = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("show", Data_String_Regex.showRegexImpl);  return __map; } }).get();
public static final Object search = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_Regex._search)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object replaceprime = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_Regex._replaceBy)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object renderFlags = (java.util.function.Function<Object, Object>) (v_0) -> (((String) ((((String) ((((String) ((((String) ((((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) v_0).get("global"))) ? "g" : ""))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) v_0).get("ignoreCase"))) ? "i" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) v_0).get("multiline"))) ? "m" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) v_0).get("dotAll"))) ? "s" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) v_0).get("sticky"))) ? "y" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) v_0).get("unicode"))) ? "u" : ""))));
public static final Object regex = (java.util.function.Function<Object, Object>) (s_0) -> (java.util.function.Function<Object, Object>) (f_1) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_Regex.regexImpl)).apply(Data_Either.Left))).apply(Data_Either.Right))).apply(s_0))).apply((((String) ((((String) ((((String) ((((String) ((((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) f_1).get("global"))) ? "g" : ""))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) f_1).get("ignoreCase"))) ? "i" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) f_1).get("multiline"))) ? "m" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) f_1).get("dotAll"))) ? "s" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) f_1).get("sticky"))) ? "y" : "")))))) + ((String) (( ((Boolean) (((java.util.LinkedHashMap<String, Object>) f_1).get("unicode"))) ? "u" : "")))));
public static final Object parseFlags = (java.util.function.Function<Object, Object>) (s_0) -> (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("global", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.contains)).apply("g"))).apply(s_0)); __map.put("ignoreCase", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.contains)).apply("i"))).apply(s_0)); __map.put("multiline", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.contains)).apply("m"))).apply(s_0)); __map.put("dotAll", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.contains)).apply("s"))).apply(s_0)); __map.put("sticky", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.contains)).apply("y"))).apply(s_0)); __map.put("unicode", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_CodeUnits.contains)).apply("u"))).apply(s_0));  return __map; } }).get();
public static final Object match = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_String_Regex._match)).apply(Data_Maybe.Just))).apply(new Data_Maybe.Nothing());
public static final Object flags = (java.util.function.Function<Object, Object>) (x_0) -> ((java.util.function.Function<Object, Object>) (Data_String_Regex.flagsImpl)).apply(x_0);
}
