package ar.com.algoritmos.bowling;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0 ; frame < 10 ; frame++) {
            if (rolls[frameIndex] == 10) {
                //Strike case.
                score = score + 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                frameIndex = frameIndex + 1;
            } else if (rolls[frameIndex] + rolls[frameIndex + 1] == 10) {
                //Spare case.
                score = score + 10 + rolls[frameIndex + 2];
                frameIndex = frameIndex + 2;
            } else {
                score = score + rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex = frameIndex + 2;
            }
        }

        return score;
    }

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }
}
