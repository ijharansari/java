public class StaticBlock {
   static String name;
   StaticBlock staticBlock;
   String fname;
    static{
        name = "Ijhar ansari";
    }
    public static void main(String... args) {
        System.out.println(StaticBlock.name);
    }
}