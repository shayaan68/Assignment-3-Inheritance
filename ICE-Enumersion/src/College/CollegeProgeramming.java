package College;

public enum CollegeProgeramming {
    cfnd( 1), cpgn(2), cpa( 3), csty(4);
    //Attrabuites
    private int myLength;

    //Consturtors
    CollegeProgeramming(int years) {myLength = years;}

    //Accesors
    public int length() {return myLength;}
    public String credential() {
        final String CREDS[] = {"", "Certificate", "Diploma", "Advanced Diploma"};
        return CREDS[myLength];
    }
    public String program() {
        String programName = null;
        switch (this){
            case cfnd:
                programName = "Computer Foundations";
                break;
            case cpgn:
                programName = "Computer Programming";
                break;
            case cpa:
                programName = "Computer Anaylistist";
                break;
            case csty:
                programName = "Comnputer Systems Technology";
                break;

        }
        return programName;

    }
    @Override
    public String toString() {return string("%s (%s)"), program(), credential()};
}
