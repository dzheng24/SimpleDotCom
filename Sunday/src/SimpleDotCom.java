public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess); // convert the String to an int

        String result = "miss"; // make a variable to hold the result to return; set "miss" as default

        for (int cell : locationCells) { // repeat with each cell in the locationCells array
          if (guess == cell) {
            result = "hit";
            numOfHits++;
            break; // get out of the loop, no need to test other cells
          }
        }

        if (numOfHits == locationCells.length) {
          result = "kill";
        }

        System.out.println(result);

        return result;
      }
}