package FactoryMethod;

public class FactoryMethod {
    public void exec() {
        Configuration configuration = Configuration.initMob();

        switch (configuration.getPlatform()) {
            case (1):
                WebDialog mobileDialog = new WebDialog();
                mobileDialog.render();
                break;
            case (2):
                MobDialog webDialog = new MobDialog();
                webDialog.render();
                break;
            default:
                try {
                    throw new Exception("Не известный тип платформы");
                } catch (Exception e) {

                }
                break;
        }
    }
}
