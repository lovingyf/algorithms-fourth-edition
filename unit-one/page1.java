/**
 * @author ：lovngiyf
 * @date ：Created in 2020/9/15
 * @version: IntelliJ IDEA 2020.2
 */
/*计算两个非负整数p和q的最大公约数
 * */
public class page1 {
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }
}
