package prototype;

import java.io.*;

/**
 * 具体原型类,实现Cloneable,Serializable接口
 * Created by zhangss on 2017/5/31.
 */
public class UserPrototype implements Prototype, Cloneable, Serializable {

    private static final long serialVersionUID = 4318661223708344130L;

    private int age;

    private String name;

    private House house;

    public UserPrototype() {
    }

    public UserPrototype(String name, int age, House house) {
        this.name = name;
        this.age = age;
        this.house = house;
    }

    @Override
    public UserPrototype shallowClone() {
        UserPrototype temp;
        try {
            temp = (UserPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            temp = null;
        }
        return temp;
    }

    @Override
    public UserPrototype deepCloneByClone() {
        UserPrototype temp = null;
        try {
            temp = (UserPrototype) super.clone();
            temp.house = (House) this.house.clone();//引用对象也要进行clone
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public UserPrototype deepCloneBySerializable() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (UserPrototype) ois.readObject();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "UserPrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", house=" + house +
                '}';
    }
}
