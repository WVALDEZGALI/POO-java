package H_OOP;

public class Student {

    Integer score;

    public Student(Integer score){
        this.score = score;
    }

    public void studentScore(){
        if (score >= 60){
            System.out.println("The student passed with a score of " + score);
        }else {
            System.out.println("The student did not approve. His score was " + score);
        }
    }

}
