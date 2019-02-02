package DPshiyan;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by user on 2017/12/12.
 */
public class Q03 {
    public static void main(String[] args) {
        ImageReader reader;
        ImageReaderFactory factory;
        factory = (ImageReaderFactory)XMLUtil.getBean("ReaderFactory");
        reader = factory.produceImageReader();
        reader.readImage();
    }
}
interface ImageReader{
    public void readImage();
}
class JpgReader implements ImageReader{
    public void readImage(){
        System.out.println("read jpg image.");
    }
}
class GifReader implements ImageReader{
    public void readImage(){
        System.out.println("read gif image.");
    }
}
interface ImageReaderFactory{
    public ImageReader produceImageReader();
}
class JpgReaderFactory implements ImageReaderFactory{
    public ImageReader produceImageReader(){
        System.out.println("jpg reader");
        return new JpgReader();
    }
}
class GifReaderFactory implements ImageReaderFactory{
    public ImageReader produceImageReader(){
        System.out.println("gif reader");
        return new GifReader();
    }
}