package Lesson7;


public class Account {

    private int id;
    private String holder;
    private int amount = 0;

    public Account() {
    }

    public Account(Integer id, String holder) {
        this.id = id;
        this.holder = holder;
    }

    public Account(Integer id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
