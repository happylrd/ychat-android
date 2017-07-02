package io.happylrd.ychat;

import android.text.TextUtils;

public class Presenter implements IPresenter {

    private IView mView;

    public Presenter(IView view) {
        mView = view;
    }

    @Override
    public void search() {
        // start ui loading

        String inputStr = mView.getInputString();
        if (TextUtils.isEmpty(inputStr)) {
            return;
        }

        int hashCode = inputStr.hashCode();

        IUserService service = new UserService();
        String serviceResult = service.search(hashCode);

        String result = "Result:" + inputStr + "-" + serviceResult;

        // close ui loading

        mView.setResultString(result);
    }
}
