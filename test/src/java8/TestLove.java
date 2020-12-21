package java8;

import java.io.IOException;
import java.nio.channels.Channel;
import java.util.Map;

/**
 * @author: TapFun
 * @since: 2020/12/21/17:40
 **/

public class TestLove {
    public static void main(String[] args) throws IOException {
        //String s = System.console().readLine();
        //System.out.println(s);

        //System.gc();
        Map<String, String> getenv = System.getenv();
        //System.out.println(getenv);
        System.getSecurityManager();
        Channel channel = System.inheritedChannel();
        System.out.println(
                channel
        );

    }
}
