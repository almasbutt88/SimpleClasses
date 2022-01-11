public class Printer {
    private int sheets;
    private double toner;

    public Printer(int sheets, int toner) {
        this.sheets= sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public double getToner() {
        return toner;
    }

    public void setToner(double toner) {
        this.toner = toner;
    }


    public void print(int pages, int copies) {
        if(this.sheets >= pages*copies){
            this.setSheets(this.sheets-pages*copies);
            this.setToner(this.toner-pages*copies);
        }
    }
}
