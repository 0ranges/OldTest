package DPshiyan.DP3;

/**
 * Created by user on 2018/1/14.
 */
public class Q11 {
    public static void main(String[] args) {
        Photograph photograph = new Photograph();
        Filter filter = (Filter)XMLUtil.getBean("filter");
        photograph.setFilter(filter);
        photograph.Show();
    }
}
interface Filter{
    public void beautify();
}
class MonochromaticFilter implements Filter {
    public void beautify() {
        System.out.println("调用单色滤镜~~");
        System.out.println("单色滤镜效果已显示~~");
    }
}
class NostalgicFilter implements Filter{
    public void beautify() {
        System.out.println("调用怀旧滤镜~~");
        System.out.println("怀旧滤镜效果已显示~~");
    }
}
class BlackWhiteFilter implements Filter{
    public void beautify() {
        System.out.println("调用黑白滤镜~~");
        System.out.println("黑白滤镜效果已显示~~");
    }
}
class Photograph{
    private Filter filter;
    public void Show(){
        System.out.println("图片正在加载");
        filter.beautify();
        System.out.println("显示完毕");
    }
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}