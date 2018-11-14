package com.developer.mylibrary;

import android.widget.EditText;

/**
 * Created by Maulik Gautam on 11/14/2018
 */
public class Common {

    public static boolean isEmptyEdittext(EditText editText){
        return editText.getText().toString().trim().length()<=0;
    }

}
