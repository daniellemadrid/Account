package model;

public class Account {
    private int availableLimit;
    private boolean activeCard;

    public Account(int availableLimit, boolean activeCard){
        this.availableLimit = availableLimit;
        this.activeCard = activeCard;
    }
    public int getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(int availableLimit) {
        this.availableLimit = availableLimit;
    }

    public boolean isActiveCard() {
        return activeCard;
    }

    public void setActiveCard(boolean activeCard) {
        this.activeCard = activeCard;
    }
}
