public class Athlete {
    private String name;
    private String country;
    private int numGold;
    private int numSilver;
    private int numBronze;
    private int numTotal;
    
    public Athlete(String name, String country, int numGold, int numSilver, int numBronze, int numTotal) {
        this.name = name;
        this.country = country;
        this.numGold = numGold;
        this.numSilver = numSilver;
        this.numBronze = numBronze;
        this.numTotal = numTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumGold() {
        return numGold;
    }

    public void setNumGold(int numGold) {
        this.numGold = numGold;
    }

    public int getNumSilver() {
        return numSilver;
    }

    public void setNumSilver(int numSilver) {
        this.numSilver = numSilver;
    }

    public int getNumBronze() {
        return numBronze;
    }

    public void setNumBronze(int numBronze) {
        this.numBronze = numBronze;
    }

    public int getNumTotal() {
        return numTotal;
    }

    public void setNumTotal(int numTotal) {
        this.numTotal = numTotal;
    }

    @Override
    public String toString() {
        return "Athlete [name=" + name + ", country=" + country + ", numGold=" + numGold + ", numSilver=" + numSilver
                + ", numBronze=" + numBronze + ", numTotal=" + numTotal + "]";
    }

    


}
