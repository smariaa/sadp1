class Student
{
    int studentId = 213;
}

class Girl extends Student
{
    private float point = 3.5f;
    public static void main(String[] args)
    {
        Girl myObj = new Girl();
        System.out.println("Id: " + myObj.studentId);
        System.out.println("Gpa: " + myObj.point);
    }
}