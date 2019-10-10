public class Homework {
    String first_name;
    String last_name;
    String job_title;

    public Homework(String first_name, String last_name,String job_title)
    { this.first_name=first_name;
        this.last_name=last_name;
        this.job_title=job_title; }

    public String getFirst_name()
    {return first_name;}

    public String getLast_name()
    {return last_name;}

    public String getJob_title()
    {return job_title;}

    public String toString()
    { return ("Hello, I'm " + this.getFirst_name() + " " + this.getLast_name() + ".\nI'm " + this.getJob_title()+ ".");}

    public static void main(String[] args)
    {Homework Rita = new Homework("Rita","Dijokaite","Business Analyst");
    System.out.println(Rita.toString());}
    }
