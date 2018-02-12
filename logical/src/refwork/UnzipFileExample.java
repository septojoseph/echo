package refwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFileExample 
{
	   public static void main(String[] args) 
	   {
	      File outputDir = new File("E:/OutputZipFolder");
	      // create output directory if it doesn't exist
	      if (!outputDir.exists()) 
	      {
	          outputDir.mkdirs();
	      }
	      FileInputStream fis;
	      // buffer for read and write data to file
	      byte[] buffer = new byte[1024];
	      int len;
	      try {
	          File inputZipFile = new File("E:/ZipFile.zip");
	          fis = new FileInputStream(inputZipFile);
	          ZipInputStream zis = new ZipInputStream(fis);
	          ZipEntry ze = zis.getNextEntry();
	         
	          while (ze != null) 
	          {
	              String fileName = ze.getName();
	              File newFile = new File(outputDir + File.separator + fileName);
	              System.out.println("Unzipping to " + newFile.getAbsolutePath());
	              // create directories for sub directories in zip
	              new File(newFile.getParent()).mkdirs();
	              FileOutputStream fos = new FileOutputStream(newFile);
	              while ((len = zis.read(buffer)) > 0) 
	              {
	                 fos.write(buffer, 0, len);
	              }
	              fos.close();
	              // close this ZipEntry
	              zis.closeEntry();
	              ze = zis.getNextEntry();
	          }
	          // close last ZipEntry
	          zis.closeEntry();
	          zis.close();
	          fis.close();
	      } catch (IOException e)
	      {
	          e.printStackTrace();
	      }
	      System.out.println("Done!!!");
	   }
	}
