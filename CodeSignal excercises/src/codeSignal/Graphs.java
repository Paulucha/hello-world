package codeSignal;

public class Graphs {

    boolean newRoadSystem(boolean[][] roadRegister) {
        int counter = 0;
        for (int i = 0; i < roadRegister.length; i++) {
            for (int j = 0; j < roadRegister.length; j++) {
                if (roadRegister[0][i] == true && roadRegister[i][j] == true) {
                    counter = counter + 1;
                }

            }
        }
        if (counter % 2 == 0) {
            return true;
        }
        else return false;
    }

}
