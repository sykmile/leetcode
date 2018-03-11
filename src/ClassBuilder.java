/**
 * @author sykmile
 * @date 2018/3/11
 * @description
 */
public class ClassBuilder {

    public static <T> T build(Class<T> t){

        try {
            return t.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
