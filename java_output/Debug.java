public class Debug {
    public static void debug(Object resultObj, Object expectedObj) {
        if (resultObj instanceof Data_Maybe.Just && expectedObj instanceof Data_Maybe.Just) {
            Data_DateTime.DateTime resDt = (Data_DateTime.DateTime)((Data_Maybe.Just)resultObj).value0;
            Data_DateTime.DateTime expDt = (Data_DateTime.DateTime)((Data_Maybe.Just)expectedObj).value0;
            Data_Date.Date resD = (Data_Date.Date)resDt.value0;
            Data_Date.Date expD = (Data_Date.Date)expDt.value0;
            Data_Time.Time resT = (Data_Time.Time)resDt.value1;
            Data_Time.Time expT = (Data_Time.Time)expDt.value1;
            
            System.out.println("res Y: " + resD.value0 + " (" + resD.value0.getClass() + ")");
            System.out.println("exp Y: " + expD.value0 + " (" + expD.value0.getClass() + ")");
            System.out.println("res Mo: " + resD.value1 + " (" + resD.value1.getClass() + ")");
            System.out.println("exp Mo: " + expD.value1 + " (" + expD.value1.getClass() + ")");
            System.out.println("res D: " + resD.value2 + " (" + resD.value2.getClass() + ")");
            System.out.println("exp D: " + expD.value2 + " (" + expD.value2.getClass() + ")");
            System.out.println("res h: " + resT.value0 + " (" + resT.value0.getClass() + ")");
            System.out.println("exp h: " + expT.value0 + " (" + expT.value0.getClass() + ")");
        }
    }
}
