import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class qrgenerator {

	public static void main(String[] args)  throws Exception
	{
				String details ="Shubhendra singh btech cse";
				ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
				File f =new File("C:\\Users\\HP\\Desktop\\javaprograms\\QR_Generator_Libs\\sp.jpg");
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(out.toByteArray());
				fos.flush();
				System.out.println("check in file qr code is generated");
				
		
		
		
		
	}

}
