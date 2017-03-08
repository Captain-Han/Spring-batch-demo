package jp.co.sysevo.Spring_Batch;

import jp.co.sysevo.model.OutptData;
import org.junit.Assert;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class TestUtil {

    /**
     * assert expected is equal to actual
     * @param expectedOutptData
     * @param actualOutptData
     */
    public static void assertDataEquals(OutptData expectedOutptData, OutptData actualOutptData) {

        Map<String, Method> fieldNameMethodMap = getMethodMap(expectedOutptData);
        String expected = "";
        String actual = "";

        for (String fieldName : fieldNameMethodMap.keySet()) {
            try {

                Method method = fieldNameMethodMap.get(fieldName);
                Object expectedO = method.invoke(expectedOutptData);
                Object actualO = method.invoke(actualOutptData);

                expected += (fieldName + "=" + '\'' + expectedO + '\''+ " ");
                actual += (fieldName + "=" + '\'' + actualO + '\''+ " ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Assert.assertEquals(expected, actual);
    }


    /**
     * get class' get methods and del null field.
     * @param obj
     * @return
     */
    public static Map<String, Method> getMethodMap(Object obj) {

        Map<String, Method> fieldNameMethodMap = new HashMap<String, Method>();

        try {
            Class clazz = obj.getClass();
            Field[] fields = obj.getClass().getDeclaredFields();
            for (Field field : fields) {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(),
                        clazz);
                Method getMethod = pd.getReadMethod();

                Object o = getMethod.invoke(obj);

                if (o != null) {
                    if (!(o.getClass().toString().endsWith("java.lang.Integer") && Integer.valueOf(String.valueOf(o)) == 0)) {
                        fieldNameMethodMap.put(field.getName(), getMethod);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return fieldNameMethodMap;
        }
    }
}
