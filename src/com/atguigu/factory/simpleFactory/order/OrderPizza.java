import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jim
 * @Description 订购披萨
 * @createTime 2022年08月16日
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType ; // 订购 Pizza 类型
        do{
            orderType = gettype();
            if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");

            }else if("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else{
                break;
            }
            // 输出Pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    /**
     * 可以获取客户希望订购的Pizza类
     */

    private String gettype(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
