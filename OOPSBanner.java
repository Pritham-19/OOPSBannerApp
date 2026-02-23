public class OOPSBanner {
    public static void main(String[] args) {
        
        String line1 = " OOOOO   OOOOO   PPPPP   SSSSS ";
        String line2 = "O     O O     O  P    P  S     ";
        String line3 = "O     O O     O  PPPPP    SSSS  ";
        String line4 = "O     O O     O  P            S ";
        String line5 = " OOOOO   OOOOO   P       SSSSS  ";
        
        String banner = String.join("\n", line1, line2, line3, line4, line5);
        
        System.out.println(banner);
    }
}