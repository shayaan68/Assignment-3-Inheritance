import Hoodie_Style.HoodieSize;
import Hoodie_Style.Hoodie_Colours;
import College.CollegeProgeramming;

//Access the HoodieStyle eumeration values
import static Hoodie_Style.Hoodie_Colours.*;
import static Hoodie_Style.HoodieSize.*;
import static College.CollegeProgeramming.*;

public class Main {
    public static void main(String[] args) throws Exception {
       //Create an array of hoodies//
       Hoodie[] inventoryHoodies = {
        new Hoodie(Hoodie_Colours.charcoal, HoodieSize.medium),
        new Hoodie(green, extraLarge),
        new Hoodie(grey, Large),
        new Hoodie(brown, Small)
        //Show current Inventory
        System.out.println("Here is the current inventory:");
        for(Hoodie item: inventoryHoodies)


       };
    }
}
