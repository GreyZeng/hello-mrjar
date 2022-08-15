package git.snippet;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2022/8/14
 * @since 9
 */
public class Helper {
    public static void hello(String name)   {
        // 旧版本用_作为变量，jdk9不能用_作为变量
        String fixName = "hello";
        System.out.println(fixName + ", " + name + " from jdk9");
    }
}
