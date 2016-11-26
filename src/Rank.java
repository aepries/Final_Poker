public enum Rank{
    EMPTY(0, "Empty", "0"),
    LOWFACE(1, "One", "1" ),
    TWO(2,"Two", "2"),
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
    public int givenRank;

    Rank(int rankNumber, String rankName, String rankAbv) {
        this.rankNumber = rankNumber;
        this.rankName = rankName;
        this.rankAbv = rankAbv;

    }

  //num 2 rank
    public static String num2rank(int givenRank){

        switch(givenRank){
            case 1:
                x = EnumRank.LOWFACE.getRankAbv();
                break;
            case 2:
                x = EnumRank.TWO.getRankAbv();
                break;
            case 3:
                x = EnumRank.THREE.getRankAbv();
                break;
            case 4:
                x = EnumRank.FOUR.getRankAbv();
                break;
            case 5:
                x = EnumRank.FIVE.getRankAbv();
                break;
            case 6:
                x = EnumRank.SIX.getRankAbv();
                break;
            case 7:
                x = EnumRank.SEVEN.getRankAbv();
                break;
            case 8:
                x = EnumRank.EIGHT.getRankAbv();
                break;
            case 9:
                x = EnumRank.NINE.getRankAbv();
                break;
            case 10:
                x = EnumRank.TEN.getRankAbv();
                break;
            case 11:
                x = EnumRank.JACK.getRankAbv();
                break;
            case 12:
                x = EnumRank.QUEEN.getRankAbv();
                break;
            case 13:
                x = EnumRank.KING.getRankAbv();
                break;
            case 14:
                x = EnumRank.ACE.getRankAbv();
                break;
        }
        return x;

}














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