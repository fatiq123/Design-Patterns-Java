package Creational.BuilderPattern;

public interface RequiredMaterial {

    String cementInAmount();

    abstract String material();

    default void info() {
        System.out.println(material());
    }

}


class MyHouse implements RequiredMaterial {
    @Override
    public String cementInAmount() {
        return "";
    }

    @Override
    public String material() {
        return "";
    }
}
