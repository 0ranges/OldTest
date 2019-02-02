package DPshiyan.DP3;

/**
 * Created by user on 2018/1/4.
 */
public class Q02 {
    public static void main(String[] args) {
        AbstractFacade abstractFacade;
        abstractFacade = (AbstractFacade)XMLUtil.getBean("abstractFacade");
        abstractFacade.excute();
    }
}
class DataAnalysis{
    public void analysis(){
        System.out.println("数据分析完成！");
    }
}
class ReadFile{
    public void read(){
        System.out.println("文件读取完成！");
    }
}
class ReportShow{
    public void show(){
        System.out.println("数据显示完成！");
    }
}
class TransferToXML{
    public void transfer(){
        System.out.println("文件转换为XML格式完成！");
    }
}
abstract class AbstractFacade{
    public abstract void excute();
}
class NotXMLFacade extends AbstractFacade{
    private DataAnalysis dataAnalysis = new DataAnalysis();
    private ReadFile readFile = new ReadFile();
    private ReportShow reportShow = new ReportShow();
    private TransferToXML transferToXML = new TransferToXML();
    public void excute(){
        readFile.read();
        transferToXML.transfer();
        dataAnalysis.analysis();
        reportShow.show();
    }
}
class XMLFacade extends AbstractFacade{
    private DataAnalysis dataAnalysis = new DataAnalysis();
    private ReadFile readFile = new ReadFile();
    private ReportShow reportShow = new ReportShow();
    public void excute(){
        readFile.read();
        System.out.println("该文件为XML格式，不需要进行转换。");
        dataAnalysis.analysis();
        reportShow.show();
    }
}