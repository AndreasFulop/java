import java.util.Scanner;

public class M4_9constructor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();
        read.close();
        Ticket ticket = new Ticket(movie, row, seat);
        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
 }
  
 class Ticket {
    private String movie;
    private int row;
    private int seat;
  
    public Ticket(String movie, int row, int seat) {
        this.setMovie(movie);
        this.setRow(row);
        this.setSeat(seat);
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
    /* or (in the Ticket constructor) just: 
        this.movie = movie;
        this.row = row;
        this.seat = seat;
    and delete the 3 setter!
    */

    public String getMovie() {
        return movie;
    }
  
    public int getRow() {
        return row;
    }
  
    public int getSeat() {
        return seat;
     
    }
 }
 

