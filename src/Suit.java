public enum Suit{

    CLUB(0),
    DIAMOND(1),
    HEART(2),
    SPADE(3);

    private final int suitNumber;
    public static String suit;


    //Enum Constructor
    Suit(int suitNumber) {
        this.suitNumber = suitNumber;
    }




    public static String num2suit(int x){

        switch(x){
            case 0:
                suit = "Clubs";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;

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

//    CLUB(0, "Clubs", "c"),
//    DIAMOND(1, "Diamonds", "d"),
//    HEART(2, "Hearts", "h"),
//    SPADE(3, "Spades", "s");

    //Enum Constructor
//    Suit(int suitNumber, String suitName, String suitAbv) {
//        this.suitNumber = suitNumber;
//        this.suitName = suitName;
//        this.suitAbv = suitAbv;
//    }
