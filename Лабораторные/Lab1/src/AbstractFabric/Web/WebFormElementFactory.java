package AbstractFabric.Web;

import AbstractFabric.Button;
import AbstractFabric.Checkbox;
import AbstractFabric.FormElementFactory;
import AbstractFabric.Input;


public class WebFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new WebButton();
    }

    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    public Input createInput() {
        return new WebInput();
    }
}
