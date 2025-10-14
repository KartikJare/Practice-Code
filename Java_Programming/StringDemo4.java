class StringDemo4
{
    public static void main(String A[])
    {
        String s1 = "Hello";

        String s2 = new String("Hello");

        if(s1 == s2)
        {
            System.out.println("Strings are equal usig ==");
        }
        else
        {
            System.out.println("Strings are not equal using ==");
        }

        if(s1.equals(s2))
        {
            System.out.println("Strings are equal using equals methods");
        }
        else
        {
            System.out.println("Strings are not equal using equals menthods");
        }
    }
}