package dto;

public class AccountDto {

    private int availableLimit;
    private boolean activeCard;

    public AccountDto(int availableLimit, boolean activeCard){
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

