public class Conditionals {
    public static void main(String[] args) {
        Conditionals myCode = new Conditionals();
    }
    public Conditionals(){
        String question = "Is chocolate ice cream better than vanilla ice cream?";
        System.out.println(question);
        int randomInt;
        randomInt = (int)(Math.random() *11);

        if (randomInt<1.1){
            System.out.println("Most Likely");
        }else if (randomInt<2.1){
            System.out.println("Obviously Not");
        }else if (randomInt<3.1){
            System.out.println("100%");
        }else if (randomInt<4.1){
            System.out.println("No and it never will be");
        }else if (randomInt<5.1){
            System.out.println("I'm not telling you");
        }else if (randomInt<6.1){
            System.out.println("Decide for yourself");
        }else if (randomInt<7.1){
            System.out.println("Ask me again later");
        }else if (randomInt<8.1){
            System.out.println("Yes of course how could you even ask that");
        }else if (randomInt<9.1){
            System.out.println("Go eat some ice cream and let me know");
        }else {
            System.out.println("Strawberry is better than either of them");
        }

    }
}

