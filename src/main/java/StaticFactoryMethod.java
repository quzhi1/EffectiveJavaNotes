/**
 * Created by zhiqu on 7/11/16.
 */
public class StaticFactoryMethod {

    String content;

    private StaticFactoryMethod(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        StaticFactoryMethod instance = StaticFactoryMethod.newInstance("hello");
        System.out.println(instance);
    }

    public static StaticFactoryMethod newInstance(String content) {
        return new StaticFactoryMethod(content);
    }

    @Override
    public String toString() {
        return content;
    }

}
