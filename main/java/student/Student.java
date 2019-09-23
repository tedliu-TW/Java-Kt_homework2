package student;

public class Student { //sub
    String id;
    String name;
    int english;
    int math;
    static int pass =60;

    public Student(String name, int english, int math) { //alt+ Ins
        this.name = name;
        this.english = english;
        this.math = math;
    }



    public int highest(){
        return (english>math) ? english:math;
    }

    public void print(){
         int average = getAverage();
        System.out.println(name + "\t"+english +"\t"+math+"\t"
                +getAverage()+"\t"+((getAverage()>=pass)? "PASS":"FAILED")
        );
        char grading ='F';
        switch (average/10){
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
            default:
                grading='F';
        }



    }



    public int getAverage(){return (english+math)/2;}


}
