package DPshiyan;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by user on 2017/12/23.
 */
public class XMLUtil {
    public static Object getBean(String name){
        try{
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src//DPshiyan//config.xml"));
            NodeList nodeList = document.getElementsByTagName(name);
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue().trim();
            Class c = Class.forName(className);
            Object o = c.newInstance();
            return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
