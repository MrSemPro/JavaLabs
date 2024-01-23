package AbstractFabric.Mob;

import AbstractFabric.Button;
import AbstractFabric.Checkbox;
import AbstractFabric.FormElementFactory;
import AbstractFabric.Input;

public class MobFormElementFactory implements FormElementFactory {
    public Button createButton() {
        return new MobButton();
    }

    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    public Input createInput() {
        return new MobInput();
    }
}
