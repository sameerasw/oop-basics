public class Director {
    private String name;
    private String surName;
    private int numberOfMovies;
    private Date birthDate;

    public Director (String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    public String getName(){
        return name;
    }

    public String getSurName(){
        return surName;
    }

    public Date getDOB(){
        return birthDate;
    }

    public int getNumberOfMovies(){
        return numberOfMovies;
    }

    public void setDOB(Date dob){
        this.birthDate = dob;
    }

    public void setNumberOfMovies(int numberOfMovies){
        this.numberOfMovies = numberOfMovies;
    }

    public String toString(){
        return name + " " + surName + " " + birthDate + " " + numberOfMovies;
    }
}
