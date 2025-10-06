package Exercices2;

public class MyChild extends MyAbstr{
    @Override
    public Integer buy() {
        Integer price = 1000 * 1;
        return price;
    }

    @Override
    public Integer sell() {
        Integer price = 1000 * 4;
        return price;
    }
}
