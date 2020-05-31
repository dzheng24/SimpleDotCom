// Test code for the SimpleDotCom class

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); // instantiate a SimpleDotCom object

        int[] locations = {2, 3, 4}; // make an int array for the location of the DotCom (3 consecutive ints out of a possible 7)

        dot.setLocationCells(locations); // invoke the setter method on the DotCom

        String userGuess = "2"; // make a fake user guess

        String result = dot.checkYourself(userGuess); // invoke the checkYourself() method on the DotCom object, and pass it the fake guess

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed"; // if the fake guess(2) gives back a "hit", that means it's working!
        }
        System.out.println(testResult); // print out the test result (passed or failed)
    }

}