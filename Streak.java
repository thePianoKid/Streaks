/**
 * @author Gabriel Braden, Steampunk Robotics
 */

public class Streak {
    private String name;
    private int streak;
    private String disc;
    private CycleType cycleType;
    private int repition;

    /**
     * Streak
     * @param name name of the habit
     * @param disc discription the habit
     * @param cycleType one of three options: daily, weekly or monthly
     * @param repition number of repitions during the given cycle (ex: if repition = 2 and cycleType was DAILY, the habit would repeat twice daily)
     */
    public Streak(String name, String disc, CycleType cycleType, int repition) {
        this.name = name;
        this.streak = 0;
        this.disc = disc;
        this.cycleType = cycleType;
        this.repition = repition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public CycleType getCycleType() {
        return cycleType;
    }

    public void setCycleType(CycleType cycleType) {
        this.cycleType = cycleType;
    }

    public int getRepition() {
        return repition;
    }

    public void setRepition(int repition) {
        this.repition = repition;
    }

    public void incrementStreak() {
        streak++;
    }

    public void resetStreak() {
        streak = 0;
    }

    public int getStreak() {
        return streak;
    }

    public String toString() {
        String title = "> "+name+": "+streak;
        String subTitle1 = "    Discription: "+disc;

        String strCycle;
        if (cycleType.equals(CycleType.DAILY)) {
            strCycle = "daily";
        } else if (cycleType.equals(CycleType.WEEKLY)) {
            strCycle = "weekly";
        } else if (cycleType.equals(CycleType.MONTHLY)) {
            strCycle = "monthly";
        } else {
            strCycle = "undefined cycle type";
        }

        String subTitle2 = "    Cycle: "+repition+" "+strCycle;

        return title+"\n"+subTitle1+"\n"+subTitle2;
    }
}