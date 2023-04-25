import java.io.FileInputStream;
import java.io.IOException;
public class ABC{
    public static void mian(String[] args){
        String fileName ="fis.txt";
        int bufferSize =1024;
        try (FileInputSteam inputStream =new FileInputStream(fileName)){
            int data;
            while((data =inputStream.read()) !=-1){
                System.out.println();

            byte[] buffer =new byte[bufferSize];
            int length;
            while ((length =inputStream.read(buffer))!=-1){
                System.out.printn(new String(buffer,0,length));
            }
        catch (IOException ex){
            System.out.println("读取文件出错："+ex.getMessage());
            ex.printStackTrace();
        }

        }
    }
}
}