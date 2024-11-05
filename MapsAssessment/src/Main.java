import java.util.*;

public class Main {
    public static void main(String[] args) {

        ECGolfFiles ecf = new ECGolfFiles();
        Golfer golfer = new Golfer();
        Map<String,Golfer> cpMap1 = new HashMap<>(ecf.loadFile("Golf Map Data 1.txt"));
        Map<String,Golfer> cpMap2 = new HashMap<>(ecf.loadFile("Golf Map Data 2.txt"));
        Map<String,Golfer> cpMap3 = new HashMap<>();
        Map<String,Golfer> sortedMap1 = new TreeMap<>(cpMap1);
        Map<String,Golfer> sortedMap2 = new TreeMap<>(cpMap2);
        Map<String, Golfer> bckUpMap = new HashMap<>(cpMap1);

        // Show map has been filled with data
        System.out.println(cpMap1);

        // Print keys of map
        System.out.println("Keys for cpMap1");
        System.out.println("---------------------------");
        golfer.findKeys(cpMap1);

        // Print values of map
        System.out.println("---------------------------\n");
        System.out.println("Values for cpMap1");
        System.out.println("---------------------------");
        golfer.findValues(cpMap1);

        // Print the key value pairings
        System.out.println("---------------------------\n");
        System.out.println("****** Golfer Map Data ******");
        System.out.println("---------------------------");
        golfer.keyValues(cpMap1);

        // Display sum of all the golfers points
        System.out.println("---------------------------\n");
        System.out.println();
        System.out.println("Sum of Total Points in Table 1: " + golfer.sumTotalPoints(cpMap1));
        System.out.println("Sum of Total Points in Table 2: " + golfer.sumTotalPoints(cpMap2));

        // Determine which table has more points
        if(golfer.sumTotalPoints(cpMap1) > golfer.sumTotalPoints(cpMap2)){
            System.out.println("Table 1 has more points");
        }else{
            System.out.println("Table 2 has more points");

        }

        // Fine a golfers by entered key
        System.out.println("---------------------------");
        System.out.println("---------------------------\n");
        String key = "ROOYNIR";
        String key2 = "LEONGBR";
        Golfer foundGolfer = golfer.findGolferByKey(cpMap1, key);
        Golfer lostGolfer = golfer.findGolferByKey(cpMap1, key2);
        System.out.println("Searching for golfer with the key: " + key);
        System.out.println("Searching for golfer with the key " + key2);
        if (foundGolfer != null) {
            System.out.println("Found Golfer: " + foundGolfer.getName());
        } else {
            System.out.println("Golfer not found for key: " + key);
        }

        if (lostGolfer != null) {
            System.out.println("Found Golfer: " + lostGolfer.getName());
        } else {
            System.out.println("Golfer not found for key: " + key2);
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------\n");

        // Display total amount of American players in each table
        int totalUsaMap1 = golfer.totalUSAPlayers(cpMap1);
        int totalUsaMap2 = golfer.totalUSAPlayers(cpMap2);
        System.out.println("Total USA players in table 1: " + totalUsaMap1);
        System.out.println("Total USA players in table 2: " + totalUsaMap2);

        // Determine which table has the most American players
        if (totalUsaMap1 > totalUsaMap2) {
            System.out.println("Table 1 has more players from USA");
        } else {
            System.out.println("Table 2 has more players from USA");
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------\n");

        // Find Golfer with most events played in each table
        Golfer topGolferMap1 = golfer.findGolferWithMostEvents(cpMap1);
        Golfer topGolferMap2 = golfer.findGolferWithMostEvents(cpMap2);

        // Compare golfer with most events played from each table and display.
       if(topGolferMap1.getEvent() > topGolferMap2.getEvent()){
           System.out.println(topGolferMap1.getName()
                   + " Has played in the most events with "
                   + topGolferMap1.getEvent()
                   + " events played");
       }else {
           System.out.println(topGolferMap2.getName()
                   + " Has played in the most events with "
                   + topGolferMap2.getEvent()
                   + " events played");
       }

        System.out.println("---------------------------");
        System.out.println("---------------------------\n");

        // Find golfer with the least events played
        Golfer golferMinEvents1 = golfer.findGolferWithLeastEvents(cpMap1);
        Golfer golferMinEvents2 = golfer.findGolferWithLeastEvents(cpMap2);

        // Compare golfer with the least events played from each table and display.
        if(golferMinEvents1.getEvent() < golferMinEvents2.getEvent()){
            System.out.println(golferMinEvents1.getName()
                    + " Has played in the least events with "
                    + golferMinEvents1.getEvent()
                    + " events played");
        }else {
            System.out.println(golferMinEvents2.getName()
                    + " Has played in the least events with "
                    + golferMinEvents2.getEvent()
                    + " events played");
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------\n");

        // Add golfers from table 1 and 2 to a single map
        cpMap3.putAll(cpMap1);
        cpMap3.putAll(cpMap2);

        // Compute to find total amount of golfers
        int totalGolfers = cpMap3.size();
        System.out.println("Total number of unique golfers from table 1 and 2: " + totalGolfers);

        // Sort map by keys
        System.out.println("---------------------------");
        System.out.println("---------------------------\n");
        System.out.println("Table 1 sorted by keys");
        System.out.println(sortedMap1);

        // Sort map by keys
        System.out.println("---------------------------");
        System.out.println("---------------------------\n");
        System.out.println("Table 2 sorted by keys");
        System.out.println(sortedMap2);


        // Find all non-American golfers then add to a map, print that map,
        // then print the keys, values and the key value pairings
        Map<String,Golfer> nonAmericans = golfer.nonAmericanPlayers(cpMap3);
        System.out.println(" ");
        System.out.println("Map of all non American Players");
        System.out.println("---------------------------\n");
        System.out.println(nonAmericans);
        System.out.println(" ");
        System.out.println("Keys for Non-American Players");
        System.out.println("---------------------------\n");
        golfer.findKeys(nonAmericans);
        System.out.println(" ");
        System.out.println("Values for Non-American Players");
        System.out.println("---------------------------\n");
        golfer.findValues(nonAmericans);
        System.out.println("---------------------------\n");
        System.out.println("****** Non American Key and Values ******");
        System.out.println("---------------------------");
        golfer.keyValues(nonAmericans);

        // Calculate total points of all non-American playes
        System.out.println("---------------------------\n");
        System.out.println("Sum of Total Points of Non Americans: " + golfer.sumTotalPoints(nonAmericans));


        // remove any golfer with less than 45 events played
        cpMap3.entrySet().removeIf(entry -> entry.getValue().getEvent() < 45);
        System.out.println("---------------------------\n");
        System.out.println("Table of players with events less than 45 removed");
        System.out.println("---------------------------");
        System.out.println(cpMap3);

        // Empty maps
        cpMap1.clear();
        cpMap2.clear();

        // Show maps have been emptied
        System.out.println("Table 1 clear");
        System.out.println(cpMap1);
        System.out.println("Table 2 clear");
        System.out.println(cpMap2);

    }
}
