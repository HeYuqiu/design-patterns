package 不用继承用回调来实现模板模式;

/**
 * 用继承带来个问题：会创建很多的子类，没有没有办法不用创建类就能实现模板调用？但是是用回调callback
 *
 * @author Yuqiu.He
 * @date 2021/4/19
 */
public class AbstractPutAnyAnimal {
    // 定义模板
    public final void putRefrigerator(CallBack callBack) {
        openDoor();
        putAnyAnimal(callBack);
        closeDoor();
    }

    //在超类中实现共同的方法，由超类来处理
    private final void openDoor() {
        System.out.println("open the door");
    }

    private final void closeDoor() {
        System.out.println("close the door");
    }

    private final void putAnyAnimal(CallBack callBack) {
        callBack.putAnyAnimal();
    }
}
