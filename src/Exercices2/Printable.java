package Exercices2;

public interface Printable {
    public void setMargin();
    public void setOrientation();
    public void setTest();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

abstract class NewsPaper extends Paper { //Line 12
    public void setMargin() {}


    //Line 14

}
