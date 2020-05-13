import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {
    @Benchmark
    public void testArrayListAddMethod() {
        final List<Integer> intList = new ArrayList<Integer>();

        for (int i = 0; ++i < 1000000;)
            intList.add(i);
    }
    @Benchmark
    public void testLinkedListAddMethod() {
        final List<Integer> intList = new LinkedList<Integer>();

        for (int i = 0; ++i < 1000000;)
            intList.add(i);
    }
}
