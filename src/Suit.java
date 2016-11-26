public enum Suit{

    CLUB(0, "Clubs", "c"),
    DIAMOND(1, "Diamonds", "d"),
    HEART(2, "Hearts", "h"),
    SPADE(3, "Spades", "s");

    private final int suitNumber;
    private final String suitName;
    private final String suitAbv;
    public int s;
    public String suit;


    //Enum Constructor
    Suit(int suitNumber, String suitName, String suitAbv) {
        this.suitNumber = suitNumber;
        this.suitName = suitName;
        this.suitAbv = suitAbv;
    }


    public static String num2suit(int s){
         switch {
            case 0:
                suit = "Clubs";
        }

return suit;
    }






}


/*
    public int getSuitNumber() { //suitNum
        return this.suitNumber;
    }
    public String getSuitName(){ //SuitName
        return this.suitName;
    }
    public String getSuitAbv(){ return this.suitAbv;
    }*/
