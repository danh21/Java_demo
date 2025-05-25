import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        //  collect
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        List<String> filter = strings.stream().collect(Collectors.toList());
        System.out.println(filter);

        System.out.println("--------------");

        // forEach
        strings.stream().forEach(s -> System.out.println(s));

        System.out.println("--------------");
        
        // reduce
        String result = strings.stream().reduce("-", String::concat);
        System.out.println(result);
        
        System.out.println("--------------");

        // max, min
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer maxx = list.stream().max(Integer::compare).get();
        Integer minn = list.stream().min(Integer::compare).get();
        System.out.println("Max: "+maxx+"\nMin: "+minn);

        System.out.println("--------------");

        // distinct
        List<Integer> list2 = Arrays.asList(1,2,2,2,2,3,4,5);
        list2.stream().distinct().forEach(System.out::println);

        System.out.println("--------------");

        // map
        list2.stream().distinct().map(i -> i*i).forEach(System.out::println);

        System.out.println("--------------");

        // filter
        List<Integer> list1 = Arrays.asList(1,2,2,2,2,3,4,5);
        list1.stream().distinct().filter(n -> n > 2).forEach(System.out::println);

        System.out.println("--------------");

        // sorted
        List<Integer> list3 = Arrays.asList(4,3,2,1,0,3,4,5);
        list3.stream().sorted().forEach(System.out::println);

        System.out.println("--------------");

        // limit
        list3.stream().limit(3).forEach(System.out::println);

        System.out.println("--------------");

        // skip
        list3.stream().skip(3).forEach(System.out::println);

        System.out.println("--------------");
        
        // parallel stream
        String streamString = strings.stream().reduce(" I'm-", String::concat);
        String parallelString = strings.parallelStream().reduce(" I'm-", String::concat);
        System.out.println("Stream: "+streamString +"\nParallelStream: "+parallelString);

    }
}
