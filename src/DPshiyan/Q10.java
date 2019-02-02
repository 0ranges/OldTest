package DPshiyan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017/12/24.
 */
public class Q10 {
    public static void main(String[] args) {
        ZongBu zb = new ZongBu();
        JiaoXueDian jxd = new JiaoXueDian();
        jxd.add(new JiaoWu());
        jxd.add(new XingZheng());
        FenXiao fx = new FenXiao();
        fx.add(jxd);
        zb.add(fx);
        zb.add(new JiaoWu());
        zb.add(new XingZheng());
        zb.sendFile();
    }
}
abstract class OA{
    public abstract void sendFile();
}
abstract class Educational extends OA{
    public List<OA> oa = new ArrayList<>();
    public void add(OA element){
        oa.add(element);
    }
    public void sendFile(){
        for(int i = 0;i<oa.size();i++)
            oa.get(i).sendFile();
    }
    public void remove(OA element){
        oa.remove(element);
    }
    public OA get(int index){
        return oa.get(index);
    }
    public Collection<OA> getOA(){
        if(oa == null)
            oa = new ArrayList<>();
        return oa;
    }
    public Iterator getIteratorOA(){
        if(oa == null)
            oa = new ArrayList<>();
        return oa.iterator();
    }
    public void setOA(Collection<OA> newOA){
        removeAllOA();
        for(Iterator iterator = newOA.iterator();iterator.hasNext();)
            add((OA)iterator.next());
    }
    public void addOA(OA newOA){
        if(newOA == null)
            return;
        if(this.oa == null)
            this.oa = new ArrayList<>();
        if(!this.oa.contains(newOA))
            oa.add(newOA);
    }
    public void removeOA(OA oldOA){
        if(oldOA == null)
            return;
        if(this.oa != null)
            if(this.oa.contains(oldOA))
                this.oa.remove(oldOA);
    }
    public void removeAllOA(){
        if(oa != null)
            oa.clear();
    }
}
class ZongBu extends Educational{
    public void sendFile(){
        System.out.println("总部下发公布");
        super.sendFile();
    }
}
class FenXiao extends Educational{
    public void sendFile(){
        System.out.println("分校下发公布");
        super.sendFile();
    }
}
class JiaoXueDian extends Educational{
    public void sendFile(){
        System.out.println("教学点下发公布");
        super.sendFile();
    }
}
abstract class Offices extends OA{

}
class JiaoWu extends Offices{
    public void sendFile(){
        System.out.println("教务办公室下发公布");
    }
}
class XingZheng extends Offices{
    public void sendFile(){
        System.out.println("行政办公室下发公布");
    }
}