public class LoopWithoutLoop {
    public void printNumbers(int lowerBound, int upperBound){
        System.out.println(lowerBound++);
        if(lowerBound <= upperBound) {
            printNumbers(lowerBound, upperBound);
        }
    }
    public static void main(String[] args) {
        LoopWithoutLoop loop = new LoopWithoutLoop();
        loop.printNumbers(1,100);
    }
}