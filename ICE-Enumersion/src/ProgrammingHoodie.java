import Hoodie_Style.*;
import College.CollegeProgeramming;


public class ProgrammingHoodie extends Hoodie {
    //Attrabutes
    private CollegeProgeram myProgram, Hoodie_Colours colours, Hoodie_Size size){
        super(colour, size);
        myProgram = program;
    }
    //Accessors
    public String toString() {return String.Format("%s %s", myProgram.toString(), super.toString());}

}
