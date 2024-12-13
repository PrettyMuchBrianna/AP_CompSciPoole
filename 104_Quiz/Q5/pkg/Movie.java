package pkg;

public class Movie{
        String name;
        double rating;
        int numRate;
        int revenue;
        boolean compare;
    
    public Movie(){
        name="Avengers";
        rating=8.0;
        numRate=33;
        revenue=623357910;
    }
   
    public Movie(String name, double rating, int numRate, int revenue){
        this.name=name;
        this.rating=rating;
        this.numRate=numRate;
        this.revenue=revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: " + name);
        System.out.println("Rating:" + rating);
        System.out.println("Number of Ratings: " + numRate);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName(){
        return name;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double addRating(double r)
    {
        rating=(rating*numRate+r)/(numRate+1);
        return rating;
    }
    public double getRating(){
        return rating;
    }
    
    public boolean compareRatings(Movie b){
        double rating1= b.getRating();
        double rating2= b.getRating();
        if (rating1>rating2){
           boolean compare= true;
        }
        else {
            boolean compare=false;
        }
        return compare;
    }
    
    public String revenueToString(){
        int mil=(int)(revenue/1000000);
        int rev=revenue-mil*1000000;
        int thousands=(int)(rev/1000);
        rev=rev-thousands*1000;
        int tens=rev;
        return (mil+", "+ thousands+ ", "+ tens);
    }


}
