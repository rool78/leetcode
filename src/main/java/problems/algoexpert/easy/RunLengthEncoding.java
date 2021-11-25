package problems.algoexpert.easy;

    public class RunLengthEncoding {

    public String runLengthEncoding(String string) {
        if (string.isEmpty())
            return "";
        StringBuilder result = new StringBuilder();
        char runChar = string.charAt(0);
        int runCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (runChar == string.charAt(i))
                runCounter++;
            if (runChar != string.charAt(i)) {
                endRun(result, runChar, runCounter);
                runChar = string.charAt(i);
                runCounter = 1;
            }
            if (string.length() == i + 1) {
                endRun(result, runChar, runCounter);
            }
        }
        return result.toString();
    }

    private void endRun(StringBuilder result, char beginRun, int runCounter) {
        while (runCounter > 0) {
            if (runCounter > 9) {
                result.append("9").append(beginRun);
                runCounter -= 9;
            } else {
                result.append(runCounter).append(beginRun);
                break;
            }
        }

    }

}
