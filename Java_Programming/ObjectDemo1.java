class Student
{
    public String Name;
    public int Rno;
    public int Marks;

    public Student(String str, int A, int B)
    {
        System.out.println("Insidde construtor");
        this.Name = str;
        this.Rno = A;
        this.Marks = B;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize methods");
    }
}

class ObjectDemo1
{
    public static void main(String A[])
    {
        Student sobj = new Student("saga",11,89);
        //Use of Oject
        sobj = null;
        System.gc();

    }
}