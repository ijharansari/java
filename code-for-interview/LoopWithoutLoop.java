public class LoopWithoutLoop {
    public void printNumbers(int lowerBound, int upperBound){
        System.out.println(lowerBound++);
        if(lowerBound <= upperBound) {
            printNumbers(lowerBound, upperBound);
        }
    }

    public void printNumbers(int upperBound) {
        printNumbers(1,upperBound);
    }
    
    public static void main(String[] args) {
        LoopWithoutLoop loop = new LoopWithoutLoop();
        loop.printNumbers(50);
    }
}