package Hoodie_Style;

public enum HoodieSize {
    small(36,"S"), medium(40,"M"), 
    large(42, "L"),extraLarge(46, "XL");
    //Atrabuites
    private int myChestSize;
    private String mySizeCode;

    //Constructor
    HoodieSize(int myChestSize, int String mySizeCode);
        myChestSize = chestSize;
        mySizeCode = sizeCode;
    //Accessors
    public int chestSize(){return myChestSize;}
    public String sizeCode(){return mySizeCode;}
        return myChestSize;

    @Override
    public string toString(){return.String("X% (%d)", mySizeCode, myChestSize);}
    }

