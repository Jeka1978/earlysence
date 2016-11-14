package reflects;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

/**
 * Created by Evegeny on 14/11/2016.
 */
public class ReflectUtil {
    @SneakyThrows
    public static void printApi(Object o) {
        Class<?> clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")) {
                method.setAccessible(true);
                method.invoke(o);
            }
        }
    }
}
