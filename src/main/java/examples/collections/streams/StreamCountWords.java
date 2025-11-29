package examples.collections.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCountWords {
    public static void main(String[] args) {
        
        String text = "apple banana apple orange apple banana";

        Map<String, Long> freq = 
            Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(
                    word -> word,
                    Collectors.counting()
                ));

        System.out.println(freq);  // {orange=1, banana=2, apple=3} 
    }
}
