public class SystemDemo {

    // throws IOException
    public static void main(String[] args) {
        try {
            int i = System.in.read();

            System.out.println(i);
            System.err.println(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}