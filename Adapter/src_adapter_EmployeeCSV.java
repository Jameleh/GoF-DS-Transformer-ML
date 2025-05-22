package adapter;

public class EmployeeCSV {
    int num;
    String n;
    String l;
    String yahooMail;

    public EmployeeCSV(int num, String n, String l, String yahooMail) {
        this.num = num;
        this.n = n;
        this.l = l;
        this.yahooMail = yahooMail;
    }

    public int getNum() {
        return num;
    }

    public String getN() {
        return n;
    }

    public String getL() {
        return l;
    }

    public String getYahooMail() {
        return yahooMail;
    }

}
