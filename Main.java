class Ball{
    private String brand = "Addidas";
    private String getBrand(){return brand;}
}
class BasketBall extends Ball{
    String colour = "RED";
    double radius = 24.12d;
    public void diplay()
    {
        System.out.println("Colour is :"+colour);
        System.out.println("Radius is :"+radius);
        System.out.println("Ball Brand is :"+getBrand());
    }
}
class TennisBall extends Ball{
    String colour = "GREEN";
    double radius = 7.1d;
    public void diplay()
    {
        System.out.println("Colour is :"+colour);
        System.out.println("Radius is :"+radius);
        System.out.println("Ball Brand is :"+getBrand());
    }
}
class Bag{
    Ball ball;

    public static void addBall()
    {
        if(this.ball)
        {
            this.ball=ball;
            System.out.println("Ball Added Successfully");
        }
        else
            System.out.println("Ball Exists Already");
    }
    public static void removeBall()
    {
        if(this.ball!=null)
        {
            this.ball=ball;
            System.out.println("Ball Removed Successfully");
        }
        else
            System.out.println("Bag Is Already Empty");
    }
    public static void checkGame()
    {
        if(isBagEmpty())
            System.out.println("Bag Is Empty");
        else if (ball instanceof BasketBall)
        {

            BasketBall bb = (BasketBall)ball;
            bb.display();
        }
        else
        {
            TennisBall tb = (TennisBall)ball;
            tb.display();
        }

    }
    public static void isBagEmpty()
    {
        // if(ball==null)
        //  return true;
        // else
        //  return false;
        return(ball==null);
    }
}
 class BagDriver
 {
    public static void main(String[] args)
     {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean flag=true;
        Bag bag = new Bag(); 
        while (flag)
        {
        System.out.println("---------------------");
        System.out.println("1. Add Ball ");
        System.out.println("2. Remove Ball");
        System.out.println("3. Check Game");
        System.out.println("4. Is Empty ?");
        System.out.println("9. Exit");
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Enter Your Choice");
        int ch = sc.nextInt();
        switch(ch)
        {
        case 1: System.out.println("Which Ball ? \t 1. Basket Ball  \t 2. Tennis Ball");
            int ch = sc.nextInt();
            if(ch==1)
                bag.addBall(new BasketBall());
            else
                bag.addBall(new TennisBall());
            break;
        case 2: bag.removeBall();
            break;
        case 3: bag.checkGame();
            break;

        case 4: System.out.println(bag.isBagEmpty());
            break;

        case 5: flag = false; 
            break;

        default: System.out.println("Invalid choice");
        }
    }
}
 }