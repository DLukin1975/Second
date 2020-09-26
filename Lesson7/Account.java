package Lesson7;


public class Account {

    private int id;
    private String holder;
    private int amount = 0;


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

}
