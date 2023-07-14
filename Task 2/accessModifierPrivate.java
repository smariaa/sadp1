public class accessModifierPrivate
{
    private String studentName = "Matilda";
    public static void main(String[] args)
    {
        accessModifierPrivate myObj = new accessModifierPrivate();
        System.out.println("Name: " +myObj.studentName);
    }
}