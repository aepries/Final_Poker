import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tester {



   public static void main(String args[]){
      Suit.num2suit(3);
      Rank.num2rank(3);
      System.out.println(Suit.suit + " " + Rank.rank);
   }



}
















/* for (Suit.EnumSuit x : Suit.EnumSuit.values()) {
            System.out.printf("The Suits are: %s \n" , x.getSuitName());

        }
        System.out.println("\n");
        for (Rank.EnumRank y : Rank.EnumRank.values()) {
            System.out.printf("The Ranks are: %s \n" , y.getRankName());*/