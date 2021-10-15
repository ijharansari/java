final class ImTab {
    private final String name;
    private final int age;
    ImTab(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Immutable {
    public static void main(String... args) {
        ImTab imTab = new ImTab("Ijhar ansari",26);
        System.out.println(imTab.getName());
    }
}