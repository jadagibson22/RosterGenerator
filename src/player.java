import java.util.*;

public class player {
        private int jerseyNumber;
        private int rating;
        public player(int n, int rn) {
            // TODO Auto-generated constructor stub
            this.jerseyNumber=n;
            this.rating=rn;
        }
        public int getJerseyNumber() {
            return jerseyNumber;
        }
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }
        public int getRating() {
            return rating;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }
        public String toString() {
            return "player jersey : " +this.jerseyNumber+ "player rating : " +this.rating;
        }
    }


