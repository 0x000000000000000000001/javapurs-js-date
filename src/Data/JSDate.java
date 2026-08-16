    public static final java.util.function.Supplier<Object> now = () -> {
        return (double) System.currentTimeMillis();
    };

    public static final java.util.function.Function<Object, Object> isValid = (dateObj) -> {
        Double date = getNumber(dateObj);
        return !date.isNaN();
    };

    public static final java.util.function.Function<Object, Object> toInstantImpl = (justObj) -> {
        java.util.function.Function<Object, Object> just = (java.util.function.Function<Object, Object>) justObj;
        return (java.util.function.Function<Object, Object>) (nothing) -> {
            return (java.util.function.Function<Object, Object>) (dateObj) -> {
                Double date = getNumber(dateObj);
                if (date.isNaN()) {
                    return nothing;
                } else {
                    return just.apply(date);
                }
            };
        };
    };

    public static final java.util.function.Function<Object, Object> fromInstant = (instantObj) -> {
        return (Double) instantObj;
    };

    private static Double getNumber(Object obj) {
        if (obj instanceof Double) return (Double) obj;
        if (obj instanceof Integer) return ((Integer) obj).doubleValue();
        return Double.NaN;
    }

    private static Double createDate(boolean isLocal, java.util.Map<String, Object> parts) {
        System.out.println("createDate parts: " + parts);
        Double y = getNumber(parts.get("year"));
        Double m = getNumber(parts.get("month"));
        Double d = getNumber(parts.get("day"));
        Double h = getNumber(parts.get("hour"));
        Double mi = getNumber(parts.get("minute"));
        Double s = getNumber(parts.get("second"));
        Double ms = getNumber(parts.get("millisecond"));

        if (y.isNaN() || m.isNaN() || d.isNaN() || h.isNaN() || mi.isNaN() || s.isNaN() || ms.isNaN()) {
            return Double.NaN;
        }

        java.util.Calendar cal = new java.util.GregorianCalendar(isLocal ? java.util.TimeZone.getDefault() : java.util.TimeZone.getTimeZone("UTC"));
        cal.clear();
        cal.setLenient(true);
        cal.set(java.util.Calendar.YEAR, y.intValue());
        cal.set(java.util.Calendar.MONTH, m.intValue());
        cal.set(java.util.Calendar.DAY_OF_MONTH, d.intValue());
        cal.set(java.util.Calendar.HOUR_OF_DAY, h.intValue());
        cal.set(java.util.Calendar.MINUTE, mi.intValue());
        cal.set(java.util.Calendar.SECOND, s.intValue());
        cal.set(java.util.Calendar.MILLISECOND, ms.intValue());

        if (y >= 0 && y < 100) {
            cal.set(java.util.Calendar.YEAR, y.intValue());
        }

        double ts = (double) cal.getTimeInMillis();
        System.out.println("createDate generated timestamp: " + ts);
        return ts;
    }

    public static final java.util.function.Function<Object, Object> jsdate = (partsObj) -> {
        java.util.Map<String, Object> parts = (java.util.Map<String, Object>) partsObj;
        return createDate(false, parts);
    };

    public static final java.util.function.Function<Object, Object> jsdateLocal = (partsObj) -> {
        java.util.Map<String, Object> parts = (java.util.Map<String, Object>) partsObj;
        return (java.util.function.Supplier<Object>) () -> createDate(true, parts);
    };

    public static final java.util.function.Function<Object, Object> dateMethod = (methodObj) -> {
        String method = (String) methodObj;
        return (java.util.function.Function<Object, Object>) (dateObj) -> {
            Double date = getNumber(dateObj);
            if (date.isNaN()) return Double.NaN;

            if (method.equals("getTime")) return date;
            
            java.util.Calendar cal = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
            cal.setTimeInMillis(date.longValue());

            if (method.equals("getUTCFullYear")) return (double) cal.get(java.util.Calendar.YEAR);
            if (method.equals("getUTCMonth")) return (double) cal.get(java.util.Calendar.MONTH);
            if (method.equals("getUTCDate")) return (double) cal.get(java.util.Calendar.DAY_OF_MONTH);
            if (method.equals("getUTCDay")) return (double) (cal.get(java.util.Calendar.DAY_OF_WEEK) - 1);
            if (method.equals("getUTCHours")) return (double) cal.get(java.util.Calendar.HOUR_OF_DAY);
            if (method.equals("getUTCMinutes")) return (double) cal.get(java.util.Calendar.MINUTE);
            if (method.equals("getUTCSeconds")) return (double) cal.get(java.util.Calendar.SECOND);
            if (method.equals("getUTCMilliseconds")) return (double) cal.get(java.util.Calendar.MILLISECOND);

            java.util.Calendar localCal = new java.util.GregorianCalendar(java.util.TimeZone.getDefault());
            localCal.setTimeInMillis(date.longValue());

            if (method.equals("getFullYear")) return (double) localCal.get(java.util.Calendar.YEAR);
            if (method.equals("getMonth")) return (double) localCal.get(java.util.Calendar.MONTH);
            if (method.equals("getDate")) return (double) localCal.get(java.util.Calendar.DAY_OF_MONTH);
            if (method.equals("getDay")) return (double) (localCal.get(java.util.Calendar.DAY_OF_WEEK) - 1);
            if (method.equals("getHours")) return (double) localCal.get(java.util.Calendar.HOUR_OF_DAY);
            if (method.equals("getMinutes")) return (double) localCal.get(java.util.Calendar.MINUTE);
            if (method.equals("getSeconds")) return (double) localCal.get(java.util.Calendar.SECOND);
            if (method.equals("getMilliseconds")) return (double) localCal.get(java.util.Calendar.MILLISECOND);

            if (method.equals("getTimezoneOffset")) {
                int offsetMs = java.util.TimeZone.getDefault().getOffset(date.longValue());
                return (double) (-offsetMs / 60000);
            }

            return 0.0;
        };
    };

    public static final java.util.function.Function<Object, Object> dateMethodEff = (methodObj) -> {
        String method = (String) methodObj;
        return (java.util.function.Function<Object, Object>) (dateObj) -> {
            return (java.util.function.Supplier<Object>) () -> {
                Double date = getNumber(dateObj);
                if (date.isNaN()) return Double.NaN;
                
                if (method.equals("getTime")) return date;
                
                java.util.Calendar cal = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
                cal.setTimeInMillis(date.longValue());

                if (method.equals("getUTCFullYear")) return (double) cal.get(java.util.Calendar.YEAR);
                if (method.equals("getUTCMonth")) return (double) cal.get(java.util.Calendar.MONTH);
                if (method.equals("getUTCDate")) return (double) cal.get(java.util.Calendar.DAY_OF_MONTH);
                if (method.equals("getUTCDay")) return (double) (cal.get(java.util.Calendar.DAY_OF_WEEK) - 1);
                if (method.equals("getUTCHours")) return (double) cal.get(java.util.Calendar.HOUR_OF_DAY);
                if (method.equals("getUTCMinutes")) return (double) cal.get(java.util.Calendar.MINUTE);
                if (method.equals("getUTCSeconds")) return (double) cal.get(java.util.Calendar.SECOND);
                if (method.equals("getUTCMilliseconds")) return (double) cal.get(java.util.Calendar.MILLISECOND);

                java.util.Calendar localCal = new java.util.GregorianCalendar(java.util.TimeZone.getDefault());
                localCal.setTimeInMillis(date.longValue());

                if (method.equals("getFullYear")) return (double) localCal.get(java.util.Calendar.YEAR);
                if (method.equals("getMonth")) return (double) localCal.get(java.util.Calendar.MONTH);
                if (method.equals("getDate")) return (double) localCal.get(java.util.Calendar.DAY_OF_MONTH);
                if (method.equals("getDay")) return (double) (localCal.get(java.util.Calendar.DAY_OF_WEEK) - 1);
                if (method.equals("getHours")) return (double) localCal.get(java.util.Calendar.HOUR_OF_DAY);
                if (method.equals("getMinutes")) return (double) localCal.get(java.util.Calendar.MINUTE);
                if (method.equals("getSeconds")) return (double) localCal.get(java.util.Calendar.SECOND);
                if (method.equals("getMilliseconds")) return (double) localCal.get(java.util.Calendar.MILLISECOND);

                if (method.equals("getTimezoneOffset")) {
                    int offsetMs = java.util.TimeZone.getDefault().getOffset(date.longValue());
                    return (double) (-offsetMs / 60000);
                }

                return 0.0;
            };
        };
    };

    public static final java.util.function.Function<Object, Object> parse = (strObj) -> {
        String str = (String) strObj;
        return (java.util.function.Supplier<Object>) () -> {
            try {
                if (str.contains("GMT")) {
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");
                    java.util.Date d = sdf.parse(str.replace("GMT", ""));
                    return (double) d.getTime();
                } else if (str.contains("T")) {
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                    sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                    java.util.Date d = sdf.parse(str);
                    return (double) d.getTime();
                }
                return Double.NaN;
            } catch (Exception e) {
                return Double.NaN;
            }
        };
    };

    public static final java.util.function.Function<Object, Object> fromTime = (timeObj) -> {
        return getNumber(timeObj);
    };
