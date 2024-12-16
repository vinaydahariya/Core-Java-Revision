package exception;

public class AgelnvalidException  extends RuntimeException
{
    public  AgelnvalidException(){
        super("Invalid Age !!");
    }
    public AgelnvalidException(String message){
        super(message);
    }
}
