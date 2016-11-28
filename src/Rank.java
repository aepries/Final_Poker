public enum Rank {
    EMPTY(0, "Empty", "0"),
    LOWFACE(1, "One", "1"),
    TWO(2, "Two", "2"),
    THREE(3, "Three", "3"),
    FOUR(4, "Four", "4"),
    FIVE(5, "Five", "5"),
    SIX(6, "Six", "6"),
    SEVEN(7, "Seven", "7"),
    EIGHT(8, "Eight", "8"),
    NINE(9, "Nine", "9"),
    TEN(10, "Ten", "10"),
    JACK(11, "Jack", "J"),
    QUEEN(12, "Queen", "Q"),
    KING(13, "King", "K"),
    ACE(14, "Ace", "A");

    private final int rankNumber;
    private final String rankName;
    private final String rankAbv;
    public static String rank;
    //public




    Rank(int rankNumber, String rankName, String rankAbv) {
        this.rankNumber = rankNumber;
        this.rankName = rankName;
        this.rankAbv = rankAbv;
    }

    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

    //num 2 rank
    public static String num2rank(int y){

        switch(y){
            case 1:
                rank = "Low Ace";
                break;
            case 2:
                rank = "2";
                break;
            case 3:
                rank = "3";
                break;
            case 4:
                rank = "4";
                break;
            case 5:
                rank = "5";
                break;
            case 6:
                rank = "6";
                break;
            case 7:
                rank = "7";
                break;
            case 8:
                rank = "8";
                break;
            case 9:
                rank = "9";
                break;
            case 10:
                rank = "10";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            case 14:
                rank = "Ace";
                break;
        }
        return rank;
    }

}

  //num 2 rank
//    public static String num2rank(int givenRank){
//
//        switch(givenRank){
//            case 1:
//                rank = EnumRank.LOWFACE.getRankAbv();
//                break;
//            case 2:
//                rank = EnumRank.TWO.getRankAbv();
//                break;
//            case 3:
//                rank = EnumRank.THREE.getRankAbv();
//                break;
//            case 4:
//                rank = EnumRank.FOUR.getRankAbv();
//                break;
//            case 5:
//                rank = EnumRank.FIVE.getRankAbv();
//                break;
//            case 6:
//                rank = EnumRank.SIX.getRankAbv();
//                break;
//            case 7:
//                rank = EnumRank.SEVEN.getRankAbv();
//                break;
//            case 8:
//                rank = EnumRank.EIGHT.getRankAbv();
//                break;
//            case 9:
//                rank = EnumRank.NINE.getRankAbv();
//                break;
//            case 10:
//                rank = EnumRank.TEN.getRankAbv();
//                break;
//            case 11:
//                rank = EnumRank.JACK.getRankAbv();
//                break;
//            case 12:
//                rank = EnumRank.QUEEN.getRankAbv();
//                break;
//            case 13:
//                rank = EnumRank.KING.getRankAbv();
//                break;
//            case 14:
//                rank = EnumRank.ACE.getRankAbv();
//                break;
//        }
//        return x;
//
//}}














   /* public int getRankNumber() {
        return rankNumber;
    }
    public String getRankName() {
        return rankName;
    }
    public String getRankAbv() {
        return rankAbv;
    }

    public int getGivenRank() {
        return givenRank;
    }
*/