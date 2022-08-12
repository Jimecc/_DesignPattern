/**
 * @author Jim
 * @Description
 * @createTime 2022年08月12日
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}

// 完成Person的消息接受功能

/**
 * 优点：比较简单，容易想到
 * 缺点：如果要接收微信、短信则要增加新的类
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}