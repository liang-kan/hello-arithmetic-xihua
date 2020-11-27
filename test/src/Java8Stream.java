import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: TapFun
 * @since: 2020/11/27/14:55
 **/

public class Java8Stream {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Stream stream1 = arrayList.stream();
        Stream stream2 = stream1.filter(a -> a.toString().equals(""));
        System.out.println(stream1);
        System.out.println(stream2);
    //stream流生成，不可重复使用
        //中间节点是一个懒节点
        //终止节点只能有一个
        //根据返回类型区分节点
        //上个节点，可以先影响下一个节点


        //创建一个空的Stream流
        Stream<Object> emptyStream = Stream.empty();


        //收集流:可以创建任何类型的Collection（Collection,Set,List）
        List<String> stringsCollection = Arrays.asList("xihau", "西华", "梁西华");
        Stream<String> stream = stringsCollection.stream();
        //System.out.println(stream.toArray());


        //数组流：数组也可以是Stream的来源
        Stream<String> xihau = Stream.of("xihau", "西华", "梁西华");

    }
}
