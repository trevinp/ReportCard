package com.example.android.reportcard;

public class ReportCard {
    private String mathGrade;
    private String englishGrade;
    private String historyGrade;
    private String gymGrade;

    public ReportCard() {
        mathGrade = "";
        englishGrade = "";
        historyGrade = "";
        gymGrade = "";
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public String getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        this.historyGrade = historyGrade;
    }

    public String getGymGrade() {
        return gymGrade;
    }

    public void setGymGrade(String gymGrade) {
        this.gymGrade = gymGrade;
    }

    @Override
    public String toString() {
        return "Report Card: " +
                "Math Grade = '" + mathGrade + '\'' +
                "English Grade ='" + englishGrade + '\'' +
                "History Grade = '" + historyGrade + '\'' +
                "Gym Grade = '" + gymGrade;
    }
}
