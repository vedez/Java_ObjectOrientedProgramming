package Labs.week_01;
/* 
 * INCOMPLETE
*/
public class Main
{

    public static void cat()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch(a, cat());
    }

    public void Cat()
    {
        // Making an instance of Cat called Ginger
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() >= 0)
        {
            cat.kill();
        }    
    }

    public static void main(String[] args)
    {
        cat();
    }

}
