class ScoreCalculation {
        
    int scoreAvg;
    String gradeLetter;
        
    public void calcAvg(int num1, int num2, int num3, int num4, int num5, int num6) { 
        int avg;
        avg =  ((num1+num2+num3+num4+num5+num6)/6);
        scoreAvg = avg;
    }
    
    public int getCalcAvg() {
        return scoreAvg;
    }

    public String getGrade() {
        return gradeLetter;
    }

    public void DetermineResults(int scoreAvg) {
        if ((scoreAvg<=100) && (scoreAvg >= 70)) {
            gradeLetter = "A";
        } else if 
            ((scoreAvg<=70) && (scoreAvg >= 60)) {
                gradeLetter = "B";
        } else if 
            ((scoreAvg<=60) && (scoreAvg >= 50)) {
                gradeLetter = "C";
        } else if 
            (scoreAvg <= 50) {
                gradeLetter = "F";
        } else {
            System.out.println("Error! Average score can't be over 100.");
        }
    }

    //static int result = calcAvg(40,40,40,40,40,40);
}