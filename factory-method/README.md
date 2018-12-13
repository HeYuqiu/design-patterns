# 工厂方法模式
这个和简单工厂有区别，简单工厂模式只有一个工厂，工厂方法模式对每一个产品都有相应的工厂。



下面例子中鼠标，键盘，耳麦为产品，惠普，戴尔为工厂。 

工厂模式也就是鼠标工厂是个父类，有生产鼠标这个接口。

戴尔鼠标工厂，惠普鼠标工厂继承它，可以分别生产戴尔鼠标，惠普鼠标。

生产哪种鼠标不再由参数决定，而是创建鼠标工厂时，由戴尔鼠标工厂创建。

后续直接调用鼠标工厂.生产鼠标()即可



![img](http://www.runoob.com/wp-content/uploads/2018/07/1530601917-1999-DP-Factory.png) 