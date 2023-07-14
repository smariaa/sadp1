class Animal
{
    protected String type = "Australian";
    public void sound()
    {
        System.out.println("moo!");
    }
}

class Mammal extends Animal
{
    private String name = "Cow";
    public static void main(String[] args)
    {
        Mammal myMammal = new Mammal();
        myMammal.sound();
        System.out.println(myMammal.type + " " + myMammal.name);
    }
}