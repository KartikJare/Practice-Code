import java.io.*;

class FileIo1
{
    public static void main(String A[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");//File class

        if(fobj.createNewFile())
        {
            System.out.println("File is succesfully created");
            FileWriter fwobj = new FileWriter("Marvellous.txt");
            int ret = fwobj.write("Pre-Placement Activity batch 53");
            System.out.println(ret);
        }
        else
        {
            System.out.println("Unable to create file");
        }
    }
}