public class OOPSBanner {
    public static void main(String[] args) {

        // Store banner lines in an array
        String[] banner = {
            " OOOOO   OOOOO   PPPPP   SSSSS ",
            "O     O O     O  P    P  S     ",
            "O     O O     O  PPPPP    SSSS ",
            "O     O O     O  P            S",
            " OOOOO   OOOOO   P       SSSSS "
        };

        // Loop through array and print each line
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}