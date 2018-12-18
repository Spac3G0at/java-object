public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstName = firstname;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        String state;
        if (this.isAware()) {
            state = "suis aware";
        } else {
            state = "ne suis pas aware";
        }
        return "Je m'appelle " + this.getFirstName() + " et je " + state;
    }

}
