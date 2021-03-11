package task1;

public enum Gender {

    MALE("Cholovik"), FEMALE("Zhinka");

    String alias;

    Gender(String alias) {

        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "task1.Gender{" +
                "alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
