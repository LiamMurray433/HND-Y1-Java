public class Main {
    public static void main(String[] args) {

        // Variables
        String username;
        String password;
        String scoreBoard = "0.0";
        double score = 0.0;
        int points;
        double pointsD;

        String[] breederRoles = {"Judge", "Groomer"};
        // Adding a new admin
        Admin admin = new Admin("Liam", "1111");
        System.out.println(admin.toString());
        username = "Liam";
        password = "1111";
        boolean userExists = checkUserCredentials(username, password, admin);
        // Check
        if(userExists){
            System.out.println("You are logged in");
            System.out.println();
        }
        else{
            System.out.println("Wrong username or password");
        }

        // Adding new Breeds
        Breed husky = new Breed("Husky");
        Breed labrador = new Breed("Labrador");
        Breed beagle = new Breed("Beagle");
        System.out.println(husky.toString());
        System.out.println(labrador.toString());
        System.out.println(beagle.toString());
        System.out.println();


        // Add new Breeders
        Breeder breeder1 = new Breeder("John","Doe", "01/02/1955", "Edinburgh", "0123 2121 2387", breederRoles[0]);
        Breeder breeder2 = new Breeder("Jane", "Doe", "02/04/1991","Liverpool", "0131 556 3422",breederRoles[1]);
        Breeder breeder3 = new Breeder("Bob", "Lazar", "06/10/1978","Glasgow", "0131 556 3422",breederRoles[0]);
        System.out.println(breeder1.toString());
        System.out.println(breeder2.toString());
        System.out.println(breeder3.toString());

        System.out.println();

        // Add new trainers
        Trainer trainer1 = new Trainer("Mark", "Morrison","23/01/1991","Edinburgh","0141 9999 8743");
        Trainer trainer2 = new Trainer("Sarah","Anderson", "11/11/1941", "London","0165 2222 2222");
        Trainer trainer3 = new Trainer("Mia","McDonald", "23/12/1981", "Aberdeen","0235 3432 2334");
        System.out.println(trainer1.toString());
        System.out.println(trainer2.toString());
        System.out.println(trainer3.toString());
        System.out.println();

        // Add new dog
        Dog dog1 = new Dog("Ghost", "White and ginger","05/05/2017", "Male", husky,breeder1, trainer1);
        Dog dog2 = new Dog("Storm", "Black","12/12/2022", "Male", labrador,breeder2, trainer2);
        Dog dog3 = new Dog("Max", "White and others","06/08/2020", "Female", beagle,breeder2, trainer2);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println();


        // Add new Category
        Category category1 = new Category("Gundog Group");
        Category category2 = new Category("Hound Group");
        Category category3 = new Category("Pastoral Group");
        System.out.println(category1.toString());
        System.out.println(category2.toString());
        System.out.println(category3.toString());
        System.out.println(category1.toString());
        System.out.println(category2.toString());
        System.out.println();


        // Add new competitor
        Competitor competitor1 = new Competitor(category1,breeder1, dog1, scoreBoard);
        Competitor competitor2 = new Competitor(category2,breeder2, dog2, scoreBoard);
        Competitor competitor3 = new Competitor(category3,breeder3, dog3, scoreBoard);
        System.out.println(competitor1.toString());
        System.out.println(competitor2.toString());
        System.out.println(competitor3.toString());


        // Scoring competitors
        points = -10;
        try{
            checkScore(points);
        }catch (Exception e){
            System.out.println("The System cannot accept negative numbers");
            points = 0;
        }
        score += breeder1.addPoints(points);
        scoreBoard = Double.toString(score);
        competitor1 .setDogScore(scoreBoard);
        System.out.println(competitor1.toString());
        System.out.println("Judge " + breeder1.getName() + " Scored:" + points +" to " + competitor1.getDogName() + ".");

        score = 0;
        pointsD = 15.5;
        score += breeder1.addPoints(pointsD);
        scoreBoard = Double.toString(score);
        competitor2 .setDogScore(scoreBoard);
        System.out.println(competitor2.toString());
        System.out.println("Judge " + breeder1.getName() + " Scored:" + pointsD +" to " + competitor2.getDogName() + ".");



    }
    private static boolean checkUserCredentials(String username,String password, Admin admin){
        return(admin.getUsername().equals(username)) && (admin.getPassword().equals(password));
    }

    private static void checkScore(int points){
        if (points < 0){
            throw new ArithmeticException("The System cannot accept negative numbers....");
        }
    }
}