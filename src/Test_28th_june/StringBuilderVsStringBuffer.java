package Test_28th_june;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        int iterations = 1000;
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += i;
        }
        long end1 = System.currentTimeMillis();
        long stringTime = end1 - start1;
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        long builderTime = end2 - start2;
        long start3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(i);
        }
        long end3 = System.currentTimeMillis();
        long bufferTime = end3 - start3;
        System.out.println("Performance Comparison for " + iterations + " iterations:");
        System.out.println("String: " + stringTime + " ms");
        System.out.println("StringBuilder: " + builderTime + " ms");
        System.out.println("StringBuffer: " + bufferTime + " ms");
    }
}
