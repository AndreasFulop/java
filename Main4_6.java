public class Main4_6 {
    public static void main(String[] args) {
    //James
    Worker worker1 = new Worker();
    worker1.name = "James";
    worker1.salary = 200000;

    //Tom
    Worker worker2 = new Worker();
    worker2.name = "Tom";
    worker2.salary = 150000;        

    System.out.println(CalculateTotalSalary(worker1.salary,worker2.salary));
    }   

    static int CalculateTotalSalary(int w1, int w2){
        return(w1 + w2);
    }
}
class Worker{
    String name;
    int salary;
}

