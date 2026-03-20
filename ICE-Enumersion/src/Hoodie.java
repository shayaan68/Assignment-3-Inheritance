import Hoodie_Style.*;

public class Hoodie {


    //Attrabutes

    private Hoodie Hoodie_Colours myColor;
    private Hoodie HoodieSize mySize;

    //consutortor
    public(Hoodie_Colours colours, HoodieSize size) {
        myColor = colour;
        mySize = size;

    }



    //accessor
    public String toString() {return String.format("Hoodie %s, %s", myColor, mySize);}
}

