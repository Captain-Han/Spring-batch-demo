package jp.co.misumi.Spring_Batch;

import jp.co.misumi.model.OutptData;
import org.junit.Assert;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestUtil {

	/**
	 * assert expected is equal to actual
	 *
	 * @param expectedOutptData
	 * @param actualOutptData
	 */
	public static void assertDataEquals(OutptData expectedOutptData, OutptData actualOutptData, boolean isJudgeZero) {

		Map<String, Method> fieldNameMethodMap = getMethodMap(expectedOutptData, isJudgeZero);
		StringBuffer expected = new StringBuffer();
		StringBuffer actual = new StringBuffer();

		for (String fieldName : fieldNameMethodMap.keySet()) {
			try {

				Method method = fieldNameMethodMap.get(fieldName);
				Object expectedO = method.invoke(expectedOutptData);
				Object actualO = method.invoke(actualOutptData);

				expected.append(fieldName);
				expected.append("=");
				expected.append('\'');
				expected.append(expectedO);
				expected.append(",");

				actual.append(fieldName);
				actual.append("=");
				actual.append('\'');
				actual.append(actualO);
				actual.append(",");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		Assert.assertEquals(expected.toString(), actual.toString());
	}

	/**
	 * get class' get methods and del null field.
	 *
	 * @param obj
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "finally" })
	private static Map<String, Method> getMethodMap(Object obj, boolean isJudgeZero) {

		Map<String, Method> fieldNameMethodMap = new HashMap<String, Method>();

		try {
			Class clazz = obj.getClass();
			Field[] fields = obj.getClass().getDeclaredFields();
			for (Field field : fields) {
				PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
				Method getMethod = pd.getReadMethod();

				Object o = getMethod.invoke(obj);

				if (o != null) {
					if (isJudgeZero) {
						fieldNameMethodMap.put(field.getName(), getMethod);
					} else if (!isJudgeZero && !(o.getClass().toString().endsWith("java.lang.Integer")
							&& Integer.valueOf(String.valueOf(o)) == 0)) {
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
