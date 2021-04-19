package 不用继承用回调来实现模板模式;

/**
 * @author Yuqiu.He
 * @date 2021/4/19
 */
public class Main {
    public static void main(String[] args) {
        AbstractPutAnyAnimal tiger = new AbstractPutAnyAnimal();
        tiger.putRefrigerator(() -> {
            System.out.println("放老虎进冰箱");
        });
    }
}
