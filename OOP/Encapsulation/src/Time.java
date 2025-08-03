// B26
public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24)
                    hour = 0;
            }              
        }
    }
    public void previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1)
                    hour = 23;
            }              
        }
    }
    public void display() {
        String hour = "";
        String minute = "";
        String second = "";
        if (this.hour < 10)
            hour = "0" + this.hour;
        else
            hour = this.hour + "";
        if (this.minute < 10)
            minute = "0" + this.minute;
        else
            minute = this.minute + "";
        if (this.second < 10)
            second = "0" + this.second;
        else
            second = this.second + "";
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
