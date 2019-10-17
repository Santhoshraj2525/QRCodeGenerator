package QuickResponse;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class MyFirstQRCode {

	public static void main(String[] args) throws Exception {
		String details = "Hello Guys...today dinner is Idly, Coconut Chutney and Puthina Chutney";
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		File f = new File("E:\\Selenium\\QRGen\\Dinner.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();

	}

}
