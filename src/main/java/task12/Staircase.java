package task12;

public class Staircase {
    public static String drawStaircase(final int numberOfLevel) {

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= numberOfLevel; i++) {
            int spaces = numberOfLevel - i;
            int hashes = i;
            output.append(".".repeat(spaces)).append("#".repeat(hashes)).append("\n");
        }
        System.out.println();
        return output.toString().strip().replace("."," ");
    }
}
