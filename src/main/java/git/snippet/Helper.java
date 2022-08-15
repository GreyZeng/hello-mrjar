package git.snippet;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2022/8/14
 * @since 1.7
 */
public class Helper {
    public static void hello(String name)   {
        // jdk 9+不能用_作为变量
        String _ = "hello";
        System.out.println(_ + ", " + name);
    }
}
