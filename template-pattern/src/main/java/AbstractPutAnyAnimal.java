/**
 * @author Yuqiu.He
 * @date 2021/4/19
 */
public abstract class AbstractPutAnyAnimal {
    //这是一个模板方法，它是一个算法的模板，描述我们将动物放进冰箱的步骤，每一个方法代表了一个步骤
    // 定义模板
    public final void putRefrigerator() {
        openDoor();
        putAnyAnimal();
        closeDoor();
    }
    //在超类中实现共同的方法，由超类来处理
    public final void openDoor() {
        System.out.println("open the door");
    }
    public final void closeDoor() {
        System.out.println("close the door");
    }
    //每个子类可能有不同的方法,我们定义成抽象方法让子类去实现
    abstract void putAnyAnimal();
}
