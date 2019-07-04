
import java.util.Optional;

class Twofer {
    String twofer(String name) {
        Optional<String> checkNull = Optional.ofNullable(name);
        name = (checkNull.isEmpty()) ? "you" : name;
        return String.format("One for %s, one for me.", name);
    }
}
