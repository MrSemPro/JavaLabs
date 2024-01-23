package FactoryMethod;

public class WebDialog extends AbstractDialog{
    public Button getButton() {
        return new WebButton();
    }
}
