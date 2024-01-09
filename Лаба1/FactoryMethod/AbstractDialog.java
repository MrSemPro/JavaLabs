package FactoryMethod;

abstract public class AbstractDialog implements Dialog{
    // Фабричный метод
    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }
}
