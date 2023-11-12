public class Loops {
    public static void main(String[] args) {
        Loops homework= new Loops();
    }

    public Loops(){
        countUp();
        System.out.println();
        countByThrees();
        System.out.println();
        System.out.println();
        countDown();
    }

    public void countUp(){
        for(int x=1; x<6; x=x+1){
            System.out.println(x);
        }
    }
    public void countByThrees(){
        for(int x=3; x<16; x=x+3){
            System.out.print(x + " ");
        }
    }
    public void countDown(){
        for(int x=10; x>0; x=x-1){
            System.out.print(x + ", ");
        }
        System.out.println("Happy Loop Year!");
    }

}
