import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Golfer 
 {
   
    private String name;
    private int Event;
    private double points;
    private String country;

    String key;


    public Golfer() {}

    public Golfer(String name, int Event,
                  double points, String country) 
     {

        this.name = name;
        this.Event = Event;
        this.points = points;
        this.country = country;
     }

    public String getName() { return name;}

    public void setName(String name) {this.name = name;}

    public int getEvent() {return Event;}

    public void setEvent(int Event) {this.Event = Event;}

    public double getPoints() {return points;}

    public void setPoints(double points) {this.points = points;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    public String getKey(){
       return key;
    }

    public String setKey(){

       int s1 = this.getName().length();
       s1 = s1-2;
       String golferKey = this.getName().substring(0,2).concat(this.getName().substring(s1)).toUpperCase();
       golferKey = golferKey + this.getCountry();
       return golferKey;
    }

    @Override
    public String toString() 
     {
        String tmp1;
        String tmp2;
        String tmp3;
        String tmp4;
        
        NumberFormat nf = new DecimalFormat("#0.00");
        
        tmp1 = String.format("%-25s", name); // use 25 spaces left aligned
        tmp2 = String.format("%-3s", Event);
        tmp3 = String.format("%-7s", nf.format(points));
        tmp4 = String.format("%-5s", country); // use 5 spaces left aligned
        
        return tmp1 + tmp2 + tmp3 + tmp4 + "\n";
     }


    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Golfer golfer = (Golfer) o;
       return Event == golfer.Event && Double.compare(points, golfer.points) == 0 && Objects.equals(name, golfer.name) && Objects.equals(country, golfer.country) && Objects.equals(key, golfer.key);
    }

    @Override
    public int hashCode() {
       int hash = Integer.parseInt(name);
       hash = 31 * hash + Objects.hashCode(this.getName());
       return hash;
    }


    // Method to get keys of a map to print them
    public void findKeys (Map<String,Golfer> golfer){
       Set<String> keys = golfer.keySet();
       for(String k : keys){
          System.out.println("Key = " + k);
       }
    }


    // Method to get values of a map to print them
    public void findValues (Map<String,Golfer> golfer){
       Collection<Golfer> values = golfer.values();
       for(Golfer k : values){
          System.out.println("Values = " + k);
       }
    }

    // Method for getting keys and values to print them
    public void keyValues(Map<String,Golfer> golfer){
       Set<Map.Entry<String,Golfer>> keyValues = golfer.entrySet();
       for(Map.Entry<String,Golfer> kv : keyValues){
          System.out.println(kv);
       }
    }


    // Calculate the sum of total points of all golfers in a map
    public double sumTotalPoints(Map<String, Golfer> golfers) {
       return golfers.values().stream()
               .mapToDouble(Golfer::getPoints)
               .sum();
    }

    // Find a golfer by key
    public Golfer findGolferByKey(Map<String, Golfer> golfers, String key) {
       return golfers.get(key);
    }

    // Find all players from USA
    public int totalUSAPlayers(Map<String,Golfer> golfers){
       return (int) golfers.values().stream()
               .filter(golfer -> "USA".equals(golfer.getCountry()))
               .count();

    }

    // Find golfer with most events played
    public Golfer findGolferWithMostEvents(Map<String, Golfer> golfers) {
       return golfers.values().stream()
               .max(Comparator.comparingInt(Golfer::getEvent))
               .orElse(null);
    }

    // Find golfer with the least events played
    public Golfer findGolferWithLeastEvents(Map<String, Golfer> golfers) {
       return golfers.values().stream()
               .min(Comparator.comparingInt(Golfer::getEvent))
               .orElse(null);
    }

    // Find all non-American players
    public Map<String,Golfer> nonAmericanPlayers (Map<String,Golfer> golfers){
       return golfers.entrySet().stream()
               .filter(entry -> !"USA".equals(entry.getValue().getCountry()))
               .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }


 }
