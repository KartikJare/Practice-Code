import java.net.*;
import java.io.*;

class ChatServer
{
    public static void main(String Arg[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Marvellous Server is waiting at port number 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Srever Succesfully connect with client");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        pobj.println("Hello from serve");


        String str = bobj1.readLine();
        System.out.println("Message from client :"+str);

    }
}