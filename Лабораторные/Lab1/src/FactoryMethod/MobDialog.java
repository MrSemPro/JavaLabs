package FactoryMethod;

public class MobDialog extends AbstractDialog {
    public Button getButton() {
        return new MobButton();
    }
}
