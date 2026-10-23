    // JSDate values are epoch milliseconds; NaN represents an invalid date.
    public static final java.util.function.Supplier<Object> now = () -> {
        return (double) System.currentTimeMillis();
    };

    public static final java.util.function.Function<Object, Object> isValid = (dateObj) -> {
        Double date = dateNumber(dateObj);
        return !date.isNaN();
    };

    public static final java.util.function.Function<Object, Object> toInstantImpl = (justObj) -> {
        java.util.function.Function<Object, Object> just = (java.util.function.Function<Object, Object>) justObj;
        return (java.util.function.Function<Object, Object>) (nothing) -> {
            return (java.util.function.Function<Object, Object>) (dateObj) -> {
                Double date = dateNumber(dateObj);
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

    private static Double dateNumber(Object obj) {
        if (obj instanceof Double) return (Double) obj;
        if (obj instanceof Integer) return ((Integer) obj).doubleValue();
        return Double.NaN;
    }

    // Date.prototype.toISOString always includes milliseconds.
    private static String isoString(double date) {
        String text = java.time.Instant.ofEpochMilli((long) date).toString();
        int dot = text.indexOf('.');
        int z = text.indexOf('Z');
        return dot < 0 ? text.substring(0, z) + ".000Z" : text;
    }

    private static Double createDate(boolean isLocal, java.util.Map<String, Object> parts) {
        Double year = dateNumber(parts.get("year"));
        Double month = dateNumber(parts.get("month"));
        Double day = dateNumber(parts.get("day"));
        Double hour = dateNumber(parts.get("hour"));
        Double minute = dateNumber(parts.get("minute"));
        Double second = dateNumber(parts.get("second"));
        Double millisecond = dateNumber(parts.get("millisecond"));

        if (year.isNaN() || month.isNaN() || day.isNaN() || hour.isNaN() || minute.isNaN() || second.isNaN() || millisecond.isNaN()) {
            return Double.NaN;
        }

        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar(isLocal ? java.util.TimeZone.getDefault() : java.util.TimeZone.getTimeZone("UTC"));
        calendar.setGregorianChange(new java.util.Date(Long.MIN_VALUE));
        calendar.clear();
        calendar.setLenient(true);
        calendar.set(java.util.Calendar.YEAR, year.intValue());
        calendar.set(java.util.Calendar.MONTH, month.intValue());
        calendar.set(java.util.Calendar.DAY_OF_MONTH, day.intValue());
        calendar.set(java.util.Calendar.HOUR_OF_DAY, hour.intValue());
        calendar.set(java.util.Calendar.MINUTE, minute.intValue());
        calendar.set(java.util.Calendar.SECOND, second.intValue());
        calendar.set(java.util.Calendar.MILLISECOND, millisecond.intValue());

        return (double) calendar.getTimeInMillis();
    }

    public static final java.util.function.Function<Object, Object> jsdate = (partsObj) -> {
        java.util.Map<String, Object> parts = (java.util.Map<String, Object>) partsObj;
        return createDate(false, parts);
    };

    public static final java.util.function.Function<Object, Object> jsdateLocal = (partsObj) -> {
        java.util.Map<String, Object> parts = (java.util.Map<String, Object>) partsObj;
        return (java.util.function.Supplier<Object>) () -> createDate(true, parts);
    };

    private static Object applyDateMethod(String method, Object dateObj) {
        Double date = dateNumber(dateObj);
        if (date.isNaN()) return Double.NaN;

        if (method.equals("getTime")) return date;
        if (method.equals("toISOString")) return isoString(date);

        java.util.GregorianCalendar cal = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone("UTC"));
        cal.setGregorianChange(new java.util.Date(Long.MIN_VALUE));
        cal.setTimeInMillis(date.longValue());

        if (method.equals("getUTCFullYear")) return (double) cal.get(java.util.Calendar.YEAR);
        if (method.equals("getUTCMonth")) return (double) cal.get(java.util.Calendar.MONTH);
        if (method.equals("getUTCDate")) return (double) cal.get(java.util.Calendar.DAY_OF_MONTH);
        if (method.equals("getUTCDay")) return (double) (cal.get(java.util.Calendar.DAY_OF_WEEK) - 1);
        if (method.equals("getUTCHours")) return (double) cal.get(java.util.Calendar.HOUR_OF_DAY);
        if (method.equals("getUTCMinutes")) return (double) cal.get(java.util.Calendar.MINUTE);
        if (method.equals("getUTCSeconds")) return (double) cal.get(java.util.Calendar.SECOND);
        if (method.equals("getUTCMilliseconds")) return (double) cal.get(java.util.Calendar.MILLISECOND);

        java.util.GregorianCalendar localCal = new java.util.GregorianCalendar(java.util.TimeZone.getDefault());
        localCal.setGregorianChange(new java.util.Date(Long.MIN_VALUE));
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
    }

    public static final java.util.function.Function<Object, Object> dateMethod = (methodObj) ->
        (java.util.function.Function<Object, Object>) (dateObj) ->
            applyDateMethod((String) methodObj, dateObj);

    public static final java.util.function.Function<Object, Object> dateMethodEff = (methodObj) ->
        (java.util.function.Function<Object, Object>) (dateObj) ->
            // Resolve the local timezone when the effect runs.
            (java.util.function.Supplier<Object>) () -> applyDateMethod((String) methodObj, dateObj);

    private static double parseDate(String text) {
        try {
            if (text.contains("GMT")) {
                java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(
                    "EEE, dd MMM yyyy HH:mm:ss Z", java.util.Locale.ENGLISH);
                return (double) format.parse(text.replace("GMT", "")).getTime();
            }
            // Accept both ISO 'T' and the legacy ':' separator. A date-time
            // without a zone uses the local timezone, as JavaScript does.
            String normalized = text.trim().replaceFirst("^(\\d{4}-\\d{2}-\\d{2}):", "$1T");
            if (normalized.endsWith("Z")) {
                return (double) java.time.Instant.parse(normalized).toEpochMilli();
            }
            return (double) java.time.LocalDateTime.parse(normalized)
                .atZone(java.time.ZoneId.systemDefault()).toInstant().toEpochMilli();
        } catch (Exception failure) {
            return Double.NaN;
        }
    }

    public static final java.util.function.Function<Object, Object> parse = (text) ->
        (java.util.function.Supplier<Object>) () -> parseDate((String) text);

    public static final java.util.function.Function<Object, Object> fromTime = (timeObj) -> {
        return dateNumber(timeObj);
    };
