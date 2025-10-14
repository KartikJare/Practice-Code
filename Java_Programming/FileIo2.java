import java.io.*;

class FileIo2
{
    public static void main(String A[])
    {
        try
        {
            FileWriter fwobj = new FileWriter("MarvellousX.txt");
            fwobj.write("Pre-Placement Activity batch 53");
            fwobj.write(System.lineSeparator());
            fwobj.write("Logic buliding with Instutrial project development");//want to write on new line 
            fwobj.close();//close is needed
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured :"+obj);
        }    
        
    }
}