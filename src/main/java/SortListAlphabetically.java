import java.util.List;
import java.util.stream.Collectors;

public class SortListAlphabetically {
    public static List<String> sort(List<String> strings) {
        return strings.stream().sorted().collect(Collectors.toList());
    }
}
