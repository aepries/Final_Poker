
public class Card {
    Rank rank;
    Suit suit;
    String abv;
    String a0;
    String a1;

    public Card(String a0, String a1) {
        this.a0 = abv.valueOf(rank.toString().charAt(0));
        this.a1 =  abv.valueOf(suit.toString().charAt(1));

        //RANKS
        switch (a0){
            case "1":
                this.rank = Rank.LOWFACE;
            case "2":
                this.rank = Rank.TWO;
            case "3":
                this.rank = Rank.THREE;
            case "4":
                this.rank = Rank.FOUR;
            case "5":
                this.rank = Rank.FIVE;
            case "6":
                this.rank = Rank.SIX;
            case "7":
                this.rank = Rank.SEVEN;
            case "8":
                this.rank = Rank.EIGHT;
            case "9":
                this.rank = Rank.NINE;
            case "10":
                this.rank = Rank.TEN;
            case "J":
                this.rank = Rank.JACK;
            case "Q":
                this.rank = Rank.QUEEN;
            case "K":
                this.rank = Rank.KING;
            case "A":
                this.rank = Rank.ACE;
        }

            //SUITS
            switch(a1) {
                case "C":
                    this.suit = Suit.CLUB;
                case "D":
                    this.suit = Suit.DIAMOND;
                case "H":
                    this.suit = Suit.HEART;
                case "S":
                    this.suit = Suit.SPADE;
                }


    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public String getAbv() {
        return a0 + a1;
    }

    public String getName(){
        return rank.name() + " of " + suit.name();
    }

    public void printCard(){
        System.out.println(getAbv() + " : " + getName());
    }


}


//    public Card(String a0, String a1) {
//        this.a0 = abv.valueOf(rank.toString().charAt(0));
//        this.a1 =  abv.valueOf(rank.toString().charAt(1));
//    }


//for (int i = 0; i <= 9; i++)
//        if (1 <= Integer.valueOf(a0) && Integer.valueOf(a0) <=9){
//        this.rank = Rank.values()[i];
//        }