public class Data_DateTime_Instant {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { return this; }
    };
    // FFI provided by .spago/p/datetime-6.1.0/src/Data/DateTime/Instant.java
    public static final java.util.function.Function<Object, Object> fromDateTimeImpl = (yObj) -> {
        Integer y = (Integer) yObj;
        return (java.util.function.Function<Object, Object>) (moObj) -> {
            Integer mo = (Integer) moObj;
            return (java.util.function.Function<Object, Object>) (dObj) -> {
                Integer d = (Integer) dObj;
                return (java.util.function.Function<Object, Object>) (hObj) -> {
                    Integer h = (Integer) hObj;
                    return (java.util.function.Function<Object, Object>) (miObj) -> {
                        Integer mi = (Integer) miObj;
                        return (java.util.function.Function<Object, Object>) (sObj) -> {
                            Integer s = (Integer) sObj;
                            return (java.util.function.Function<Object, Object>) (msObj) -> {
                                Integer ms = (Integer) msObj;
                                java.util.Calendar cal = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
                                cal.clear();
                                cal.setLenient(true);
                                cal.set(java.util.Calendar.YEAR, y);
                                cal.set(java.util.Calendar.MONTH, mo - 1);
                                cal.set(java.util.Calendar.DAY_OF_MONTH, d);
                                cal.set(java.util.Calendar.HOUR_OF_DAY, h);
                                cal.set(java.util.Calendar.MINUTE, mi);
                                cal.set(java.util.Calendar.SECOND, s);
                                cal.set(java.util.Calendar.MILLISECOND, ms);
                                if (y >= 0 && y < 100) {
                                    cal.set(java.util.Calendar.YEAR, y);
                                }
                                return (double) cal.getTimeInMillis();
                            };
                        };
                    };
                };
            };
        };
    };

    public static final java.util.function.Function<Object, Object> toDateTimeImpl = (ctorObj) -> {
        java.util.function.Function<Object, Object> ctor = (java.util.function.Function<Object, Object>) ctorObj;
        return (java.util.function.Function<Object, Object>) (instantObj) -> {
            Double instant = (Double) instantObj;
            java.util.Calendar cal = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
            cal.setTimeInMillis(instant.longValue());
            int y = cal.get(java.util.Calendar.YEAR);
            if (cal.get(java.util.Calendar.ERA) == 0) y = 1 - y;
            int mo = cal.get(java.util.Calendar.MONTH) + 1;
            int d = cal.get(java.util.Calendar.DAY_OF_MONTH);
            int h = cal.get(java.util.Calendar.HOUR_OF_DAY);
            int mi = cal.get(java.util.Calendar.MINUTE);
            int s = cal.get(java.util.Calendar.SECOND);
            int ms = cal.get(java.util.Calendar.MILLISECOND);

            java.util.function.Function<Object, Object> fn1 = (java.util.function.Function<Object, Object>) ctor.apply(y);
            java.util.function.Function<Object, Object> fn2 = (java.util.function.Function<Object, Object>) fn1.apply(mo);
            java.util.function.Function<Object, Object> fn3 = (java.util.function.Function<Object, Object>) fn2.apply(d);
            java.util.function.Function<Object, Object> fn4 = (java.util.function.Function<Object, Object>) fn3.apply(h);
            java.util.function.Function<Object, Object> fn5 = (java.util.function.Function<Object, Object>) fn4.apply(mi);
            java.util.function.Function<Object, Object> fn6 = (java.util.function.Function<Object, Object>) fn5.apply(s);
            return fn6.apply(ms);
        };
    };


public static final Object unInstant = (java.util.function.Function<Object, Object>) (v_0) -> v_0;
public static final Object toDateTime = ((java.util.function.Function<Object, Object>) (Data_DateTime_Instant.toDateTimeImpl)).apply((java.util.function.Function<Object, Object>) (y_0) -> (java.util.function.Function<Object, Object>) (mo_1) -> (java.util.function.Function<Object, Object>) (d_2) -> (java.util.function.Function<Object, Object>) (h_3) -> (java.util.function.Function<Object, Object>) (mi_4) -> (java.util.function.Function<Object, Object>) (s_5) -> (java.util.function.Function<Object, Object>) (ms_6) -> new Data_DateTime.DateTime(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Date.canonicalDate)).apply(y_0))).apply(( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (1))))) ? new Data_Date_Component.January() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (2))))) ? new Data_Date_Component.February() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (3))))) ? new Data_Date_Component.March() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (4))))) ? new Data_Date_Component.April() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (5))))) ? new Data_Date_Component.May() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (6))))) ? new Data_Date_Component.June() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (7))))) ? new Data_Date_Component.July() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (8))))) ? new Data_Date_Component.August() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (9))))) ? new Data_Date_Component.September() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (10))))) ? new Data_Date_Component.October() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (11))))) ? new Data_Date_Component.November() : ( ((Boolean) ((((Integer) (mo_1)) == ((Integer) (12))))) ? new Data_Date_Component.December() : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))))))))))))).apply(d_2), new Data_Time.Time(h_3, mi_4, s_5, ms_6)));
public static final Object showInstant = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("show", (java.util.function.Function<Object, Object>) (v_0) -> (((String) ((((String) ("(Instant (Milliseconds ")) + ((String) (((java.util.function.Function<Object, Object>) (Data_Show.showNumberImpl)).apply(v_0)))))) + ((String) ("))"))));  return __map; } }).get();
public static final Object ordDateTime = Data_Ord.ordNumber;
public static final Object instant = (java.util.function.Function<Object, Object>) (v_0) -> ( ((Boolean) ((((Boolean) (!(((Boolean) ((((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordNumberImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()))).apply(v_0))).apply(-8639977881600000.0) instanceof Data_Ordering.LT)))))) && ((Boolean) (!(((Boolean) ((((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_Ord.ordNumberImpl)).apply(new Data_Ordering.LT()))).apply(new Data_Ordering.EQ()))).apply(new Data_Ordering.GT()))).apply(v_0))).apply(8639977881599999.0) instanceof Data_Ordering.GT))))))))) ? new Data_Maybe.Just(v_0) : new Data_Maybe.Nothing());
public static final Object fromDateTime = (java.util.function.Function<Object, Object>) (v_0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_DateTime_Instant.fromDateTimeImpl)).apply(((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value0))).apply(( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.January))) ? 1 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.February))) ? 2 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.March))) ? 3 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.April))) ? 4 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.May))) ? 5 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.June))) ? 6 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.July))) ? 7 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.August))) ? 8 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.September))) ? 9 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.October))) ? 10 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.November))) ? 11 : ( ((Boolean) ((((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value1 instanceof Data_Date_Component.December))) ? 12 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))))))))))))).apply(((Data_Date.Date) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value0)).value2))).apply(((Data_Time.Time) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value1)).value0))).apply(((Data_Time.Time) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value1)).value1))).apply(((Data_Time.Time) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value1)).value2))).apply(((Data_Time.Time) (Object)(((Data_DateTime.DateTime) (Object)(v_0)).value1)).value3);
public static final Object fromDate = (java.util.function.Function<Object, Object>) (d_0) -> ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (Data_DateTime_Instant.fromDateTimeImpl)).apply(((Data_Date.Date) (Object)(d_0)).value0))).apply(( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.January))) ? 1 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.February))) ? 2 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.March))) ? 3 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.April))) ? 4 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.May))) ? 5 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.June))) ? 6 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.July))) ? 7 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.August))) ? 8 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.September))) ? 9 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.October))) ? 10 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.November))) ? 11 : ( ((Boolean) ((((Data_Date.Date) (Object)(d_0)).value1 instanceof Data_Date_Component.December))) ? 12 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))))))))))))))).apply(((Data_Date.Date) (Object)(d_0)).value2))).apply(0))).apply(0))).apply(0))).apply(0);
public static final Object eqDateTime = Data_Eq.eqNumber;
public static final Object diff = (java.util.function.Function<Object, Object>) (dictDuration_0) -> (java.util.function.Function<Object, Object>) (dt1_1) -> (java.util.function.Function<Object, Object>) (dt2_2) -> ((java.util.function.Function<Object, Object>) (((java.util.LinkedHashMap<String, Object>) dictDuration_0).get("toDuration"))).apply((((Double) (dt1_1)) + ((Double) (-(((Double) (dt2_2)))))));
public static final Object boundedInstant = (new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("bottom", -8639977881600000.0); __map.put("top", 8639977881599999.0); __map.put("Ord0", (java.util.function.Function<Object, Object>) (_dollar___unused_0) -> Data_Ord.ordNumber);  return __map; } }).get();
}
